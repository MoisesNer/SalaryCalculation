package cs.task1;

import java.time.LocalDate;

public class SalesEmployee extends Employee{
	
	private double commitionRate;
	private double totalSales;
	
	public SalesEmployee(String firstName, String lastName, String email, String phoneNum, LocalDate startDay, double commitionRate, double totalSales) {
		super(firstName, lastName, email, phoneNum, startDay);
		setCommitionRate(commitionRate);
		setTotalSales(totalSales);
		
		}
	public double getCommitionRate(){
		return commitionRate;
	}
	public double getTotalSales() {
		return totalSales;
	}
	
	public void setCommitionRate(double commitionRate){
		if(commitionRate > 0) {
			this.commitionRate = commitionRate;
		} else { commitionRate = 1;}
	}
	
	public void setTotalSales(double totalSales){
		if(totalSales > 0) {
			this.totalSales = totalSales;
		} else { totalSales =1;}
	}
		public String toString() {
			return super.toString() + "\nCommition Rate: $" + commitionRate + ". Total Sales: $" + totalSales + ". Total Income: $" + (commitionRate * totalSales);
		}
	//implementation of calculateIncome
		@Override
		public double calculateIncome() {
			// TODO Auto-generated method stub
			return commitionRate * totalSales;
		}
}
