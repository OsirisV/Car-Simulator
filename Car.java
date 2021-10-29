import java.util.*;
import java.io.*;


public class Car {

	//Declaring the objects private
	private Engine engine;
	private Tires tires;
	private Doors doors;
	private Window window; 
	private FuelTank fueltank;
	
	Collection<CarPart> parts;


	//Car constructor containing reference variable for instances of each car part
	public Car(Engine engine, Tires tires, Doors doors, Window window, FuelTank fueltank) {
		
		this.engine = engine;
		this.tires = tires;
		this.doors = doors;
		this.window = window;
		this.fueltank = fueltank;

		parts = new ArrayList<CarPart>();

		parts.add(engine);
		parts.add(tires);
		parts.add(doors);
		parts.add(window);
		parts.add(fueltank);
	}


	//Collection of car parts

	void run() {
		for(CarPart iris : parts) {
			iris.function();
		}
	}

}
