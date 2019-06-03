package exercises;

public class Minion {
	
	private String name; 
	private int eyes; 
	private String colour; 
	private String master;
	
	public Minion (String name, int eyes, String colour, String master) {
		
		this.name = name;
		this.eyes = eyes;
		this.colour = colour;
		this.master = master;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getMaster() {
		return master;
	}

	public void setMaster(String master) {
		this.master = master;
	}

}
