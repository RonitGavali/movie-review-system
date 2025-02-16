Movie Review System

📌 Overview

The Movie Review System is a Spring Boot application that allows users to manage movies and their reviews. It provides APIs to add, retrieve, and manage movies along with their associated reviews.

🛠️ Technologies Used

Java 17

Spring Boot 3.3.1

Spring Data JPA

Hibernate

MySQL / Oracle Database

Lombok

Swagger (Springdoc OpenAPI)

📂 Project Structure

movie-review-system/
│── src/
│   ├── main/
│   │   ├── java/com/project/
│   │   │   ├── entity/
│   │   │   │   ├── Movie.java
│   │   │   │   ├── Review.java
│   │   │   ├── repository/
│   │   │   │   ├── MovieRepository.java
│   │   │   │   ├── ReviewRepository.java
│   │   │   ├── service/
│   │   │   │   ├── MovieService.java
│   │   │   │   ├── ReviewService.java
│   │   │   ├── controller/
│   │   │   │   ├── MovieController.java
│   │   │   │   ├── ReviewController.java
│   ├── resources/
│   │   ├── application.properties
│   ├── test/
│   │   ├── java/com/project/
│   │   │   ├── MovieControllerTest.java
│   │   │   ├── ReviewControllerTest.java

🚀 Features

✅ Add, Update, Delete Movies✅ Add Reviews for Movies✅ Retrieve Movie details with associated Reviews✅ API Documentation with Swagger✅ Exception Handling

📌 Installation & Setup

1️⃣ Clone the Repository

git clone https://github.com/your-username/movie-review-system.git
cd movie-review-system

2️⃣ Configure the Database

Update application.properties with your database credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/moviedb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update

3️⃣ Build & Run the Project

mvn clean install
mvn spring-boot:run

4️⃣ Access the APIs

Swagger UI: http://localhost:8080/swagger-ui/index.html

Movie API Endpoints:

GET /api/movies - Get all movies

POST /api/movies - Add a new movie

GET /api/movies/{id} - Get movie by ID

DELETE /api/movies/{id} - Delete a movie

📖 API Documentation

After running the project, visit http://localhost:8080/swagger-ui/index.html to explore the available API endpoints.

🛠️ Troubleshooting

If you encounter a ConcurrentModificationException, ensure that you're using DTOs to avoid cyclic dependencies between Movie and Review. Example DTO:

public class MovieDTO {
    private Long id;
    private String title;
    private List<ReviewDTO> reviews;
}

👨‍💻 Contributing

Fork the repository

Create a new branch (feature/new-feature)

Commit your changes (git commit -m 'Add new feature')

Push to the branch (git push origin feature/new-feature)

Open a Pull Request

📜 License

This project is licensed under the MIT License.

🔥 Happy Coding! 🚀

