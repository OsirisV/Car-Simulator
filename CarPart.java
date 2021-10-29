
public class CarPart implements CarInterface {

	int condition;

	public CarPart(){
		condition = 0;
	}

	public CarPart(int condition) {
		this.condition = condition;
	}

	public void function() {
		
	}

	public void status(){
		if(condition > 0) {
			System.out.println(this.getClass().getSimpleName() + "Its good");
		} else {
			System.out.println(this.getClass().getSimpleName() + "Its tweakin");
		}
	}
}
