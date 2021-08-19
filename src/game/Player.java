package game;

import fixtures.Room;

public class Player {
	//represents the player moving through these rooms 
	RoomManager rm = new RoomManager();
	
	
	Room currentRoom = rm.startingRoom; //room the player is currently in 
	
	
	public void init() {
		RoomManager rm = new RoomManager();
		rm.init();
	}
	public Room getCurrentRoom() {
		return this.currentRoom;
	}
	
	public Room setCurrentRoom(Room location) {
		return currentRoom = location;
	}
}
