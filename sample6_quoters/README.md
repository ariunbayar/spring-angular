# Sample 6 - Quoters API

This is a simple Spring Boot application demonstrating a RESTful API for retrieving quotes using Spring Data JPA.

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

You can run the application using the Gradle BootRun plugin:

```bash
./gradlew bootRun
```

Alternatively, you can run the packaged JAR file directly (after building it):

```bash
java -jar build/libs/sample6_quoters-0.0.1-SNAPSHOT.jar
```

The application will start, and the embedded server (likely Tomcat) will listen on the configured port (default is 8080). The DatabaseLoader will populate the database with initial quote data upon startup.

## Usage - API Endpoint

The application exposes a single REST endpoint to retrieve a quote by its ID.

### Get Quote by ID

* URL: /api/{id}
* Method: GET
* URL Parameters:
    * id=[long]: The ID of the quote you want to retrieve.
* Success Response:
    * Code: 200 OK
    * Content Example (for ID 1):
```json
{
  "type": "success",
  "value": {
    "id": 1,
    "quote": "Working with Spring Boot is like pair-programming with the Spring developers."
  }
}
```

* Error Response (Quote Not Found):
    * Code: 200 OK
    * Content Example (for non-existent ID 99):
```json
{
  "type": "not found",
  "value": {
    "id": null,
    "quote": ""
  }
}
```

Example using curl (assuming the application is running locally on port 8080):

```bash
# Get quote with ID 1
curl http://localhost:8080/api/1

# Try to get a non-existent quote
curl http://localhost:8080/api/99
```
