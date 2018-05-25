package designPatterns.businessLogic;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * A unit capable of accomodating customers
 * @see Room
 */
public class Hotel {
	private ArrayList<Room> rooms = new ArrayList<>();
	private String name;
	private int stars;
	
	/**
	 * Uses the layout of the hotel to generate consecutive room numbers starting from 1 multiplied by 100 and by the floor number
	 * @param floors Number of floors of the hotel
	 * @param roomsPerFloor Number of rooms per each floor
	 */
	private void generareRoomNumbers(int floors, int roomsPerFloor) {
		for(int floor = 0; floor <= floors; floor++) {
			int floorPrefix = floor * 100;		
			 this.rooms = (ArrayList<Room>)Stream.concat(this.rooms.stream(), 
					 							         IntStream.range(floorPrefix, floorPrefix + roomsPerFloor)
					 							         	      .boxed().map(number -> new Room(number)))
					                             .collect(Collectors.toList());
		}
	}
	
	public Hotel(String name, int floors, int roomsPerFloor, int stars) {
		this.name = name;
		this.stars = stars;
		generareRoomNumbers(floors, roomsPerFloor);
	}

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}	
}
