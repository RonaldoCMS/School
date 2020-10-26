package agenda.backend.materia;

import agenda.backend.primitive.Data;

public class Voto {
	
	private Materia materia;
	private Data data;
	private String descrizione;
	private double voto;
	
	public Voto(Materia materia, Data data, String descrizione, double voto) {
		super();
		this.materia = materia;
		this.data = data;
		this.descrizione = descrizione;
		this.voto = voto;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getVoto() {
		return voto;
	}

	public void setVoto(double voto) {
		this.voto = voto;
	}
	
	
	
	
	
}
