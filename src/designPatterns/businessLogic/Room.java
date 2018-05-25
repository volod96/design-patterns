package designPatterns.businessLogic;

/**
 * One of the rooms of an accommodating unit
 */
public class Room {
	private int number;
	private float price;
	private Hotel hotel;
	private boolean cleaned;
	private boolean available;
	
	public Room(int number, Hotel hotel, float price) {
		super();
		this.number = number;
		this.hotel = hotel;
		this.cleaned = false;
		this.available = true;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}
	
	public int getFloorNumber() {
		if(this.number < 100) {
			return 0;
		}
		else {
			return this.number / 100;
		}
	}	

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isCleaned() {
		return cleaned;
	}

	public void setCleaned(boolean cleaned) {
		this.cleaned = cleaned;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}
