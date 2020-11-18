package main;

import main.obj.Rettangolo;

public class MainProgram {

	public static void main(String[] args) {
		Rettangolo r = new Rettangolo(2, 2);
		
		System.out.println(r.toString());
		
		r.setAltezza(4);
		
		System.out.println(r.toString());
		
		
	}

}
