# ChandraKanthQAIntern
# Selenium Automation Assignment  

## Project Overview  
This project automates the login process on [Intervue.io](https://www.intervue.io) using **Selenium WebDriver with Java**. It performs the following steps:  
- Opens the website  
- Clicks on the **Login** button  
- Enters login credentials  
- Attempts to log in  
- Captures a screenshot if the login fails  

---

## Prerequisites  

Before running the script, ensure you have the following installed:  

1. **Java Development Kit (JDK 8 or higher)** 
2. **Google Chrome (Latest Version)** – Required for Selenium automation  
3. **ChromeDriver (Compatible with your Chrome version)**
4. **Selenium Java Client Library** – [Download Here](https://www.selenium.dev/downloads/)  
5. **An IDE (Eclipse) 

---

## Troubleshooting  

- **Issue:** `chromedriver.exe not found`  
  - Ensure the correct path is set in `System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");`  
- **Issue:** `Element not found`  
  - Increase implicit wait time:  
    ```java
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    ```  
- **Issue:** Java version error  
  - Run `java -version` and ensure JDK 8 or higher is installed  


