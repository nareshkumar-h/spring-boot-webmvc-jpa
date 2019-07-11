# spring-boot-webmvc-jpa

#### Task 1 : Generate Spring Boot Project and Import Project
* http://start.spring.io
* Add Dependencies -  web,jpa,jdbc,devtools

#### Task 2: Configure DataSource
* application.properties
```
spring.datasource.driver-class-name=oracle.jdbc.driver.OracleDriver
spring.datasource.url=jdbc:oracle:thin:@trainingdb.cmqwe8vrjnur.us-east-1.rds.amazonaws.com:1521:orcl
spring.datasource.username=naresh
spring.datasource.password=password
```
* Create/Copy DataSourceConfig.java
  * Configure SessionFactory or EntityManager Factory
* pom.xml ( add ojdbc dependency, hibernate dependency )

#### Task 3: Test Spring Boot Server 
* Ensure Spring Boot server is started.

#### Task 4: Add Register/List User API
* UserController
* UserService
* UserDAO
* UserValidator

#### Task 5: Test Register API
* http://localhost:8080/users/register?name=naresh&email=naresh@gmail.com&password=pass123
* http://localhost:8080/users/list

#### Task 6: Implement RestController
* Define URL based on REST Standards
```
/accounts  - GET  - select * from accounts
/accounts - POST - insert into accounts
/accounts/1 - GET - select * from accounts where id =?
/accounts/1  - Put - update 
/accounts/1 - delete - delete from accounts where id = ?
/accounts - delete - delete from accounts
```

#### Task 7: Test REST API



