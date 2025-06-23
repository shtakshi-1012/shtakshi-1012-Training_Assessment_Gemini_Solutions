package tests;

import org.testng.annotations.Test;

public class PaymentTests {

    @Test(priority = 1, groups = "smoke")
    public void validPayment() {
        System.out.println("Payment with valid card");
    }

    @Test(priority = 2)
    public void invalidPayment() {
        System.out.println("Payment with invalid card");
    }

    @Test(priority = 3)
    public void paymentHistory() {
        System.out.println("Checking payment history");
    }
}