- [Tutorial](https://www.youtube.com/watch?v=9XI8lknaJzM&list=PL3NrzZBjk6m_n8QZCdnF7Yax36cqWkO9j&index=2)
- MySQL database
  ```
  show databases;
  create database customer_management;
  use customer_management;
  create table employee(id int auto_increment primary key, name varchar(30) not null, email varchar(50), bloodgroup varchar(10));
  show tables;
  describe employee;
  ```
  
 - API Endpoints
   - `/employees/1` get a single employee `curl http://localhost:8080/employees/1`

Till 26:00:00 minutes 