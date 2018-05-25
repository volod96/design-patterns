package designPatterns.businessLogic;

/**
 * One of the rooms of an accomodating unit
 */
public class Room {
	private int number;
	private boolean cleaned;
	private boolean available;
	
	public Room(int number) {
		super();
		this.number = number;
		this.cleaned = false;
		this.available = true;
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
}
