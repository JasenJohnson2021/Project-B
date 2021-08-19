package fixtures;

public class Room extends Fixture {
	
	Room[] exits; //the rooms adjacent to this one 
	//size of the array depends on how many 
	//directions you want to support
	
	
	
	//constructor 
	public Room(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
		
		this.exits = new Room[3];
	}

	
	public Room[] getExits() {
		return exits;
		
	}
	
	public Room getExit(String direction) {
		return null;
		
	}
	
	
}