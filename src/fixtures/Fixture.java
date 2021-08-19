package fixtures;

public abstract class Fixture {
	
	
	String name;
	String shortDesc;
	String longDesc;

	
	public Fixture(String name, String shortDesc, String longDesc) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.shortDesc = shortDesc;
		this.longDesc = longDesc;
	}
	
	public void lightbulb(boolean t) {
		System.out.println("You turned on the light");
	}
	
	public void sink(boolean t) {
		System.out.println("You turned on the sink");
	}

	@Override
	public String toString() {
		return   (name +  shortDesc  + longDesc);
	}
}
