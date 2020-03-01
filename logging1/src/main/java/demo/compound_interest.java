package demo;

public class compound_interest {
	double amount,noofyears,rate;

	public compound_interest(double amount, double noofyears, double rate) {
		// TODO Auto-generated constructor stub
		this.amount=amount;
		this.noofyears=noofyears;
		this.rate=rate;
	}

	public double calculate1() {
		// TODO Auto-generated method stub
		 return amount * Math.pow(1.0+rate/100.0,noofyears) - amount;
	}

}
