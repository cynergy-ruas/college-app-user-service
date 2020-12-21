# college-app-user-service
The microservice that handles user related operations for the college app

## Development
Run the service by:

```
$ MONGODB_URI=<mongo-uri> ./mvnw spring-boot:run
```

contact repo admin for the mongodb uri.

## Production

Build the docker image using,
```
$ ./mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=cynergyruas/ruas-app:user-service-0.0.1
```

To run the docker container,
```
$ docker run -p 8080:8080 -e MONGODB_URI=<mongo-uri> userservice:0.0.1
```