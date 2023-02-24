 # Springboot Microservices
 - [Tutorial playlist](https://www.youtube.com/watch?v=9XI8lknaJzM&list=PL3NrzZBjk6m_n8QZCdnF7Yax36cqWkO9j&index=2)
 - [Documentation Overview](https://docs.spring.io/spring-boot/docs/current/reference/html/documentation.html#documentation.first-steps)
 - [Getting help](https://docs.spring.io/spring-boot/docs/current/reference/html/getting-help.html#getting-help)
 - [Spring Boot Reference Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/index.html)
 - Building an Application with [Spring Boot](https://spring.io/guides/gs/spring-boot/), Create [restful api](https://spring.io/guides/gs/rest-service/) with springboot
 - Getting [Started Guides](https://spring.io/guides), [Create project with visual studio code](https://spring.io/guides/gs/guides-with-vscode/), [Using intellij idea](https://spring.io/guides/gs/intellij-idea/), [Using eclpise with spring tool suite](https://www.eclipse.org/community/eclipse_newsletter/2018/february/springboot.php)
 - Spring Data JPA - [Reference Documentation](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
 - Starting with [Spring Initializr](https://start.spring.io/), another way is to [clone initial project from github](https://github.com/spring-guides/getting-started-guides#reveal-maven)
 - [Spring Boot Tutorial](https://www.javatpoint.com/spring-boot-tutorial)
 - [Spring cloud](https://spring.io/projects/spring-cloud) [tutorial](https://www.javatpoint.com/spring-cloud)
 - [Microservices with Spring](https://spring.io/blog/2015/07/14/microservices-with-spring) [tutorial](https://www.javatpoint.com/microservices)
 - [Filter chain](https://docs.spring.io/spring-security/reference/servlet/architecture.html#servlet-securityfilterchain) 1) all requests should be authenticated 2) If the request is not authenticated, a web page shown 3) CSRF on POST and PUT

### basic of springboot
 - Spring Boot uses Commons Logging for all internal [logging](https://docs.spring.io/spring-boot/docs/2.1.13.RELEASE/reference/html/boot-features-logging.html) but leaves the underlying log implementation open. 
 - Although Spring Boot supports seamless integration with custom validators, the de-facto standard for performing [validation](https://www.baeldung.com/spring-boot-bean-validation) is Hibernate Validator.
 - To [trigger validation](https://docs.spring.io/spring-framework/docs/3.0.x/spring-framework-reference/html/validation.html) of a @Controller input, simply annotate the input argument as @Valid
 - [REST and Method-Level Security](https://www.baeldung.com/exception-handling-for-rest-with-spring)
 - [springdoc-openapi](https://springdoc.org/) java library helps to automate the generation of API documentation using spring boot projects. springdoc-openapi works by examining an application at runtime to infer API semantics based on spring configurations, class structure and various annotations. get the docs __http://localhost:8080/swagger-ui/index.html__
 - [Spring Boot supports localized messages](https://docs.spring.io/spring-boot/docs/2.1.13.RELEASE/reference/html/boot-features-internationalization.html) so that your application can cater to users of different language preferences. By default, Spring Boot looks for the presence of a messages resource bundle at the root of the classpath.
 - add [internationalization](https://www.baeldung.com/spring-boot-internationalization) to a Spring Boot application
 - tackle the [versioning](https://www.baeldung.com/rest-versioning) problem - 1) URI Versioning – version the URI space using version indicators, 2)Media Type Versioning – version the Representation of the Resource
 - This project provides some APIs to ease [creating REST representations](https://spring.io/guides/gs/rest-hateoas/) that follow the [HATEOAS](https://docs.spring.io/spring-hateoas/docs/current/reference/html/) principle when working with Spring and especially Spring MVC. 
 - Implementing [Static Filtering for RESTful Services](https://www.javatpoint.com/restful-web-services-static-filtering), Implementing [Dynamic Filtering for RESTful Services](https://www.javatpoint.com/restful-web-services-dynamic-filtering)
 - [An actuator is a manufacturing term](https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html) that refers to a mechanical device for moving or controlling something. Actuators can generate a large amount of motion from a small change.
 - [Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/) is a sub-project of Spring Boot. It adds several production grade services to your application with little effort on your part. 
 - Actuator links __http://localhost:8080/actuator__
 - using the HAL browser, we'll explore our REST API and discover how to traverse the data contained within. __http://localhost:8080/actuator__
 - Process of creating a simple web application with [resources](https://docs.spring.io/spring-security/reference/index.html) that are protected by [Spring Security](https://spring.io/guides/gs/securing-web/). Spring Security is a framework that provides authentication, authorization, and protection against common attacks. Spring security password can be found on the console
 - Make a request with basic auth in order to access protected route `curl --location 'http://localhost:8080/jpa/users' --header 'Authorization: Basic dXNlcm5hbWU6cGFzc3dvcmQ='`

### Jpa and hidernate
 - H2 database has an [embedded GUI](https://www.baeldung.com/spring-boot-h2-database) console for browsing the contents of a database and running SQL queries.
 - Spring [JdbcTemplate](https://www.javatpoint.com/spring-JdbcTemplate-tutorial) is a powerful [mechanism](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/jdbc/core/JdbcTemplate.html) to connect to the database and execute SQL queries.
 - [Insert](https://www.tutorialspoint.com/springjdbc/springjdbc_create_query.htm) a few records in a Table. [delete](https://www.tutorialspoint.com/springjdbc/springjdbc_delete_query.htm) one of the available records in a Table.
 - [Customize the Base Repository](https://docs.spring.io/spring-data/jdbc/docs/current/reference/html/#repositories.customize-base-repository) 
 - [Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/) provides repository support for the Jakarta Persistence API (JPA). [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/#initial), [JPA Annotations - Hibernate Annotations](https://www.digitalocean.com/community/tutorials/jpa-hibernate-annotations) 

### Web Services
 - Webservice - Software system designed to support interaction over a network. 3 keys are,
    1. Designed for machine-to-machine (or a application-to-application) interaction
    2. Should be interoperable (Not platformdependent).
    3. Should allow communication over a network

### Springboot restAPI
 - [REST API](https://github.com/in28minutes/spring-microservices-v2/tree/main/02.restful-web-services) step by step code
 -

### Explanation
 - Spring is one of the most popular [Java EE frameworks](https://www.geeksforgeeks.org/spring-service-annotation-with-example/). It is an open-source lightweight framework that allows Java EE 7 developers to build simple, reliable, and scalable enterprise applications. This framework mainly focuses on providing various ways to help you manage your business objects. It made the development of Web applications much easier than compared to classic Java frameworks and application programming interfaces (APIs), such as Java database connectivity (JDBC), JavaServer Pages(JSP), and Java Servlet. This framework uses various new techniques such as Aspect-Oriented Programming (AOP), Plain Old Java Object (POJO), and dependency injection (DI), to develop enterprise applications. Now talking about Spring Annotation.


 - Spring Annotations are a form of metadata that provides data about a program. Annotations are used to provide supplemental information about a program. It does not have a direct effect on the operation of the code they annotate. It does not change the action of the compiled program. 

### Maven
 - [Building Java Projects with Maven](https://spring.io/guides/gs/maven/)
 - [Maven Respository](https://mvnrepository.com)
 - */src/main/java* has the source code, */src/main/resources* has all the configurations, */src/test/java* for writing unit tests, *pom.xml* has all the dependencies
 - Before running maven project always clean, validate, and compile
 - Running project via terminal `./mvnw spring-boot:run` alternativly if maven is installed locally `mvn spring-boot:run`

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




### Microservice communication
 - here are several ways to communicate
    1. [WebClient:](Non-blocking, reactive client to perform HTTP requests, exposing a fluent, reactive API over underlying HTTP client libraries such as Reactor Netty.) Non-blocking, reactive client to perform HTTP requests, exposing a fluent, reactive API over underlying HTTP client libraries such as Reactor Netty. [reactive web client introduced in Spring 5](https://www.baeldung.com/spring-5-webclient). Simply put, WebClient is an interface representing the main entry point for performing web requests. It was created as part of the Spring Web Reactive module and will be replacing the classic RestTemplate in these scenarios. In addition, the new client is a reactive, non-blocking solution that works over the HTTP/1.1 protocol.
    2. [Rest Template: ](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/client/RestTemplate.html) Synchronous client to perform HTTP requests, exposing a simple, template method API over underlying HTTP client libraries such as the JDK HttpURLConnection, Apache HttpComponents, and others. RestTemplate offers templates for common scenarios by HTTP method, in addition to the generalized exchange and execute methods that support less frequent cases. Rest Template is used to create applications that consume RESTful Web Services. You can use the exchange() method to consume the [web services for all HTTP methods](https://www.tutorialspoint.com/spring_boot/spring_boot_rest_template.htm). 
    3. [OpenFeign (*Recommended*)](https://spring.io/projects/spring-cloud-openfeign): This project provides OpenFeign integrations for Spring Boot apps through autoconfiguration and binding to the Spring Environment and other Spring programming model idioms.
 - Scaling application - when we will get enourmus amount of incoming requests, it will be diffucult to handle all the requests at once, as a solution to this run same server multiple times with [load balancer](https://spring.io/guides/gs/spring-cloud-loadbalancer/), therefore, requests of clients will be distributed to different server. 
 - In order to create load balancer we need dynamic ports. Running a service multiple time with [dynamic port](https://www.youtube.com/watch?v=a2EZxkwMrjU&t=1635s). instead of defining a fixed port, [we can let the Spring Boot application run on a random](https://www.baeldung.com/spring-boot-running-port) port by setting “0” as the value of the “server.port” property. 
 - This part of the documentation covers support for [reactive-stack web applications](https://docs.spring.io/spring-framework/docs/current/reference/html/web-reactive.html) built on a Reactive Streams API to run on non-blocking servers, such as Netty, Undertow, and Servlet containers. 
 - [Webflux dependency](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-webflux)
 - [Load balancing](https://www.baeldung.com/spring-cloud-load-balancer) is the process of distributing traffic among different instances of the same application.
    1. [Ribbon is a client-side load balancer](https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-ribbon.html#:~:text=Ribbon%20is%20a%20client%2Dside,that%20of%20the%20named%20client.) that gives you a lot of control over the behavior of HTTP and TCP clients. Feign already uses Ribbon, so, if you use @FeignClient, this section also applies.
    2. Client-Side Load-Balancing with [Spring Cloud LoadBalancer](https://spring.io/guides/gs/spring-cloud-loadbalancer/) You will build a microservice application that uses Spring Cloud LoadBalancer to provide client-side load-balancing in calls to another microservice.

### Service Registration and Discovery
 - [Client-side service discovery](https://www.baeldung.com/spring-cloud-netflix-eureka) allows services to find and communicate with each other without hard-coding the hostname and port. The only ‘fixed point' in such an architecture is the service registry, with which each service has to register.
 - [Spring boot client werice discovery](https://www.youtube.com/watch?v=Mamsx7RQocU&list=PL3NrzZBjk6m_n8QZCdnF7Yax36cqWkO9j&index=5): 1) netflix eureka *(Recommended)* 2) Zookeeper 3) Consul
 - [set up a Netflix Eureka service registry](https://spring.io/guides/gs/service-registration-and-discovery/) and then build a client that both registers itself with the registry and uses it to resolve its own host. A service registry is useful because it enables client-side load-balancing and decouples service providers from consumers without the need for DNS.
 - [Server side service discovery](https://www.youtube.com/watch?v=Mamsx7RQocU&list=PL3NrzZBjk6m_n8QZCdnF7Yax36cqWkO9j&index=5): 1) Nginx 2) AWS ELB

### Eureka
 - [Eureka Server](https://www.tutorialspoint.com/spring_boot/spring_boot_eureka_server.htm#:~:text=Eureka%20Server%20is%20an%20application,also%20known%20as%20Discovery%20Server.) is an application that holds the information about all client-service applications. Every Micro service will register into the Eureka server and Eureka server knows all the client applications running on each port and IP address. Eureka Server is also known as Discovery Server.
 - [Start a Eureka Service Registry]https://spring.io/guides/gs/service-registration-and-discovery/ - You first need a Eureka Service registry. You can use Spring Cloud’s @EnableEurekaServer to stand up a registry with which other applications can communicate. This is a regular Spring Boot application with one annotation (@EnableEurekaServer) added to enable the service registry. 
 - [Include Eureka Server](https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-eureka-server.html) To include Eureka Server in your project, use the starter with a group ID of org.springframework.cloud and an artifact ID of spring-cloud-starter-netflix-eureka-server. See the Spring Cloud Project page for details on setting up your build system with the current Spring Cloud Release Train.
 - Eureka [default port](https://www.baeldung.com/spring-boot-change-port) is `8761`, 
 - In every 30 seconds [it makes a request (sync)](https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-eureka-server.html#spring-cloud-eureka-server-peer-awareness) to check is there any other eureka server has any registry or not
 - [Make default zone](https://www.youtube.com/watch?v=1uNo1NrqsX4&list=PL3NrzZBjk6m_n8QZCdnF7Yax36cqWkO9j&index=9) in discovery server, so it won't create any replica and fetch. Moreover, create default zone in other service as well
 - [Available apps registered](https://www.youtube.com/watch?v=ZcM3e_zp6Tk&list=PL3NrzZBjk6m_n8QZCdnF7Yax36cqWkO9j&index=9) in eureka __http://localhost:5000/eureka/apps__ and other [apis or eureka](https://github.com/Netflix/eureka/wiki/Eureka-REST-operations)
 - [High Availability, Zones and Regions](https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-eureka-server.html#spring-cloud-eureka-server-zones-and-regions) - The Eureka server does not have a back end store, but the service instances in the registry all have to send heartbeats to keep their registrations up to date (so this can be done in memory). Clients also have an in-memory cache of Eureka registrations (so they do not have to go to the registry for every request to a service).
 - The configuration eureka.instance.lease-renewal-interval-in-seconds indicates the interval of [heartbeats that the client sends](https://www.baeldung.com/eureka-self-preservation-renewal#:~:text=lease%2Drenewal%2Dinterval%2Din%2Dseconds%20indicates%20the%20interval,one%20heartbeat%20every%2030%20seconds.) to the server. The default value is 30 seconds which means that the client will send one heartbeat every 30 seconds.








































