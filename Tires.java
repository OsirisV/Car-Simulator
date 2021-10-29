
public class Tires extends CarPart{

	private int wearlevel; //how long till its garbage

	public Tires(){
		super();
	}
	
	public Tires(int wearlevel, int condition) {
		super(condition);
		this.wearlevel = wearlevel;
	}

	public void function(){
		this.setCondition(condition);
		this.setWearlevel(wearlevel);
		System.out.println("The tire wearlevel is " + getWearLevel() + ", and the tire condition is: " + getCondition());	
	}

	void setCondition(int condition){
		this.condition = condition;
	}
	int getCondition() {
		return condition;
	}

	void setWearlevel(int wearlevel){
		this.wearlevel = wearlevel;
	}
	int getWearLevel() {
		return wearlevel;
	}
}
