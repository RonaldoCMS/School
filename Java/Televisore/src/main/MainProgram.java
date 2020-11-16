package main;

import main.obj.Televisore;

public class MainProgram {

	public static void main(String[] args) {
		Televisore televisore = new Televisore(false, 2, 1, false);
		
		televisore.pulsanteRosso();
		
		//Canale -> 1 
		System.out.println(televisore.getCanale());
		
		televisore.canaleSuccessivo();
		
		//Canale --> 2
		System.out.println(televisore.getCanale());
		
		televisore.setCanale(200);
		
		//Canale --> 2
		System.out.println(televisore.getCanale());
		
		televisore.aumentaVolume();
		//Volume --> 3
		System.out.println(televisore.getVolume());
		
		
	}
	
}
