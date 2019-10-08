# EasyCart
EasyCart is a Shopping cart service in spring boot based on micro services architecture implemented with Spring Cloud Netflix.
This service include all operations related to products. There is a REST controller to consume REST API's

## Simple demo of service registration using Eureka.



## Building the demo

Run the following from the command line:
```
git clone https://github.com/hamza840/EasyCart.git

```

## What's inside

This project is based on the Spring Boot project and uses these packages :

- Maven
- Spring Boot
- Spring Cloud Netflix
- Spring MVC (Tomcat)
- Mybatis
- Thymleaf

## Installation

The project is created with Maven, so you just need to import it to your IDE and build the project to resolve the dependencies

## Import Database Schema

1. open http://localhost/phpmyadmin/
2. Databases -> Create Database -> Set name 'easycart' -> Create
3. Choose newly created 'easycart' database in left pane
4. Import -> File to import -> Choose file 'easycart.sql' -> Click Go

## Eureka Client

Use @EnableEurekaClient annotation to enable service as a client.
- With above annotation when start the application it would be registered with the Eureka service registry as an UNKNOWN application.
- By default will search the Eureka server at port 8761 in the local machine
- If application is stopped then Eureka server (management api) will show the state of the app as DOWN
- If application is down for a longer period then Eureka server will eliminate from the registry

```java
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}
}
```

## Database configuration

Create a MySQL database with the name easycart and add the credentials to /resources/application.properties.
The default ones are :

```
spring.datasource.url=jdbc:mysql://localhost:3306/easycart?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=
```

## Configuration of service and registring with eureka server

Add eureka server address and port of service in /resources/application.properties.

```
spring.application.name=service-crud
eureka.client.service-url.defaultZone=http://localhost:8761/eureka
server.port=8087
```

## Usage

Run the project through the IDE and head out to http://localhost:8080

## API Endpoint

- Insert Product (send data in request body): http://localhost:8087insertProduct
- Get All Products: http://localhost:8087getAllProducts
- Update Product (send data in request body): http://localhost:8087/updateProduct
- Delete Product (send data in request body): http://localhost:8087/deleteProduct
- Search Product (send data in request params): http://localhost:8087searchProduct?query=iphone
- Get Products of particular category (send data in request params): http://localhost:8087/getProductWithCatId?cat_id=2
- insert comment of a particular product (send data in request body):http://localhost:8087/insertcomment
- insert ratting of a particular product (send data in request body): http://localhost:8087/insertratting
- get comments of a product (send data in request body): http://localhost:8087/getproductcomment?p_id=3
- get rattings of a product (send data in request body): http://localhost:8087/getproductratting?p_id=3
- get list of parent categories: http://localhost:8087/getcategories
- get list of child categories: http://localhost:8087/getsubcategories
