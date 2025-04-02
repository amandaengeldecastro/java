# User Management System

This project is a **web-based User Management System** built using **Spring MVC** and **Maven**. It enables CRUD operations (Create, Read, Update, Delete) on user data. The system follows the **Model-View-Controller (MVC)** pattern and uses **Thymeleaf** for view rendering.

## Technologies
- **Spring Boot & Spring MVC** - Backend logic and request handling
- **Maven** - Dependency management
- **Thymeleaf** - Template rendering
- **Boostrap** - Front-end styling and responsiveness
- **Spring Data JPA** - Database operations
- **H2/MySQL Database** - Persistent user data storage

## Project Specification
- **Architecture:** MVC (Model-View-Controller)
- **Input:** HTTP requests via REST endpoints
- **Output:** HTML pages rendered with Thymeleaf
- **Features**:
  - **Home Page** (`/home`): For while, displays a simple message in the homepage
  - **User Management**:
    - **List Users** (`/users`): Fetch and display all users
    - **Create User**:
      - **Form Page** (`/users/new`): Form for user registration
      - **Save User** (`/users`): Persist new user data
    - **Edit User**:
      - **Form Page** (`/users/edit/{id}`): Retrieve user by ID and display edit form
      - **Update User** (`/user/edit/{id}`): Update user information
    - **Delete User** (`/users/{id}`): Remove a user from the database

