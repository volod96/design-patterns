package designPatterns.decorator;

import java.time.LocalDate;

import designPatterns.businessLogic.Booking;
import designPatterns.businessLogic.Customer;
import designPatterns.businessLogic.Hotel;
import designPatterns.businessLogic.Room;

public class Test {

	public static void main(String[] args) {
		Hotel hotel = new Hotel("Arriba", 3, 10, 2);
		Customer customer = new Customer("John");
		Booking booking = new Booking(customer, LocalDate.of(2018, 5, 25), LocalDate.now(), new Room[] { hotel.getRooms().get(1), hotel.getRooms().get(2) });
		booking.pay(100);
		MountainBookingDecorator mountainBooking = new MountainBookingDecorator(booking, 1000);
		mountainBooking.pay(100);
		SeasideBookingDecorator seasideBooking = new SeasideBookingDecorator(mountainBooking, "Bahamas");
		seasideBooking.pay(200);
	}

}
