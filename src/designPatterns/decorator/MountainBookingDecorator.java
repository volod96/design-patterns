package designPatterns.decorator;

import designPatterns.businessLogic.Payable;

public class MountainBookingDecorator extends BookingDecorator implements Payable {
	private int altitude;
	
	public MountainBookingDecorator(Payable payMethod, int altitude) {
		super(payMethod);
		this.altitude = altitude;
	} 
	
	@Override
	public void pay(float totalPrice) {
		System.out.println("Paying for booking " + this.getId() + " at " + this.altitude + " m");
	}

	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
	
	
}
