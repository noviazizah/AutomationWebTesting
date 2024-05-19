# Project Automation Web Testing Kelompok B8

Selamat datang di repositori project Automation Web Testing Kelompok B8!

## Deskripsi

Proyek ini bertujuan untuk mengautomasi pengujian fitur login dan logout pada situs web https://www.saucedemo.com/.

## Dibangun Dengan

Proyek pengujian otomatis ini menggunakan tiga pustaka utama:

- JUnit
- Cucumber
- Selenium

## Anggota Kelompok

- Helsa Alika Femiani - 211524044
- Novia Nur Azizah - 211524053
- Regi Purnama - 211524057

## Instalasi Project

Langkah-langkah untuk menginstal proyek ini pada lingkungan lokal:

1. Clone repository ini
   ```sh
   git clone https://github.com/noviazizah/AutomationWebTesting.git
   ```
2. Navigasi ke direktori proyek
   ```sh
   cd AutomationWebTesting
   ```
3. Jalankan Maven untuk mengunduh semua dependensi yang dibutuhkan
   ```sh
   mvn install
   ```

## Struktur Folder Project

```
AutomationWebTesting/
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── automation
│   │               └── Main.java
│   ├── test
│   │   ├── java
│   │   │   └── com
│   │   │       └── automation
│   │   │           ├── LoginSteps.java
│   │   │           ├── LogoutSteps.java
│   │   │           └── TestRunner.java
│   │   └── resources
│   │       ├── login.feature
│   │       └── logout.feature
├── target
│   ├── classes
│   │   └── com
│   │       └── automation
│   │           └── Main.class
│   ├── maven-status
│   ├── surefire-reports
│   ├── test-classes
│   │   └── com
│   │       ├── login.feature
│   │       └── logout.feature
│   │
│   └── cucumber.html
├── chromedriver.exe
├── pom.xml
└── README.md
```

## Struktur Folder Project

| **Test Case ID** | **Module (Feature)** | **Case (-/+/edge)** | **Test Case Name (Scenario)**                                                    | **Precondition (GIVEN)**                                                 | **Steps to execute (WHEN)**                                              | **Test Data**                                         | **Expected Result (THEN)**                                                                          |
| ---------------- | -------------------- | ------------------- | -------------------------------------------------------------------------------- | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ----------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| 0.0              | **Login**            |                     |                                                                                  |                                                                          |                                                                          |                                                       |                                                                                                     |
|                  | **Functionality**    |                     |                                                                                  |                                                                          |                                                                          |                                                       |                                                                                                     |
| 0.0.1            |                      | Positif             | Check successful login by entering a valid username and password                 | - User has opened the browser<br>- User has navigated on the login page  | 1. User enters username & password<br>2. User clicks on login button     | Username: standard_user<br>Password: secret_sauce     | 1. User is navigated to the home page<br>2. User should be able to see "login success" notification |
| 0.0.2            |                      | Negative            | Check login was not successful by entering invalid username and password         | - User has opened the browser<br>- User has navigated on the login page  | 1. User enters username & password<br>2. User clicks on login button     | Username: invalid_user<br>Password: invalid_password  | Display error message "Username and password do not match any user in this service!"                |
| 0.0.3            |                      | Negative            | Check login was not successful by entering a valid username and invalid password | - User has opened the browser<br>- User has navigated on the login page  | 1. User enters username & password<br>2. User clicks on login button     | Username: standard_user<br>Password: invalid_password | Display error message "Username and password do not match any user in this service!"                |
| 0.0.4            |                      | Negative            | Check login was not successful by entering invalid username and valid password   | - User has opened the browser<br>- User has navigated on the login page  | 1. User enters username & password<br>2. User clicks on login button     | Username: invalid_user<br>Password: secret_sauce      | Display error message "Username and password do not match any user in this service!"                |
| 0.0.5            |                      | Negative            | Check login is not successful by entering only username                          | - User has opened the browser<br>- User has navigated on the login page  | 1. User enters username<br>2. User clicks on login button                | Username: standard_user<br>Password: {empty}          | Display error message "You need Password!"                                                          |
| 0.0.6            |                      | Negative            | Check login is not successful by entering only password                          | - User has opened the browser<br>- User has navigated on the login page  | 1. User enters password<br>2. User clicks on login button                | Username: {empty}<br>Password: secret_sauce           | Display error message "You need Username!"                                                          |
| 0.0.7            |                      | Negative            | Check login was not successful by not entering username and password             | - User has opened the browser<br>- User has navigated on the login page  | 1. User clicks on login button                                           | Username: {empty}<br>Password: {empty}                | Display error message "You need Username & Password!"                                               |
| 1.0              | **Logout**           |                     |                                                                                  |                                                                          |                                                                          |                                                       |                                                                                                     |
|                  | **Functionality**    |                     |                                                                                  |                                                                          |                                                                          |                                                       |                                                                                                     |
| 1.0.1            |                      | Positif             | Logout when there is an active session                                           | - User has opened the browser<br>- User has logged in to the application | 1. User clicks on the menu button<br>2. User clicks on the logout button |                                                       | User is navigated to the login page                                                                 |
