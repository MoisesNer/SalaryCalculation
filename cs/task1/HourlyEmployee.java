package cs.task1;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
	
	private double payRate;
	private int hoursWorking;
	
	public HourlyEmployee(String firstName, String lastName, String email, String phoneNum, LocalDate startDay, double payRate, int hoursWorking) {
		
		super(firstName, lastName, email, phoneNum, startDay);
		setPayRate(payRate);
		setHoursWorking(hoursWorking);

	}

	/**
	 * @return the payRate
	 */
	public double getPayRate() {
		return payRate;
	}

	/**
	 * @return the hoursWorking
	 */
	public int getHoursWorking() {
		return hoursWorking;
	}

	/**
	 * @param payRate the payRate to set
	 */
	public void setPayRate(double payRate) {
		if(payRate > 0) {
		this.payRate = payRate;
		} else { this.payRate = 1; }
	}

	/**
	 * @param hoursWorking the hoursWorking to set
	 */
	public void setHoursWorking(int hoursWorking) {
		if(hoursWorking > 1 && hoursWorking <= 40) {
		this.hoursWorking = hoursWorking;
		} else if(hoursWorking > 40) {
			this.hoursWorking = 40;
		} else { this.hoursWorking = 1;}
	}
	
	public String toString() {
		return super.toString() + "\nPay Rate: " +  payRate + ". Hours Worked: " + hoursWorking + ". Total Income: " + (payRate * hoursWorking);
	}
	
	@Override
	public double calculateIncome() {
		// TODO Auto-generated method stub
		return payRate * hoursWorking;
	}
}
