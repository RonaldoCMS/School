
public class Main {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Calcolo(10, 10));
		
		 t1.start();

	}

}
