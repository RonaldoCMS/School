package main;

import main.obj.Motorino;

public class MainProgram {

	public static void main(String[] args) {
		
		int flag;
		
		Motorino moto1 = new Motorino("Giallo", "Tipo", 100.5);
		System.out.println(moto1.getKmh());
		moto1.setKmh(200);
		System.out.println(moto1.getKmh());
		
		moto1.setAntifurto(true);
		moto1.setKmh(100);
		
		moto1.setAntifurto(false);
		moto1.setKmh(100);
		System.out.println(moto1.getKmh());
		
	}
	
}
