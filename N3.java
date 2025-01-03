abstract class Payment {
    String transactionId;
    double amount;

    Payment(double amount, String transactionId) {
        this.amount = amount;
        this.transactionId = transactionId;
    }

    abstract void processPayment();

    void displayDetails() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: " + amount);
    }
}

class CreditCardPayment extends Payment {
    String cardNumber;

    CreditCardPayment(double amount, String transactionId, String cardNumber) {
        super(amount, transactionId);
        this.cardNumber = cardNumber;
    }

    void processPayment() {
        System.out.println("Processing credit card payment for amount: " + amount);
    }
}

class PaypalPayment extends Payment {
    String paypalId;

    PaypalPayment(double amount, String transactionId, String paypalId) {
        super(amount, transactionId);
        this.paypalId = paypalId;
    }

    void processPayment() {
        System.out.println("Processing PayPal payment for amount: " + amount);
    }
}
displayDetails() for PaypalPayment
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("PayPal ID: " + paypalId);
    }
}

public class Main {

    public static void main(String[] args) {

        CreditCardPayment creditCardPayment = new CreditCardPayment(10000, "adad124", "1234567890123456");
        creditCardPayment.processPayment();
        creditCardPayment.displayDetails();

        PaypalPayment paypalPayment = new PaypalPayment(15000, "fasd1235", "user@example.com");
        paypalPayment.processPayment();
        paypalPayment.displayDetails();
    }
}
