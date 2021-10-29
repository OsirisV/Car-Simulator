
public class Engine extends CarPart{

	
	public Engine() {
		super();
	}
	
	public Engine(int condition) {
		super(condition);
	}

	public void function() {
		this.setCondition(condition);
		System.out.println("Engine condition is: " + getCondition());
	}

	void setCondition(int condition){
		this.condition = condition;
	}
	int getCondition() {
		return condition;
	}
}
