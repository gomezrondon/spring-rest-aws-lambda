# spring-gcp-Run
Yes I now the name of the project say aws lambda...  :P

Testing a Rest spring boot app and run it on GCP cloud Run

1) Create the container:
cd into the project
gradle jibDockerBuild --image=spring-gcp-run:1.0.0

2) To run the container (using docker compose):
docker-compose up -d

3) To stop the container (using docker compose):
docker-compose down