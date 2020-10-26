
public class Calcolo implements Runnable {
	
	private int x, y;
	
	
	
	public Calcolo(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}



	@Override
	public void run() {
		System.out.println(x + y);
	}

}
