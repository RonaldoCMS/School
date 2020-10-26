package it.biblioteca.backend.prestiti;

import java.util.List;

import it.biblioteca.backend.libreria.Libro;
import it.biblioteca.backend.libreria.LibroItem;
import it.biblioteca.backend.utenti.Utente;

public class Prestito {

	private LibroItem libro;
	private Utente utente;
	private String dataInizio;
	private String dataFine;
	
	public Prestito(LibroItem libro, Utente utente, String dataInizio, String dataFine) {
		super();
		this.libro = libro;
		this.utente = utente;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
	}
	public LibroItem getLibro() {
		return libro;
	}
	public void setLibro(LibroItem libro) {
		this.libro = libro;
	}
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public String getDataInizio() {
		return dataInizio;
	}
	public void setDataInizio(String dataInizio) {
		this.dataInizio = dataInizio;
	}
	public String getDataFine() {
		return dataFine;
	}
	public void setDataFine(String dataFine) {
		this.dataFine = dataFine;
	}
	
	
	
	
	
}
