# docker-scale-demo

SpringBoot demo application presenting the capibilities of scaling apps with "docker-compose scale app=X" command.

All instances share a common visit counter stored in Redis.

Request to "http://localhost:80" prints the greeting message with the id of the host responding for the request and the current state of the shared counter.

Usage:

docker-compose up -d -> Brings Redis, SpringBoot App and HAProxy to life.
docker-compose scale app=10 -> Brings the other 9 instances of the SpringBoot App and starts to delegate the request using    roundrobin algorithm by default.

IMPROTANT: Detecting new nodes takes some time for HAProxy. Be patient.
