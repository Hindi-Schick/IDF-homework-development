# IDF-homework-development
The IDF Homework - Development
This project is a Java application for [insert brief description of the application's purpose].

**Requirements**
Java 11
Maven
Docker
**Getting Started**
To run this application locally, you can follow these steps:

Clone the repository to your local machine:

git clone https://github.com/Hindi-Schick/IDF-homework-development.git<br>

https://www.docker.com/products/docker-desktop<br>
https://tableplus.com/download<br>

Navigate to the project directory:<br>
cd IDF-homework-development<br>

Build the Maven project:<br>
mvn clean install<br>

Build the Docker image with the following command:<br>
docker build -t idf-homework .<br>

Run the Docker container with the following command:<br>
docker run -p 8080:8080 idf-homework<br>

Once the container is running, you should be able to access the application by navigating to http://localhost:8080/swagger-ui.html in your web browser.<br>
This will display the Swagger UI, which provides documentation and a testing interface for the application's REST APIs.<br>
You can use the Swagger UI to explore the application's API endpoints and make test requests to them.<br>
Note: The Swagger UI is included in the Spring Boot starter package for OpenAPI 3, <br>
which should already be included as a dependency in the project's pom.xml file. <br>
If you encounter any issues with running Swagger UI, make sure that this dependency is properly installed and up-to-date.<br>


**Contributing**
Contributions are welcome! To contribute to this project, please follow these steps:<br>

Fork the repository.<br>
Create a new branch for your changes.<br>
Make your changes and commit them.<br>
Push your changes to your fork.<br>
Create a pull request.<br>

![image](https://github.com/Hindi-Schick/IDF-homework-development/assets/117584595/6f8840f1-4e29-4484-896c-949d599a48b8)

