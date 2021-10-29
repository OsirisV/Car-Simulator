
public class Window extends CarPart{

	private boolean taint; //tainted or not
	
	public Window() {
		super();
	}

	public Window(boolean taint){
		this.taint = taint;
	}

	public void funtion() {
		this.setTainted(taint);
		System.out.println("The Windows tainted status is; " + isTainted());
	}

	void setTainted(boolean taint) {
		this.taint = taint;
	}

	public boolean isTainted() {
		return taint;
	}
}