package it.biblioteca.backend.libreria;

import it.biblioteca.backend.abstracts.Persona;

public class Autore extends Persona{
	
	public Autore(String nome, String cognome) {
		super(nome, cognome);
	}

	@Override
	public String toString() {
		return super.getNome() + " " + super.getCognome();
	}
	
}
