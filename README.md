# Spring Boot Project - Controle

This Spring Boot project provides a simple application for managing articles and categories. It includes functionalities such as creating articles, managing categories, and finding articles between specific dates.

## Technologies Used
- Spring Boot
- Maven
- Swagger
- Hibernate
- JPA
- SQL Database
- Postman

## Project Features
1. CRUD operations for students, roles, and filieres.
2. Utilize Swagger for easy testing and API interaction.

## Screenshots
### Data Base


### Swagger categorie API 
<img width="938" alt="image" src="https://github.com/MaskedFezz/ControleJEE/assets/130797834/26426213-9c84-4710-99ed-f129063b8358">



### Find by id example
<img width="910" alt="image" src="https://github.com/MaskedFezz/ControleJEE/assets/130797834/e6e3a533-13c5-48bc-9497-d9a01875792c">


#### Categorie JSON
<img width="283" alt="image" src="https://github.com/MaskedFezz/ControleJEE/assets/130797834/9637436d-e5f9-47d1-97fc-5325737186b7">

### Swagger Article API 
<img width="933" alt="image" src="https://github.com/MaskedFezz/ControleJEE/assets/130797834/2cdff83b-afe4-4f02-88f3-405b4735df41">


### Article display 
<img width="832" alt="image" src="https://github.com/MaskedFezz/ControleJEE/assets/130797834/172385db-c79a-46bf-94c9-d89db58e0690">

### Delete example

<img width="904" alt="image" src="https://github.com/MaskedFezz/ControleJEE/assets/130797834/fe6972ee-c2bc-450b-b386-34437f434620">

#### Article JSON


### Filter by categorie 
<img width="900" alt="image" src="https://github.com/MaskedFezz/ControleJEE/assets/130797834/97661307-c013-4c67-9ce0-71dbe4e3e961">

### Filter by date
![image](https://github.com/MaskedFezz/ControleJEE/assets/130797834/6dda4c9f-5215-4092-97c2-acb5e95bc393)

## Project Structure
The project is divided into packages that represent different aspects of the application:

- `ma.fezzazi.controle`: Main application package.
- `ma.fezzazi.controle.controller`: Controllers for managing students, roles, and filieres.
- `ma.fezzazi.controle.entities`: Model classes for students, roles, and filieres.
- `ma.fezzazi.controle.repositories`: JPA repositories for database operations.
- `ma.fezzazi.controle.service`: Service classes for handling business logic.
- `ma.fezzazi.controle.dao`: IDao interface.

## System Requirements
- Java 17
- Maven
- SQL Database

## How to Run the Project
1. Clone this project to your computer.
2. Configure the database connection in the `application.properties` file.
3. Run the project using Maven or your favorite Spring Boot IDE.
4. Access Swagger to test the API: `http://localhost:8088/swagger-ui/index.html`

## Authors
- [Mohamed Fezzazi](https://github.com/MaskedFezz) (Email address: mohamedfezzazi22@gmail.com)
- [Mohamed Lachgar ](https://github.com/lachgar) (Professor)
