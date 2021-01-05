# Spring cloud stream demo project:
Project contains three applications:
- cloud-stream-app: contains a supplier that produces  messages to kafka topic (all bindings in application.yml);
- cloud-stream-process-app: contains a function that receives messages from cloud-stream-app, transforms and sends them to another kafka topic (all bindings in application.yml);
- cloud-stream-consumer-app: contains a consumer that receives messages from cloud-stream-process-app and prints them (all bindings in application.yml);

zookeeper and kafka could be run by docker-compose.yml in the root of this project.