package game;
import java.util.Scanner;

import fixtures.Room;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 1;
		
		System.out.println("Beginning of Application");
		Scanner sc = new Scanner(System.in);
		
		RoomManager rm = new RoomManager();
		rm.init();
		
		Player p = new Player();
		p.setCurrentRoom(rm.getFirstRoom());
		
		System.out.println(p.getCurrentRoom());
		
		while(choice != 0) {
		collectInput(sc);
		parse(args, p);
		}
		
		System.out.println("End of application");
		sc.close();
		}
	
	private static void printRoom(Room currentRoom) {
		//print a prompt to the console for the players current room
		
	}
	
	private static String[] collectInput(Scanner sc) {
		//use a scanner to collect input from user and will divide that 
		//input into multiple parts 
		//an action and the target for ex go east
		String y1= "north";
		String y2 = "south";
		String y3 = "east";
		String y4 = "west"; 
		String y5 = "0";
		
		System.out.println("\n Choose a direction north, south, east, or west");
		System.out.println("Press 0 to end the programd");
	
			String y = sc.nextLine();
			if(y.equals(y1)) {
				System.out.println("You travel north");
			} 	else if(y.equals(y2)) {
				System.out.println("You travel south");
			} 	else if(y.equals(y3)) {
				System.out.println("You travel east");
			} 	else if(y.equals(y4)) {
				System.out.println("You travel west");
			} 	else if(y.equals(y5)) {
				System.out.println("Exiting");
				System.exit(0);
			} else {
				System.out.println("Not a valid direction ");
			}
			
		return null;
	}
	
	private static void parse(String[] command, Player player) {
		/*
		 * take ouput of collectInput() method and a player object
		 * and will resolve that command. first index of the passed-in
		 * should be the action, so you can switch on that and handle
		 * the target differently for each case. Player object is there
		 * so you can modify if needed like changing plaeyrs current room based
		 * on the direction moved 
		 */
		
		
	}

}
