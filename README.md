# ODS
This is a demo to illustrate following items
  - creation of customer, account, transaction and customerupdate topics
  - Updation , join and enrichment of Ktables 
  
  Step1 - start the Kafka cluster - by running 1-start-kafka-cluster-container.cmd file
  Step2 - create the topics - by running 2-create-topic.cmd
  Step3 - run the main application - KTableJoinDemo.java
  Step4 - start the 3-start-customer-producer-1.cmd and refer the sample data
  Step5 - start the 4-start-account-producer.cmd and refer the sample data
  Step6 - start the 6-start-CustomerUpdatePhone-producer-2.cmd
  Step7 - start the 5-start-transaction-producer.cmd
  
  Note: you can see the logs in the KTableJoinDemo.java running window.
  
  Important Note: delete the 'tmp' folder once you clone your project. This folder will contain the local kafka data.
  
