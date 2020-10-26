package agenda.backend.classe;

import java.util.HashMap;
import java.util.List;

import agenda.backend.alunno.Alunno;
import agenda.backend.materia.Voto;

public class Classe {
	
	private HashMap<Alunno, List<Voto>> agenda;
	private int classe;
	private String sezione;
	private Indirizzo indirizzo;

	public Classe(HashMap<Alunno, List<Voto>> agenda, int classe, String sezione, Indirizzo indirizzo) {
		super();
		this.agenda = agenda;
		this.classe = classe;
		this.sezione = sezione;
		this.indirizzo = indirizzo;
	}
	
	

	public HashMap<Alunno, List<Voto>> getAgenda() {
		return agenda;
	}



	public void setAgenda(HashMap<Alunno, List<Voto>> agenda) {
		this.agenda = agenda;
	}



	public int getClasse() {
		return classe;
	}

	public void setClasse(int classe) {
		this.classe = classe;
	}

	public String getSezione() {
		return sezione;
	}

	public void setSezione(String sezione) {
		this.sezione = sezione;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	
	
	
}
