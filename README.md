# 📚 SmartLib: Books Automation

**SmartLib** is a comprehensive desktop application designed for library management, specifically tailored for librarians. Built using Java Swing and NetBeans 14 and above with JDK 16 and above, SmartLib redefines the traditional library management framework by reducing the overhead for librarians and enabling a centralized, multi-library, multi-user system.

## Features

- 🎨 **Intuitive GUI**: Designed using Java Swing and Nimbus for a user-friendly experience.
- 👥 **Multi-User Support**: Allows multiple librarians and libraries to use the system simultaneously with a centralized MySQL database.
- 🔒 **Authentication System**: Robust input validation at every stage ensures secure access.
- 📚 **Book Management**: Easily add, update, and delete book records.
- 👤 **Borrower Management**: Add, update, and delete borrower records.
- 🔄 **Transaction Management**: Issue, return, and renew books with automated date and fine calculations.
- 📄 **Audit Support**: Download all records in PDF format for audit purposes.
- 📧 **Automated Reminders**: Sends email reminders to patrons for due returns using Javax.mail.
- ✅ **Input Validation**: Comprehensive validation using regex makes the system robust.

## 🚀 Installation

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/VinayHajare/SmartLib.git
    ```
2. **Open with NetBeans 14 and Above**: Import the project into NetBeans.
3. **Configure Database**: Set up your MySQL database and update the database connection settings in the project.
4. **Import Libraries**: Add the required libraries by expanding SmartLib project, right-click on `libraries > Add jar/folder`. Select the .jar files from *Libraries* directory of the project.
5. **Configure Credentials**: Create a *`src/resources/config.properties`* file in the root directory of the project with the following content:

    ```properties
    # Database Configuration
    db.url=jdbc:mysql://localhost:3306/databaseName
    db.username=yourDatabaseUsername
    db.password=yourDatabasePassword
    
    # Email Configuration
    mail.smtp.host=smtp.yourEmailProvider.com
    mail.smtp.port=587
    mail.smtp.username=yourEmailUsername
    mail.smtp.password=yourEmailPassword
    mail.from=yourEmail@example.com
    ```
5. **Build and Run**: Compile and run the application from NetBeans.

## 💡 Usage

- **Login**: Authenticate using librarian credentials.
- **Manage Records**: Navigate through the intuitive GUI to manage books and borrowers.
- **Issue/Return Books**: Easily issue, return, and renew books with automated calculations.
- **Download Reports**: Generate and download PDF reports for audits.
- **Automated Emails**: Ensure patrons receive reminders for book returns.

## 📋 Pending Features

- [x] Use configuration properties for email and database access secrets.
- [x] Implement a special logging system for exceptions and issues.
- [x] Integrate multithreading for asynchronous email reminders and make it a background task.
- [ ] Integrate SwingWorker for background tasks such as email sending, adhoc database updates.
- [ ] Implement the Borrowers dashboard.

## ✅ Completed Features

- [x] Intuitive GUI using Swing and Nimbus.
- [x] Multi-user and multi-library support with centralized MySQL database.
- [x] Comprehensive authentication system with input validation.
- [x] Book and borrower record management.
- [x] Automated issue, return, and renew processes with fine calculation.
- [x] PDF download capability for audit purposes.
- [x] Automated email reminder system using Javax.mail.
- [x] Input validation using regex.

## 🤝 Contributing

We welcome contributions to enhance SmartLib. To contribute:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a pull request.

## 📜 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgments

Special thanks to the contributors and the open-source community for their invaluable support and resources.

### 🧑‍💻 Contributors
- **[Isha Kulkarni](https://github.com/ishakulkarni23)** - UI enhancements and bug fixes
- **[Neha Deshpande](https://github.com/NehaManishDeshpande)** - Initial design and development 
- **[Niranjan Dangi](https://github.com/NiranjanDangi)** - Database configuration and optimization

---

Feel free to explore, contribute, and make SmartLib even better!
