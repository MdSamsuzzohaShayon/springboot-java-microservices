### Docker
 - Launch MySQL as Docker Container 
    ```
    docker run --detach --env MYSQL_ROOT_PASSWORD=dummypassword --env MYSQL_USER=social-media-user --env MYSQL_PASSWORD=dummypassword --env MYSQL_DATABASE=social-media-database --name mysql --publish 3306:3306 mysql:8-oracle
    ```
 - mysqlsh commands
    ```
    mysqlsh
    \connect social-media-user@localhost:3306
    \sql
    use social-media-database
    select * from user_details;
    select * from post;
    \quit
    ```
 - /src/main/resources/application.properties Modified
    ```
    #spring.datasource.url=jdbc:h2:mem:testdb
    spring.jpa.show-sql=true
    spring.datasource.url=jdbc:mysql://localhost:3306/social-media-database
    spring.datasource.username=social-media-user
    spring.datasource.password=dummypassword
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
    ```
 - Access MySQL via shell
    ```
    sudo docker exec -it mysql mysql -u social-media-user -p
    ```
