package p14_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {

        TestStep step1 = new TestStep("Open app", "", "", "");
        TestStep step2 = new TestStep("Check if login link is visible", "visible", "visible", "");
        TestStep step3 = new TestStep("Click on login link", "", "", "");
        TestStep step4 = new TestStep("Check if form is visible", "visible", "visible", "");
        TestStep step5 = new TestStep("Enter username", "", "", "");
        TestStep step6 = new TestStep("Enter password", "", "", "");
        TestStep step7 = new TestStep("Check if login button is visible", "visible", "invinsible", "Login button is not visible");
        TestStep step8 = new TestStep("Click on login button", "", "", "");
        TestStep step9 = new TestStep("User should be logged", "logged", "not logged", "User is not logged");
        TestStep step10 = new TestStep("Page should be /home" , "/login", "/home", "User should be redirected to home page");

        TestCase testCase = new TestCase(1, "Testiranje");


        testCase.addTestStep(step1);
        testCase.addTestStep(step2);
        testCase.addTestStep(step3);
        testCase.addTestStep(step4);
        testCase.addTestStep(step5);
        testCase.addTestStep(step6);
        testCase.addTestStep(step7);
        testCase.addTestStep(step8);
        testCase.addTestStep(step9);
        testCase.addTestStep(step10);

        System.out.println("Stanje test case-a: " + testCase.stanjeTestCasea());

        testCase.stampa();
        System.out.println(testCase.stanjeTestCasea());
    }
}

