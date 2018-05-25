package designPatterns.businessLogic;

import java.time.LocalDate;

/**
 * Allows customers to book rooms for a definite amount of time
 */
public class Booking implements Payable {
	private LocalDate startDate;
	private LocalDate endDate;
	private Customer customer;
	private Room[] rooms;
	
	public Booking(Customer customer, LocalDate startDate, LocalDate endDate, Room[] rooms) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.rooms = rooms;
		this.customer = customer;
	}
	
	public Hotel getHotel() {
		return rooms.length > 0 ? rooms[0].getHotel() : null;
	}
	
	public int getSpan() {
		return this.endDate.compareTo(this.startDate);
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Room[] getRooms() {
		return rooms;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void start() {
		float totalPay = 0f;
		for(Room room : this.rooms) {
			room.setAvailable(false);
			totalPay += this.getSpan() * room.getPrice();
		}
		this.pay(totalPay);
	}

	@Override
	public void pay(float totalPrice) {
		System.out.println(totalPrice + " has been payed for booking by " + this.customer.getName());
	}
}
