package caseStudyOfPaymentOfCards;
public class DriverClass {

	public static void main(String[] args) {

		System.out.println("Processing Credit Card Payment...");
		
		Payment pcredit = new CreditCardPayment(600, 12345);
		
		double finalAmount1 = pcredit.processPayment(pcredit.getAmount());
		pcredit.display();
		
		System.out.println("Final Payable Amount: $" + finalAmount1);
		System.out.println("Credit Card Payment Successful!\n");

		
		System.out.println("Processing PayPal Payment...");
		Payment paypal = new PayPalPayment(300, 67890);
		double finalAmount2 = paypal.processPayment(paypal.getAmount());
		paypal.display();
		System.out.println("Final Payable Amount: $" + finalAmount2);
		System.out.println("PayPal Payment Successful!");
	}
}
