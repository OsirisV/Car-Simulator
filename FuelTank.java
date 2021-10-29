
public class FuelTank extends CarPart{

	private double level; //empty, 1/4, 1/2, 3/4, full
	
	public FuelTank() {
		super();
	}
	
	public FuelTank(double level){
		this.level = level;
	}

	public void function() {
		this.setLevel(level);
		System.out.println("The fuel level tank is: " + getLevel());
	}

	public void setLevel(double level){
		this.level = level;
	}

	public double getLevel() {
		return level;
	}

}
