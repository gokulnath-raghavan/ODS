kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 3 --partitions 2 --topic customer & kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 3 --partitions 2 --topic transaction & kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 3 --partitions 2 --topic account & kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 3 --partitions 2 --topic customerUpdate