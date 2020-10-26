package it.biblioteca.backend.utenti;

import it.biblioteca.backend.abstracts.Persona;

public class Utente extends Persona{

	private String codiceFiscale;
	private String numero;
	private String email;
	
	public Utente(String nome, String cognome, String codiceFiscale, String numero, String email) {
		super(nome, cognome);
		this.codiceFiscale = codiceFiscale;
		this.numero = numero;
		this.email = email;
	}
	
	

}
