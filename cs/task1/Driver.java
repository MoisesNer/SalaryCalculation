package cs.task1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		ArrayList<Employee> warehouse = new ArrayList<Employee>();
		
		HourlyEmployee he1 = new HourlyEmployee("Adam", "Sandler", "sands@hotmail.com", "779 545 324654", LocalDate.of(2010, 1, 1), 35, 45);
		HourlyEmployee he2 = new HourlyEmployee("Cindy", "Lauper", "timeaftertime@yahoo.com.eu", "894 121 5644", LocalDate.of(2020, 3, 14), 14, 20);
		
		SalesEmployee se1 = new SalesEmployee("Paulina", "Rubio", "paulatina@msn.com", "722 789 6341", LocalDate.of(1990, 10, 16), 0.2, 100000);
		SalesEmployee se2 = new SalesEmployee("Margaret", "", "bubbles@hotspot.com", "089 489 4464", LocalDate.of(2015, 4, 5), 0.05, 35000);
		
	//POPULATE ARRLIST
		warehouse.add(he1);
		warehouse.add(he2);
		warehouse.add(se1);
		warehouse.add(se2);
		
		printInfo(warehouse);
	}
	
	//METHODS
	
	public static void printInfo (ArrayList<Employee> department) {
		for(Employee s : department) {
			System.out.println("\nName: " + s.getFirstName() + " " + s.getLastName() + 
								".\nEmail: " + s.getEmail() + ". Phone Num: " + s.getPhoneNum() + ". Start date: " + s.getStartDay() + 
								".\nTotal Income: $" + s.calculateIncome());
		}
	}

}
