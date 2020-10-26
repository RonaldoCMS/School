package it.biblioteca.backend;

import it.biblioteca.backend.libreria.ListLibro;
import it.biblioteca.backend.prestiti.ListPrestito;
import it.biblioteca.backend.utenti.ListUtente;
import it.biblioteca.backend.utenti.Utente;

public class Biblioteca {
	
	private ListLibro libri;
	private ListUtente utenti;
	private ListPrestito prestiti;
	
	public Biblioteca(ListLibro libri, ListUtente utenti, ListPrestito prestiti) {
		super();
		this.libri = libri;
		this.utenti = utenti;
		this.prestiti = prestiti;
		

	}
	
	public Biblioteca() {
		this.libri = new ListLibro();
		this.utenti = new ListUtente();
		this.prestiti = new ListPrestito();
		

	}

	public ListLibro getLibri() {
		return libri;
	}

	public void setLibri(ListLibro libri) {
		this.libri = libri;
	}

	public ListUtente getUtenti() {
		return utenti;
	}

	public void setUtenti(ListUtente utenti) {
		this.utenti = utenti;
	}

	public ListPrestito getPrestiti() {
		return prestiti;
	}

	public void setPrestiti(ListPrestito prestiti) {
		this.prestiti = prestiti;
	}
	
	
	
}
