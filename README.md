# quarkus-postgres-sample

This project uses Quarkus, the Supersonic Subatomic Java Framework.

## Running the application in dev mode

- Start dev Postgres database server using Docker:

```
docker run -it -p 5432:5432 -e POSTGRES_PASSWORD=postgres -d postgres:alpine
```

- Run the application in dev mode that enables live coding using:

```
./mvnw compile quarkus:dev
```

## Packaging and running the application

The application is packageable using `./mvnw package`.
It produces the executable `quarkus-postgres-sample-1.0.0-SNAPSHOT-runner.jar` file in `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/quarkus-postgres-sample-1.0.0-SNAPSHOT-runner.jar`.

## Creating a native executable

You can create a native executable using: `./mvnw package -Pnative`.

Or you can use Docker to build the native executable using: `./mvnw package -Pnative -Dquarkus.native.container-build=true`.

You can then execute your binary: `./target/quarkus-postgres-sample-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image-guide .