package guru.learningjournal.kafka.examples;

import guru.learningjournal.kafka.examples.serde.AppSerdes;
import guru.learningjournal.kafka.examples.types.*;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Properties;


public class KTableJoinDemo {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        Properties props = new Properties();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, AppConfigs.applicationID);
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, AppConfigs.bootstrapServers);
        props.put(StreamsConfig.STATE_DIR_CONFIG, AppConfigs.stateStoreName);
        props.put(StreamsConfig.COMMIT_INTERVAL_MS_CONFIG, 0);

        StreamsBuilder streamsBuilder = new StreamsBuilder();
        KTable<String, UserDetails> KT0 = streamsBuilder.table(AppConfigs.customerTopic,
                Consumed.with(AppSerdes.String(), AppSerdes.UserDetails())
        );

        KTable<String, AccountDetails> KT2 = streamsBuilder.table(AppConfigs.accountTopic,
                Consumed.with(AppSerdes.String(), AppSerdes.AccountDetails())
        );
        KTable<String, TransactionDetails> KT1 = streamsBuilder.table(AppConfigs.transactionTopic,
                Consumed.with(AppSerdes.String(), AppSerdes.TransactionDetails())
        );
        KTable<String, UserUpdateDetails> KT3 = streamsBuilder.table(AppConfigs.customerUpdateTopic,
                Consumed.with(AppSerdes.String(), AppSerdes.UserUpdateDetails())
        );


        KT0.toStream().print(Printed.toSysOut());
        KT1.toStream().print(Printed.toSysOut());
        KT2.toStream().print(Printed.toSysOut());

        // Customer updating the phone number
        KT0.join(KT3, (v1, v2) -> {
            v1.setPhoneNumber(v2.getPhoneNumber());
            return v1;
        }).toStream().print(Printed.toSysOut());

        // Balance amount update after transaction
        KT2.join(KT1, (v1, v2) -> {
            v1.setAvailableBalance(v1.getAvailableBalance()-v2.getAmount());
            v1.setAvailableFunds(v1.getAvailableFunds()-v2.getAmount());
            return v1;
        }).toStream().print(Printed.toSysOut());
        /*KT0.join(KT1, (v1, v2) -> {
            v1.setLastLogin(v2.getCreatedTime());
            return v1;
        }).toStream().print(Printed.toSysOut());*/

        logger.info("Starting Stream...");
        KafkaStreams streams = new KafkaStreams(streamsBuilder.build(), props);
        streams.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            logger.info("Stopping Streams...");
            streams.close();
        }));

    }
}