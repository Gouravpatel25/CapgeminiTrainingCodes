package caseStudyOfPaymentOfCards;
abstract class Payment {
	private double amount;
	private long transactionId;

	protected double discountd;
	protected double transactionf;
	
	public Payment(double amount, long transactionId) {
		this.amount = amount;
		this.transactionId = transactionId;
	}

	public double getAmount() { 
		return amount; 
		}
	
	public void setAmount(double amount) {
		this.amount = amount; 
		}

	public long getTransactionId() { 
		return transactionId; 
		}
	
	public void setTransactionId(long transactionId) { 
		this.transactionId = transactionId; 
		}

	abstract double processPayment(double amount);

	public void display() {
		System.out.println("Transaction ID: " + this.getTransactionId());
		System.out.println("Original Amount: $" + this.getAmount());
		System.out.println("Discount Applied: $" + discountd);
		System.out.println("Transaction Fee: $" + transactionf);
	}
}
