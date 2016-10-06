## REST API for a songs catalog

--

## REST API?

* GET: retrieve a resource
* POST: create a resource
* PUT: update a resource
* DELETE: delete a resource

More details [here](http://stackoverflow.com/questions/671118/what-exactly-is-restful-programming).

--

## Project

* Fork the project: [mcolmant/IFI-SongsCatalog](https://github.com/mcolmant/IFI-SongsCatalog)

--

## Contents

--

* `pom.xml`
* `fil.iagl.ifi.configuration`
* `fil.iagl.ifi.controller`
* `fil.iagl.ifi.model`
* `fil.iagl.ifi.service`

--

`configuration.SongsCatalogInitializer`

* Init. the configuration (`SongsCatalogConfiguration`)
* Map servlets to URL (`/`)

--

`configuration.SongsCatalogConfiguration`

* java-based (could be also done in XML files...)
* `@ComponentScan(basePackages...)`: auto-scan classes in given packages

--

`controller.SongsCatalogController`

* `@RestController`: REST, return in the body response
* `@Autowired`: auto-scan
* `RequestBody`: request to the annotated parameter
* `ResponseEntity`: HTTP response
* `@PathVariable`: URI variable (`{}`)
* `MediaType`: Request/response type

--

`pom.xml`

```
<artifactId>spring-webmvc</artifactId>
<artifactId>spring-tx</artifactId>
<artifactId>jackson-databind</artifactId>
<artifactId>javax.servlet-api</artifactId>
<artifactId>commons-logging</artifactId>
```

---

## API done?

* Create a pull request
