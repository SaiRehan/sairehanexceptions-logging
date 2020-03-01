package demo;

public class simple_interest {
	
	double amount,noofyears,rate;
	
	public simple_interest(double amount, double noofyears, double rate) {
		// TODO Auto-generated constructor stub
		this.amount=amount;
		this.noofyears=noofyears;
		this.rate=rate;
	}

	public double calculate() {
		// TODO Auto-generated method stub
		return (amount*noofyears*rate)/100;
	}

	

}
