# Employee-Payroll-System
Creating an employee payroll system using Java with Object-Oriented Programming (OOP) principles is a common and structured approach to managing employee compensation within an organization. This system allows you to store and process information about employees, their work hours, salaries, and generate paychecks. Here's a description of how you might design and implement an employee payroll system using Java OOP:

1. Employee Class:
Create a class called Employee as the base class for all employee types. This class should contain attributes like employee ID, name, and basic salary. It should also have methods for setting and getting these attributes.

2. PartTimeEmployee for Employee Types:

Implement subclasses for different types of employees, such as full-time employees, part-time employees, and contractors. Each of these subclasses should inherit from the Employee class and include additional attributes and methods relevant to their specific type (e.g., hourly rate, hours worked, contract details).
3. Payroll Class:

Create a Payroll class responsible for managing payroll processing. This class should contain a list of employees, methods for adding, removing, and retrieving employee records.
4. Calculate Payroll:

Implement methods within the Payroll class to calculate the salary for each employee based on their specific type. For example, full-time employees may have a fixed monthly salary, while part-time employees' pay might be based on hours worked. Ensure that the payroll calculation adheres to applicable tax deductions and other deductions as per company policy.
