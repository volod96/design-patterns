package designPatterns.decorator;

import designPatterns.businessLogic.Payable;

public class SeasideBookingDecorator extends BookingDecorator implements Payable {
	private String seasideCityName;

	public SeasideBookingDecorator(Payable payMethod, String seasideCityName) {
		super(payMethod);
		this.seasideCityName = seasideCityName;
	}

	public String getSeasideCityName() {
		return seasideCityName;
	}

	public void setSeasideCityName(String seasideCityName) {
		this.seasideCityName = seasideCityName;
	}
	
	@Override
	public void pay(float totalPrice) {
		System.out.println("Paying for booking no " + this.getId() + " on " + this.seasideCityName);
		this.getPayMethod().pay(totalPrice);
	}
}
