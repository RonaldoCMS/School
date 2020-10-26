package it.biblioteca.backend.libreria;

import it.biblioteca.backend.utenti.Utente;

public class LibroItem {
	
	private String codice;
	private boolean isPrestito;
	private Utente Cliente;
	
	
	
	public LibroItem(String codice, boolean isPrestito, Utente cliente) {
		super();
		this.codice = codice;
		this.isPrestito = isPrestito;
		Cliente = cliente;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public boolean isPrestito() {
		return isPrestito;
	}
	public void setPrestito(boolean isPrestito) {
		this.isPrestito = isPrestito;
	}
	public Utente getCliente() {
		return Cliente;
	}
	public void setCliente(Utente cliente) {
		Cliente = cliente;
	}
	
	
	
}
