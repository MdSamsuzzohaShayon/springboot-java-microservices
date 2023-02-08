 # Springboot Microservices
 - [Tutorial playlist](https://www.youtube.com/watch?v=9XI8lknaJzM&list=PL3NrzZBjk6m_n8QZCdnF7Yax36cqWkO9j&index=2)
 - [Documentation Overview](https://docs.spring.io/spring-boot/docs/current/reference/html/documentation.html#documentation.first-steps)
 - [Getting help](https://docs.spring.io/spring-boot/docs/current/reference/html/getting-help.html#getting-help)
 - [Spring Boot Reference Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/index.html)
 - Building an Application with [Spring Boot](https://spring.io/guides/gs/spring-boot/)
 - Getting [Started Guides](https://spring.io/guides)
 - Starting with [Spring Initializr](https://start.spring.io/)
 - [Spring Boot Tutorial](https://www.javatpoint.com/spring-boot-tutorial)
 - [Spring cloud](https://spring.io/projects/spring-cloud) [tutorial](https://www.javatpoint.com/spring-cloud)
 - [Microservices with Spring](https://spring.io/blog/2015/07/14/microservices-with-spring) [tutorial](https://www.javatpoint.com/microservices)

### Properties
 - Spring Boot Framework comes with a built-in mechanism for [application configuration](https://www.javatpoint.com/spring-boot-properties) using a file called application.properties. It is located inside the src/main/resources folder.
 - [Various properties](https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html) can be specified inside your application.properties file, inside your application.yml file, or as command line switches. This appendix provides a list of common Spring Boot properties and references to the underlying classes that consume them.
 - Property contributions can come from additional jar files on your classpath, so you should not consider this an exhaustive list. Also, you can define your own properties.

### Beans
 - All of your application components (@Component, @Service, @Repository, @Controller, and others) are automatically registered as [Spring Beans](https://docs.spring.io/spring-boot/docs/current/reference/html/using.html#using.spring-beans-and-dependency-injection).
 - If a bean has more than one constructor, you will need to mark the one you want Spring to use with @Autowired


### Dependencies
 - **Spring Web** WEB  Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.
 - **Spring Boot DevTools** DEVELOPER TOOLS Provides fast application restarts, LiveReload, and configurations for enhanced development experience.
 - **MySQL Driver** SQL  MySQL JDBC driver. 
 - **Spring Data JPA** SQL Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate. Using this dependency a database connection from application.properties will be established
 - 

### Annotations
 - [Annotations for binding requests to controllers and handler methods as well as for binding request parameters to method arguments.](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/package-summary.html)
 - [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/#initial), [JPA Annotations - Hibernate Annotations](https://www.digitalocean.com/community/tutorials/jpa-hibernate-annotations)


### Database
 - Create database `CREATE DATABASE employee_service;`
 - Create employee table manually
   ```
   CREATE TABLE employee(
        id INT NOT NULL AUTO_INCREMENT,
        name VARCHAR(45) NULL,
        email VARCHAR(45) NULL,
        bloodroup VARCHAR(45) NULL,
        PRIMARY KEY(ID)
   );
   ```

### API Endpoints
 - Get a employee `/employees/1` with `curl http://localhost:8080/employees/1`
    
