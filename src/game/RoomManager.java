package game;

import fixtures.Room;

public class RoomManager {
	
	//responsible for 'loading' our rooms int memory. When 
	// game.Main is executed it will invode init() method in this 
	//class that will instantiate all of our room objects, link them
	//together as exits and designate a startingROom
	
	Room startingRoom; 
	Room secondRoom;
	Room thirdRoom;
	Room fourthRoom;
	Room[] rooms = new Room[4]; //all the rooms in the house
	
	public void init() {
		Room livingRoom = new Room("Living Room", " \n A small living room", "\n A typical living room with a counch and tv" 
	+ "\n" + "There is tile on the floor. There is a glass door that leads to the front patio that is locked");
		rooms[0] = livingRoom;
		
		this.startingRoom = livingRoom;
		
		Room bedroom = new Room("s", "b", "c");
		rooms[1] = bedroom;
		
		
		
		Room bathroom = new Room("d", "d", "d");
		rooms[2] = bathroom;
		
		
		
		Room kitchen = new Room("d", "d", "d");
		rooms[3] = kitchen;
		
		
	}
	
	public Room getFirstRoom() {
		return startingRoom;
	}
		
	public Room getSecondRoom() {
		return secondRoom;
	}
	
	
	public Room getThirdRoom() {
		return thirdRoom;
	}
	
	public Room getFourthRoom() {
		return fourthRoom;
		
	}

}
