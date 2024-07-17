# Software Requirements Specification for SmartLib

## 1. Introduction
- **Product Perspective:** SmartLib is a powerful desktop application designed for seamless library management, specifically tailored for librarians to streamline their workflows. It provides a comprehensive set of features to manage books, borrowers, and library operations efficiently.
- **Product Functions:** SmartLib offers an intuitive GUI, multi-user and multi-library support, book and borrower management, transaction management, automated reminders, audit support, and robust authentication and security measures. It aims to reduce the overhead for librarians and modernize the traditional library management framework.
- **Intended Audience:** The intended audience for SmartLib includes librarians, library staff, and administrators who seek a user-friendly and efficient solution for managing library operations.
- **Product Features:** The key features of SmartLib include:
  - Intuitive GUI: Designed using Java Swing and Nimbus for ease of use.
  - Multi-User and Multi-Library Support: Allows multiple librarians and libraries to work simultaneously with a centralized MySQL database.
  - Book Management: Facilitates easy addition, update, and deletion of book records.
  - Borrower Management: Enables the addition, update, and deletion of borrower records.
  - Transaction Management: Simplifies book issuance, return, and renewal with automated date and fine calculations.
  - Automated Reminders: Sends email reminders to patrons for due returns.
  - Audit Support: Generates downloadable PDF reports for audits.
  - Authentication and Security: Robust input validation and secure access ensure data integrity.

## 2. Overall Description
- **Product Name:** SmartLib
- **Product Version:** 1.0
- **Product Scope:** SmartLib is a desktop application designed for library management, targeting small to medium-sized libraries. It provides a centralized system for managing books, borrowers, and library operations, improving efficiency and reducing manual effort.
- **Assumptions and Dependencies:** SmartLib is built using Java Swing and requires NetBeans 14 or above with JDK 16 or above. It depends on a MySQL database for data storage and retrieval. Additionally, it utilizes Javax.mail for sending automated email reminders.

## 3. External Interface Requirements
- **User Interfaces:** SmartLib provides a graphical user interface (GUI) designed using Java Swing and Nimbus, ensuring a user-friendly and intuitive experience for librarians.
- **Hardware Interfaces:** SmartLib is intended to run on desktop computers or laptops with specifications capable of running NetBeans 14 or above and JDK 16 or above.
- **Software Interfaces:** SmartLib utilizes the following software interfaces:
  - MySQL database for data storage and retrieval.
  - Javax.mail for sending automated email reminders.
  - NetBeans 14 or above for development and execution.
  - JDK 16 or above for Java development.
- **Communications Interfaces:** SmartLib communicates with the MySQL database to store and retrieve data. It also communicates with an SMTP server to send automated email reminders to patrons.

## 4. System Features
- **Book Management:** Librarians can easily add, update, and delete book records, including title, author, ISBN, publication date, and availability status.
- **Borrower Management:** Allows the addition, update, and deletion of borrower records, including personal information, contact details, and borrowing history.
- **Transaction Management:** Facilitates the issuance, return, and renewal of books with automated date stamping, fine calculations, and notification generation.
- **Automated Reminders:** Sends email reminders to patrons before the due date of book returns, reducing late returns and overdue fines.
- **Audit Support:** Generates comprehensive PDF reports, including book inventory, borrower statistics, and transaction history, for audit and administrative purposes.
- **Authentication and Security:** Implements a robust authentication system with input validation at every stage, ensuring secure access and data protection.
- **Multi-User and Multi-Library Support:** Supports multiple librarians and libraries working simultaneously, enabling centralized management and improved collaboration.

## 5. Special Requirements
- **Performance Requirements:** SmartLib should be optimized for efficient data retrieval and transaction processing, ensuring quick response times even with large book inventories and borrower records.
- **Security Requirements:** Robust authentication and input validation mechanisms should be in place to protect sensitive data, prevent unauthorized access, and maintain data integrity.
- **Cultural and Political Considerations:** SmartLib should adhere to local laws and regulations regarding data privacy and intellectual property rights.

## 6. Constraints
- **Solution Constraints:** SmartLib is designed for desktop platforms and may not be directly compatible with mobile devices or web-based access.
- **Hardware Constraints:** The performance of SmartLib may vary depending on the hardware specifications of the user's computer.
- **Software Constraints:** SmartLib requires specific software versions (NetBeans 14 or above, JDK 16 or above) and dependencies (MySQL, Javax.mail) to function correctly.

## 7. References
- [VinayHajare/SmartLib](https://github.com/VinayHajare/SmartLib)
