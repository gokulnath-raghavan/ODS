package guru.learningjournal.kafka.examples;

class AppConfigs {

    public final static String applicationID = "KTableJoinDemo";
    public final static String bootstrapServers = "localhost:9092,localhost:9093";
    public final static String customerTopic = "customer";
    public final static String accountTopic = "account";
    public final static String customerUpdateTopic = "customerUpdate";
    public final static String transactionTopic = "transaction";
    public final static String stateStoreName = "tmp/state-store";
}
