# Springbott microservices
 - [tutorial playlist](https://www.youtube.com/watch?v=lh1oQHXVSc0&list=PLSVW22jAG8pBnhAdq9S8BpLnZ0_jVBj0c), [docs](https://docs.spring.io/spring-framework/docs/current/javadoc-api/index-files/index-1.html)
- [Spring Framework Packages](https://docs.spring.io/spring-framework/docs/current/javadoc-api/index.html)
- [Support package for annotation-driven bean configuration](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/annotation/package-summary.html)
- [Advantages](https://www.youtube.com/watch?v=T2rBkbT50TE&list=PL3NrzZBjk6m_n8QZCdnF7Yax36cqWkO9j)
  1. Each service deployable independently
  2. Each app can be tested differently
  3. Core changes on one app / service does not need the entire application testing
  4. Dev working on one service, should not require
  5. Spring cloud ready made support

- **Tests**
- Add those dependencies in `pon.xml` file
- [Adding Testcontainers JUnit 5 support to your project dependencies](https://www.testcontainers.org/test_framework_integration/junit_5/)
- [Adding this module to your project dependencies](https://www.testcontainers.org/modules/databases/mongodb/)
- [Managing versions for multiple Testcontainers dependencies
  (do not remove version from here)](https://www.testcontainers.org/)

## Errors that need to solve
- [UnsatisfiedDependencyException: Error creating bean with name](https://stackoverflow.com/questions/57801875/unsatisfieddependencyexception-error-creating-bean-with-name-repository-bookre)
    - The thing is, that your main and test packages differ: BookRepository is in app.entity.repository and your test is in repository. Try by aligning it and move your test to src/test/java/app/entity/repository.

### Project setup (Cambine product-service, order-service, and inventory-service)
 -  create a maven project, inside maven project create 3 module: 
     1) product-service: Copy dependencies 
     1) inventory-service: Copy dependencies 
     3) order-service: Copy dependencies and 
 - delete src folder from root project
 - Replace src folders of inventory-service, order-service, and product-service from our main previous projects
 - run maven command from maven tab `mvn clean verify`
 - If everything works successfully try running all maven module individually

### Order service
- Api endpoints
    - `/api/order` create an order `curl -X POST http://localhost:8081/api/order -H 'Content-Type: application/json' -d '{"orderLineItemsDtoList": [{"skuCode": "ph-ap-21", "price": 1200, "quantity": 1}]}'`
    
### Product service
- API end points
    - `/api/product` Create a product `curl -X POST http://localhost:8080/api/product -H 'Content-Type: application/json' -d '{"name": "Iphone 5", "description": "An old version of Iphone", "price": 600}'`
    - `/api/product` Get list of product `curl -X GET http://localhost:8080/api/product`

### Inventory service
 - API endpoints
    - `/api/inventory` Get lists of inventory `curl -X GET http://localhost:8082/api/inventory?skuCode=qw-ds-2352&skuCode=qw-ds-2351&skuCode=qw-ds-2551`

### Discovery service
 - Eureka  service __http://localhost:8761/__
 - 