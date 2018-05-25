package designPatterns.businessLogic;

import java.util.ArrayList;

/**
 * A person which wishes to go on holidays
 */
public class Customer {
	private String name;
	private ArrayList<Booking> bookings;
	
	public Customer(String name) {
		this.name = name;
	}
	
	public void book(Booking newBooking) {
		this.bookings.add(newBooking);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
