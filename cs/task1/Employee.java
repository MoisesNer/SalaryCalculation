package cs.task1;

import java.time.LocalDate;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNum;
	LocalDate startDay = LocalDate.of(2000, 1, 1);
	public final String DEFAULT_STRING = "Unknown";
	
	public Employee(String firstName, String lastName, String email, String phoneNum, LocalDate startDay){
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setPhoneNum(phoneNum);
		setStartDay(startDay);
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public LocalDate getStartDay() {
		return startDay;
	}
	
	public void setFirstName(String firstName) {
		if(!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		} else { this.firstName = DEFAULT_STRING;}
	}
	
	public void setLastName(String lastName) {
		if(!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		} else { this.lastName = DEFAULT_STRING;}
	}
	public void setEmail(String email) {
		if(!email.isEmpty() && !email.equalsIgnoreCase(null)) {
			this.email = email;
		} else { this.email = DEFAULT_STRING;}
	}
	public void setPhoneNum(String phoneNum) {
		if(!phoneNum.isEmpty() && !phoneNum.equalsIgnoreCase(null)) {
			this.phoneNum = phoneNum;
		} else { this.phoneNum = DEFAULT_STRING;}
	}
	public void setStartDay(LocalDate startDay) {
		LocalDate d = LocalDate.of(1950, 1, 1);
		if(startDay.compareTo(d) > 0) {
			this.startDay = startDay;
		} else { this.startDay = (d);}
	}
	public abstract double calculateIncome();
		
	
	public String toString() {
		return "Name: " + getFirstName() + " " + getLastName() + ". Email: " + getEmail() + ". Phone Number: " + getPhoneNum() + ". Start Date: " + getStartDay();
	}
}
