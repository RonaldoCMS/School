package main.obj;

public class Rettangolo {
	
	private int base;
	private int altezza;
	private int perimetro;
	private int area;
	
	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
		calcPerimetro();
		calcArea();
		
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {

		this.base = base;
		calcPerimetro();
		calcArea();
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {

		this.altezza = altezza;
		calcPerimetro();
		calcArea();
	}

	public int getPerimetro() {
		return perimetro;
	}

	public int getArea() {
		return area;
	}
	
	private void calcPerimetro() {
		this.perimetro = (2 * this.base) + (2 * this.altezza);
	}
	private void calcArea() {
		this.area = this.base * this.altezza;
	}

	@Override
	public String toString() {
		return "Rettangolo [base=" + base + ", altezza=" + altezza + ", perimetro=" + perimetro + ", area=" + area
				+ "]";
	}
	
}
