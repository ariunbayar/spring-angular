# Sample 5 - Consuming REST

 This application uses Spring’s `RestTemplate` to retrieve a random Spring Boot quotation at http://localhost:8080/api/random.

## Prerequisites

*   Java Development Kit (JDK) 17 or later
*   Gradle 7.x or later (or use the included Gradle Wrapper `./gradlew`)

## Building the Project

To build the application JAR file, navigate to the project's root directory in your terminal and run:

```bash
./gradlew build
```

This command will compile the code, run tests, and package the application into an executable JAR file located in the build/libs/ directory.

## Running the Application

The quoters application uses the default server port, 8080, so this application cannot also use the same port.
You can run the application using the Gradle BootRun plugin by providing the port number as an argument:

```bash
./gradlew bootRun --args='--server.port=9000'
```

Alternatively, you can run the packaged JAR file directly (after building it):

```bash
java -jar build/libs/consumerrest-0.0.1-SNAPSHOT.jar --server.port=9000
```
