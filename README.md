## Introduction to Spring Web-MVC.

Here is REST API for a songs catalog that needs to be completed.

### Prerequisites

1. Download [glassfish](http://download.java.net/glassfish/4.1.1/release/glassfish-4.1.1.zip)
2. Unzip the archive, and start the server: ` ./bin/asadmin start-domain`

### How to run?

1. Execute `./mvnw clean package`
2. Check if the WAR archive `target/SongsCatalogRestService.war` exists
3. Launch the admin [console](http://localhost:4848/) of glassfish
4. Go to:
  * Applications
  * Deploy
  * Choose File (Packaged File ...)
  * `target/SongsCatalogRestService.war`
  * OK
5. The REST API is now available at: localhost:8080/SongsCatalogRestService/song/...


### How to test?

1. Use curl (and find the parameters)
2. Or use [Postman](https://www.getpostman.com/)

### For the brave

1. Check [Swagger](http://swagger.io/)
2. Generate the API documentation
3. Automatically generate a client
