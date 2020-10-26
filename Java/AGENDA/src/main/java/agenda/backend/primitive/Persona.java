package agenda.backend.primitive;

public class Persona {
	
	private String nome;
	private String cognome;
	private Data nascita;
	private String indirizzo;
	
	public Persona(String nome, String cognome, Data nascita, String indirizzo) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.nascita = nascita;
		this.indirizzo = indirizzo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Data getNascita() {
		return nascita;
	}

	public void setNascita(Data nascita) {
		this.nascita = nascita;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	
}
