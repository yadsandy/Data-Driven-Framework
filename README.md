# Data-Driven-Framework
--
A data-driven framework is where test input and output values are read from data files (ODBC sources, CVS files, Excel files, DAO objects, ADO objects, and such) and are loaded into variables in captured or manually coded scripts. In this framework, variables are used for both input values and output verification values. Navigation through the program, reading of the data files, and logging of test status and information are all coded in the test script. This is similar to table-driven testing (which is discussed shortly) in that the test case is contained in the data file and not in the script; the script is just a "driver," or delivery mechanism, for the data. In data-driven testing, only test data is contained in the data files.

### Tools
-- 

 * **Eclipse Java EE**
 * **Java 7+**
 * **WebDriver 2+**
 * **Apacha POI**
 * **TestNG**

### Framework Structure:
--

The framework consists of the following components.


- **src.core**
    - ActionDriver.java
    - OpenAndCloseBrowser.java
- **src.pageObjects**
    - LoginPage.java
- **src.listener**
    - ResultListener.java
    - ScreenshotOnFailure.java
- **src.test** 
    - LoginTest.java
- **src.utility** 
    - DataProvideForLogin.java
    - ReadExcel.java
    - WriteExcel.java
- **Driver** 
    - chromedriver.exe
    - geckodriver.exe
 - **resource**
    - TestData.xls
