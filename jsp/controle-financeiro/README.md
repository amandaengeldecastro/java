# Financial Control Web Application

This project is a **Financial Control** web application built using **Java**, **JSP** (JavaServer Pages), and **Servlets**. It allows users to manage and visualize their financial accounts by adding, viewing, and deleting records for different months.

## Project Specification:

- **Paradigm:** Web Application with MVC architecture (Model-View-Controller)  
- **Input:** Users can input account details such as the account name and financial values for each month of the year.  
- **Output:** Displays a report showing the list of accounts and their respective monthly values. Users can also delete accounts.  
- **Technology Stack:**
  - **Backend:** Java with Servlets  
  - **Frontend:** JSP, HTML, CSS  
  - **Web Server:** Jetty (mvn clean compile jetty:run)  

## Features:

### 1. Account Registration:
- Users can register a new account by providing:
  - **Account Name**
  - **Monthly Values** for each month of the year (January to December).
  
### 2. View Financial Report:
- Displays a dynamic table with the **Account Name** and **Monthly Values**.
- The table adapts to different screen sizes using **responsive design** (mobile-friendly).
- Users can see the detailed financial values of each account month by month.

### 3. Account Deletion:
- Each account listed in the report has a delete button.
- Users can delete any account by clicking the "Delete" button next to the account name.

## Technologies Used:

- **Java**: Used for implementing the backend logic, handling data processing and interaction with the front-end.
- **JSP (JavaServer Pages)**: Used for displaying dynamic content on the client side. 
- **Servlets**: Responsible for processing HTTP requests, managing data flow between the front-end and back-end.
- **HTML/CSS**: For structuring and styling the web pages, including making the interface responsive.
- **Jetty**: Used for running the application locally during development (other servers like Tomcat can also be used).

## How It Works:

1. **Account Registration:**
   - Users visit the registration page (`index.jsp`).
   - They fill out the form with the account name and monthly values (from January to December).
   - The form data is submitted via **POST** to the `ContaServlet`.
   - The servlet processes the data, stores the account information, and redirects to the report page (`relatorio.jsp`).

2. **View Financial Report:**
   - The `relatorio.jsp` displays a table showing all registered accounts along with their monthly values.
   - Users can delete any account by clicking the "Delete" button associated with the account. The deletion request is handled by the `ContaServlet`.

3. **Account Deletion:**
   - Each account has an associated "Delete" button.
   - When clicked, the account is removed from the in-memory list of accounts.
   - The page is updated to reflect the current list of accounts.
