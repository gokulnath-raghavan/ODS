package guru.learningjournal.kafka.examples.serde;

import guru.learningjournal.kafka.examples.types.*;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;

import java.util.HashMap;
import java.util.Map;

public class AppSerdes extends Serdes {

    static final class TransactionDetailsSerde extends WrapperSerde<TransactionDetails> {
        TransactionDetailsSerde() {
            super(new JsonSerializer<>(), new JsonDeserializer<>());
        }
    }

    public static TransactionDetailsSerde TransactionDetails() {
        TransactionDetailsSerde serde = new TransactionDetailsSerde();

        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put(JsonDeserializer.VALUE_CLASS_NAME_CONFIG, TransactionDetails.class);
        serde.configure(serdeConfigs, false);

        return serde;
    }

    static final class UserUpdateDetailsSerde extends WrapperSerde<UserUpdateDetails> {
        UserUpdateDetailsSerde() {
            super(new JsonSerializer<>(), new JsonDeserializer<>());
        }
    }

    public static Serde<UserUpdateDetails> UserUpdateDetails() {
        UserUpdateDetailsSerde serde = new UserUpdateDetailsSerde();

        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put(JsonDeserializer.VALUE_CLASS_NAME_CONFIG, UserUpdateDetails.class);
        serde.configure(serdeConfigs, false);

        return serde;

    }
    static final class AccountDetailsSerde extends WrapperSerde<AccountDetails> {
        AccountDetailsSerde() {
            super(new JsonSerializer<>(), new JsonDeserializer<>());
        }
    }

    public static Serde<AccountDetails> AccountDetails() {
        AccountDetailsSerde serde = new AccountDetailsSerde();

        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put(JsonDeserializer.VALUE_CLASS_NAME_CONFIG, AccountDetails.class);
        serde.configure(serdeConfigs, false);

        return serde;
    }
    static final class UserDetailsSerde extends WrapperSerde<UserDetails> {
        UserDetailsSerde() {
            super(new JsonSerializer<>(), new JsonDeserializer<>());
        }
    }

    public static Serde<UserDetails> UserDetails() {
        UserDetailsSerde serde = new UserDetailsSerde();

        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put(JsonDeserializer.VALUE_CLASS_NAME_CONFIG, UserDetails.class);
        serde.configure(serdeConfigs, false);

        return serde;
    }

    static final class UserLoginSerde extends WrapperSerde<UserLogin> {
        UserLoginSerde() {
            super(new JsonSerializer<>(), new JsonDeserializer<>());
        }
    }

    public static Serde<UserLogin> UserLogin() {
        UserLoginSerde serde = new UserLoginSerde();

        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put(JsonDeserializer.VALUE_CLASS_NAME_CONFIG, UserLogin.class);
        serde.configure(serdeConfigs, false);

        return serde;
    }

}