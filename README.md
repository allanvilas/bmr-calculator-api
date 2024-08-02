<p align="center">
   <img src="https://img.shields.io/badge/Java-17.0.12-blue" alt="Java Version"/>
   <img src="https://img.shields.io/badge/Apache%20Maven-3.9.8-blue" alt="Apache Maven Version"/>
   <img src="https://img.shields.io/badge/license-MIT-green" alt="Project License"/>
</p>

# BMR and TDEE Calculator API

This project is a Spring Boot application that provides an API for calculating Basal Metabolic Rate (BMR) and Total Daily Energy Expenditure (TDEE) based on user input. It also provides caloric suggestions for weight loss and weight gain.

## Project Description

The BMR and TDEE Calculator API accepts user details such as height, weight, age, gender, and activity level to compute the BMR and TDEE. Additionally, it provides caloric recommendations for weight loss and weight gain.

## Directory Mapping
    src
    ├── main
    │ ├── java
    │ │ └── com
    │ │ └── bmr
    │ │ └── calc
    │ │ ├── BmrApplication.java
    │ │ ├── controller
    │ │ │ └── BMRController.java
    │ │ ├── model
    │ │ │ └── Person.java
    │ │ ├── service
    │ │ │ └── BMRService.java
    │ │ └── util
    │ │ └── ActivityLevel.java
    │ └── resources
    │ └── application.properties

### Directory Description

- **controller**: Contains classes that handle incoming HTTP requests.
- **model**: Contains data model classes.
- **service**: Contains business logic and service classes.
- **util**: Contains utility classes and enums.

## Features

- Calculate Basal Metabolic Rate (BMR).
- Calculate Total Daily Energy Expenditure (TDEE).
- Provide caloric recommendations for weight loss and weight gain.

## Technologies Used

- Java
- Spring Boot
- Maven
- Jackson (for JSON processing)

## How to Run

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/bmr-tdee-calculator.git
    cd bmr-tdee-calculator
    ```

2. Build the project using Maven:
    ```bash
    mvn clean install
    ```

3. Run the application:
    ```bash
    mvn spring-boot:run
    ```

4. The application will start on `http://localhost:8080`.

## API Endpoints

### POST /api/calculate

**Description**: Calculates BMR and TDEE based on user input.

**Request Body Example**:
```json
{
    "height": 172.0,
    "weight": 78.0,
    "age": 22,
    "isWoman": false,
    "activityLevel": "MODERATELY_ACTIVE"
}
```

Response Example:
```json
{
    "caloricDeficit":2212.5,
    "BMR":1750.0,
    "TDEE":2712.5,
    "caloricSurplus":3212.5
}
```

How to Test
You can test the API using Postman or curl.

Example using curl:
```bash
curl -X POST http://localhost:8080/api/calculate \
-H "Content-Type: application/json" \
-d '{
    "height": 185.0,
    "weight": 90.0,
    "age": 27,
    "isWoman": false,
    "activityLevel": "MODERATELY_ACTIVE"
}'
```

### Example using Postman:
   1. Open Postman.
   2. Create a new POST request.
   3. Set the request URL to http://localhost:8080/api/calculate.
   4. Go to the "Body" tab.
   5. Select "raw" and choose "JSON" from the dropdown.
   6. Copy and paste the example request body.
   7. Click "Send".
### What is Mapped
- Person: A model class representing user details (height, weight, age, gender, activity level).
- ActivityLevel: An enum representing different levels of physical activity.
- : A service class that contains the logic for calculating BMR and TDEE.
- BMRController: A controller class that handles API requests and responses.
### What is the Return
The API returns a JSON object containing the calculated BMR, TDEE, and caloric recommendations for weight loss and weight gain.
```json
{
    "caloricDeficit":2212.5,
    "BMR":1750.0,
    "TDEE":2712.5,
    "caloricSurplus":3212.5
}
```