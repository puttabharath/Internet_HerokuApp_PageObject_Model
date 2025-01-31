Internet Herokuapp
Project Overview
Internet Herokuapp is a demo application automated for practicing various automation concepts. The project utilizes a Page Object Model (POM) framework to organize and manage the test code. It integrates three major testing frameworks:

End-to-End Testing: Covers the full application flow and tests the entire application process.
Data-Driven Framework: Uses external data (e.g., from Excel or CSV files) to run tests with different sets of data inputs.
Keyword-Driven Framework: Executes tests based on predefined keywords for certain actions or conditions.
Additionally, the project includes Extent Reports for generating detailed test reports and a Listeners Class to manage the reports effectively.

Getting Started
Follow these steps to set up and run this project:

1. Clone the Repository
   Clone the repository using Git:
   git clone <your_repo_url>
   cd Internet_Herokuapp

2. Prerequisites
   Ensure you have Java installed.
   Install Maven for managing project dependencies.
   Use TestNG as the test runner.
3. Add Your Files
   Create or upload any additional files needed for the project.
4. Setup and Configuration
   Ensure that your configurations (e.g., browser type, driver paths) are correctly set up in the config folder.
   Set up test data in the required format (Excel, CSV) for the Data-Driven framework.
5. Running Tests
   Use Maven to run the tests:
   bash
   Copy
   Edit
   mvn clean test
   Tests will run, and reports will be generated using Extent Reports.

Features
Page Object Model (POM): Structured code that ensures maintainability and reusability by separating web elements and test actions into separate classes.
Data-Driven Framework: Tests are driven by multiple sets of data to ensure coverage across different scenarios.
Keyword-Driven Framework: High-level abstraction that allows tests to be written with keywords rather than code.
Extent Reports: Generate visual, HTML-based reports with detailed test results, logs, and screenshots.
Listeners Class: Custom listeners that help capture and manage test execution details and results.
Usage
The demo app can be accessed via the Heroku URL.
Once automated, tests will run through various actions such as logging in, filling forms, and submitting actions based on the test case scenarios.
Example Test Case:
java
Copy
Edit
@Test
public void testLogin() {
loginPage.enterUsername("testUser");
loginPage.enterPassword("password123");
loginPage.clickLoginButton();
Assert.assertTrue(dashboardPage.isUserLoggedIn());
}
This test case will use data-driven testing to verify different user credentials for logging into the application.

Reports
Extent Reports: After running the tests, the generated reports will display:
Test execution status (Pass/Fail)
Execution time and logs
Screenshots of failed tests
Location: Reports will be generated in the /test-output/ExtentReports folder.
Support
For any issues or questions, please open an issue in the repository or reach out to the project maintainers.

Roadmap
Enhancements: Further improve framework modularity and expand test scenarios.
**Parallel