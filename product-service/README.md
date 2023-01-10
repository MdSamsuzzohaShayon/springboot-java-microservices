# Springboot microservices
 - [tutorial playlist](https://www.youtube.com/watch?v=lh1oQHXVSc0&list=PLSVW22jAG8pBnhAdq9S8BpLnZ0_jVBj0c), [docs](https://docs.spring.io/spring-framework/docs/current/javadoc-api/index-files/index-1.html)
 - API end points 
      - `/api/product` Create a product `curl -X POST http://localhost:8080/api/product -H 'Content-Type: application/json' -d '{"name": "Iphone 5", "description": "An old version of Iphone", "price": 600}'` 
      - `/api/product` Get list of product `curl -X GET http://localhost:8080/api/product`
 - [Spring Framework Packages](https://docs.spring.io/spring-framework/docs/current/javadoc-api/index.html)
 - [Support package for annotation-driven bean configuration](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/annotation/package-summary.html)

 - **Tests**
 - Add those dependencies in `pon.xml` file
 - [Adding Testcontainers JUnit 5 support to your project dependencies](https://www.testcontainers.org/test_framework_integration/junit_5/)
 - [Adding this module to your project dependencies](https://www.testcontainers.org/modules/databases/mongodb/)
 - [Managing versions for multiple Testcontainers dependencies
   (do not remove version from here)](https://www.testcontainers.org/)

## Errors that need to solve
 - [UnsatisfiedDependencyException: Error creating bean with name](https://stackoverflow.com/questions/57801875/unsatisfieddependencyexception-error-creating-bean-with-name-repository-bookre)
      - The thing is, that your main and test packages differ: BookRepository is in app.entity.repository and your test is in repository. Try by aligning it and move your test to src/test/java/app/entity/repository.