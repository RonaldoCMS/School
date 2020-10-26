package it.biblioteca.backend.libreria;

import java.util.List;

public class Libro {
	
	private String titolo;
	private List<Autore> autori;
	private String edizione;
	private String genere;
	private String sottogenere;
	private String linguaOriginale;
	private String ambientazione;
	private List<LibroItem> items;
	
	public Libro(String titolo, List<Autore> autori, String edizione, String genere, String sottogenere,
			String linguaOriginale, String ambientazione, List<LibroItem> items) {
		super();
		this.titolo = titolo;
		this.autori = autori;
		this.edizione = edizione;
		this.genere = genere;
		this.sottogenere = sottogenere;
		this.linguaOriginale = linguaOriginale;
		this.ambientazione = ambientazione;
		this.items = items;
	}

	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public List<Autore> getAutori() {
		return autori;
	}
	public void setAutori(List<Autore> autori) {
		this.autori = autori;
	}
	public String getEdizione() {
		return edizione;
	}
	public void setEdizione(String edizione) {
		this.edizione = edizione;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public String getSottogenere() {
		return sottogenere;
	}
	public void setSottogenere(String sottogenere) {
		this.sottogenere = sottogenere;
	}
	public String getLinguaOriginale() {
		return linguaOriginale;
	}
	public void setLinguaOriginale(String linguaOriginale) {
		this.linguaOriginale = linguaOriginale;
	}
	public String getAmbientazione() {
		return ambientazione;
	}
	public void setAmbientazione(String ambientazione) {
		this.ambientazione = ambientazione;
	}
	public List<LibroItem> getItems() {
		return items;
	}
	public void setItems(List<LibroItem> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", autori=" + autori + ", edizione=" + edizione + ", genere=" + genere
				+ ", sottogenere=" + sottogenere + ", linguaOriginale=" + linguaOriginale + ", ambientazione="
				+ ambientazione + ", items=" + items + "]";
	}

}
