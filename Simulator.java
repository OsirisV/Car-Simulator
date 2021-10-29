
public class Simulator {
	
	public static void main(String[] Args) {
		
		Engine engine = new Engine(90);
		Tires tires = new Tires(57, 56);
		Doors doors = new Doors("yellow", 2);
		Window window = new Window(true);
		FuelTank fueltank = new FuelTank(1.5);
		
		Car car = new Car(engine,tires,doors,window,fueltank);
		car.run();
	}
}