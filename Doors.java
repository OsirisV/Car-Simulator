
public class Doors extends CarPart{

	private String color; //what color is it
	private int numOfDoors; //2, 4, 6 seater?

	public Doors() {
		super();
	}
	
	public Doors(String color, int numOfDoors){
		this.color = color;
		this.numOfDoors = numOfDoors;
	}

	public void funtion(){
		this.setColor(color);
		this.setSeater(numOfDoors);
		System.out.println("The color of this car is: " + getColor() + "\nThe number of doors this car has is: "
				+ getSeater());
	}
	void setColor(String color) {
		this.color = color;
	}
	public String getColor(){
		return color;
	}


	void setSeater(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}
	public int getSeater(){
		return numOfDoors;
	}

}
