🚗 **Car Rental System (Java OOP Project)**
--------------------------------------------
📌 **Description**

This is a simple console-based Car Rental System developed in Java using Object-Oriented Programming (OOP) principles and ArrayLists — no databases or external frameworks. 
The system supports both Admin and User functionalities through a menu-driven interface.

![image](https://github.com/user-attachments/assets/b2d8ee15-a4b9-4bbb-924c-dc9255aa1935)


👥 **Roles & Features**

    🔐 Admin:
    ➕ Add new cars with ID, name, model, and base price
    📃 View all available or rented cars
    📋 View customer rental records (who rented which car, for how many days)
    
    👤 User:
    ✅ Register with ID, name, and age (must be above 18)
    🚘 Rent available cars
           Select car by ID
           Choose number of days
           See total rental cost (base price × days)
    🔁 Return rented cars
           Frees the car for future rentals
           Updates rental records

📂 **Technologies Used**

Language: Java

Concepts: OOP (Classes, Objects, Encapsulation), ArrayLists, Scanner for I/O

📁 **Project Structure**


├── Main.java               // Entry point and menu

├── Car.java               // Car model

├── Admin.java             // Admin logic

├── User.java              // User logic

├── UserInfo.java          // Customer data

├── RentalRecord.java      // Link between Car & User for rentals


📷 **Sample Output**

--- Car Rental System ---
1. Admin Page
2. User Page
3. Exit

--- Admin Menu ---
1. Add Car
2. View Cars
3. View Rental Records
4. Exit

--- User Menu ---
1. Rent Car
2. Return Car
3. Exit


📜 License
This project is open-source for educational use. Free to modify and enhance.
