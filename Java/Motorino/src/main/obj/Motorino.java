package main.obj;

public class Motorino {
	
	private	String colore;
	private String tipo;
	private double kmh;
	private boolean antifurto;

	public Motorino(String colore, String tipo, double kmh) {
		this.colore = colore;
		this.tipo = tipo;
		this.kmh = kmh;
		this.antifurto = false;
	}

	public double getKmh() {
		return kmh;
	}

	public void setKmh(double kmh) {
		if(!this.antifurto)
			this.kmh = kmh;
		else
			System.out.println("L'antifurto è accesso.");
	}

	public boolean isAntifurto() {
		return antifurto;
	}

	public void setAntifurto(boolean antifurto) {
		this.antifurto = antifurto;
	}
	
	
	
	
}
