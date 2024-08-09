# Student Service

A simple REST API for testing practice
---

#### To run the service issue the below commands from the repository home:

1. `mvn clean package`
2. `docker build --tag student-service:0.1 .`
3. `docker compose up -d`

#### To stop the service, issue below command from the repository home:

- `docker compose down`

#### To remove image:

- `docker rmi student-service:0.1`

