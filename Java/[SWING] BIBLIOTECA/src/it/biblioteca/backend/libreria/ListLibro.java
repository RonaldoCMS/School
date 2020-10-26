package it.biblioteca.backend.libreria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import it.biblioteca.backend.utenti.Utente;


public class ListLibro {
	
	private File file;
	private List<Libro> libri;
	
	public ListLibro() {
		file = new File("Libro.json");
		libri = new ArrayList<>();
		loadItems();
//		Buon fine
//		loadItems();
//		System.out.println(libri.get(0).toString());
		
//		Buon fine il test
//		List<Autore> autori = new ArrayList<>();
//		List<LibroItem> items = new ArrayList<>();
//		Utente u = new Utente("Fabio", "Ronaldo", "ASD", "3333333", "Mammt@gmail.com");
//		items.add(new LibroItem("1", true, u));
//		items.add(new LibroItem("2", false, null));
//		autori.add(new Autore("Gue", "Pequeno"));
//		autori.add(new Autore("Luchè", "Merda"));
//		Libro libro = new Libro("Pioggia", autori, 1, "Rap", "Rap", "Ita", "MI", items);
//		libri.add(libro);
//		saveItems();
	}

	public List<Libro> getLibri() {
		return libri;
	}

	public void setLibri(List<Libro> libri) {
		this.libri = libri;
	}
	
	private void loadItems() {
		
		String str;
		String temp = "";
		
		/*
		 * Prendo informazioni dal file JSON
		 */
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((str = br.readLine()) != null) {
				/***
				 * Inserisci tutte le informazioni in una variabile di tipo Stringa
				 */
				temp = temp + str;
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/***
		 * Creo un costruttore che mi permette di creare una lista di oggetti desiderati
		 */
		java.lang.reflect.Type founderItems = new TypeToken<ArrayList<Libro>>() {
			
		}.getType();
		
		/***
		 * Aggiungo tutto dentro alla lista
		 */
		libri = new Gson().fromJson(temp, founderItems);
	}
	
	public void saveItems() {
		
        String temp = new Gson().toJson(libri.toArray()); 
        
      try {
    	  /***
    	   * Apro file
    	   * Scrivo file
    	   * Chiudo file
    	   */
			FileWriter fw = new FileWriter(file, false);
			fw.write(temp);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
	}
	
	
}
