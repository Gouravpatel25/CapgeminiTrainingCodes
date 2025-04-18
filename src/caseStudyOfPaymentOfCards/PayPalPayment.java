package caseStudyOfPaymentOfCards;
public class PayPalPayment extends Payment {

	public PayPalPayment(double amount, long transactionId) {
		super(amount, transactionId);
	}

	@Override
	double processPayment(double amount) {
		double discount = 0;
		if(amount > 500) {
			discount = (10 * amount) / 100;
		}
		discountd = discount;
		transactionf = 3 * (amount - discount) / 100;
		return amount + transactionf - discount;
	}
}
