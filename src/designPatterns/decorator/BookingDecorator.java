package designPatterns.decorator;

import designPatterns.businessLogic.Payable;

/**
 * An abstract decorator for different types of booking payments
 */
public abstract class BookingDecorator implements Payable {
	private Payable payMethod;
	private int id = generateId();
	private static int idGenerator = 1;		
			
	private static int generateId() {
		return ++idGenerator;
	}
	
	public BookingDecorator(Payable payMethod) {
		this.payMethod = payMethod;
	}
	
	@Override
	public void pay(float totalPrice) {
		this.payMethod.pay(totalPrice);
	}

	public int getId() {
		return id;
	}
	
	public Payable getPayMethod() {
		return this.payMethod;
	}
}
