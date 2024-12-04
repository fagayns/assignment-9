Employee Management Application
Description
The Employee Management Application is a Java-based project that demonstrates how to perform CRUD (Create, Read, Update, Delete) operations on a relational database using JDBC. The application interacts with a MySQL database to manage employee data, including storing details such as the employee's name, position, salary, and hire date.

This project is ideal for understanding database connectivity in Java and implementing basic data operations in a structured and reusable way.

Features
Add Employees: Create and save a new employee record in the database.
View Employees:
Retrieve and display a single employee's details by ID.
Retrieve and display all employees.
Update Employees: Edit and update existing employee information.
Delete Employees: Remove an employee record from the database.
Technologies Used
Programming Language: Java
Database: MySQL
Libraries/Tools: JDBC, IntelliJ IDEA/Eclipse for development

Code Structure
1. Employee Class
Defines the Employee entity with fields:

id (int)
name (String)
position (String)
salary (double)
hireDate (Date)
Includes constructors, getters, setters, and a toString() method for easy representation.

2. EmployeeData Class
Handles database connectivity and CRUD operations:

createEmployee(Employee employee)
getEmployeeById(int id)
getAllEmployees()
updateEmployee(Employee employee)
deleteEmployee(int id)
3. Main Class
Contains the main() method for testing CRUD functionality.
