package tests;

import org.testng.annotations.Test;

public class LoginTests {

    @Test(priority = 1)
    public void validLogin() {
        System.out.println("Login with valid credentials");
    }

    @Test(priority = 2, groups = "smoke")
    public void invalidLogin() {
        System.out.println("Login with invalid credentials");
    }

    @Test(priority = 3)
    public void logoutTest() {
        System.out.println("Logout test");
    }
}