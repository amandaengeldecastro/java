# Employee Management

This API allows you to manage employees within a system. It provides functionalities for *creating, retrieving, updating, and deleting* employee records.

---

## 🛠️ Technologies | Frameworks 

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL Database**
- **Swagger (OpenAPI)**
- **Maven**
- **Lombok**

---

## 🔧 How to Run

1. **Clone the repository**  
   Run the following command to clone the repository:
   `git clone https://github.com/your-username/your-repository.git`
   `cd your-repository`

2. **Build and Run the Application**  
   Run the following command to build and start the application:
   `mvn spring-boot:run`
   The API will be available at `http://localhost:8080`.

3. **Access Swagger Documentation**  
   After starting the application, you can access the Swagger UI for API documentation at:  
   🔗 [Swagger UI Documentation](./resources/swagger.yaml)

## 📌 API Endpoints

### 👥 Employee Endpoints

#### 🔹 Create one or more employees  
**Endpoint:** `POST /employee`  
**Description:** Creates one or more employees.
<!-- ![Diagrama POST /suppliers](./microservice/resources/diagrama-POST-suppliers.png "Diagrama POST /suppliers") -->


#### 🔹 Retrieve all employees  
**Endpoint:** `GET /employee`  
**Description:** Returns a list of all employees.

#### 🔹 Retrieve employee by ID  
**Endpoint:** `GET /employee/{id}`  
**Description:** Returns a specific employee by **ID**.

#### 🔹 Update employee  
**Endpoint:** `PUT /employee/{id}`  
**Description:** Updates an employee's data by **ID**.

#### 🔹 Delete employee  
**Endpoint:** `DELETE /employee/{id}`  
**Description:** Deletes an employee from the database by **ID**.

---

## 📌 Return Codes

| HTTP Code | Description                             |
|-----------|-----------------------------------------|
| 200       | Ok                                      |
| 201       | Created                                 |
| 400       | Bad Request                             |
| 401       | Unauthorized                            |
| 404       | Not Found                               |
| 500       | Internal Server Error - Unexpected Error|
