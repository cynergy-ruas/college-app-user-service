FROM adoptopenjdk/openjdk8:alpine-slim

ARG DEPENDENCY=target/dependency

RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

WORKDIR /opt/app

COPY ${DEPENDENCY}/BOOT-INF/lib lib
COPY ${DEPENDENCY}/META-INF META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes app

ENTRYPOINT java -cp app:/opt/app/lib/* io.github.cynergy.userservice.UserServiceApplication
