package it.biblioteca.backend.utenti;

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

public class ListUtente {
	
	private List<Utente> utenti;
	private File file;
	
	public ListUtente() {
		
		file = new File("Utente.json");
		utenti = new ArrayList<Utente>();
		try {
			//loadItems();
		}
		catch (NullPointerException e) {
			//
		}
		System.out.println(utenti.toString());
		Utente u = new Utente("A", "A", "A", "A", "A");
		utenti.add(u);
		saveItems();
	}
	
	

	public List<Utente> getUtenti() {
		return utenti;
	}



	public void setUtenti(List<Utente> utenti) {
		this.utenti = utenti;
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
		java.lang.reflect.Type founderItems = new TypeToken<ArrayList<Utente>>() {
			
		}.getType();
		
		/***
		 * Aggiungo tutto dentro alla lista
		 */
		utenti = new Gson().fromJson(temp, founderItems);
	}
	
	public void saveItems() {
		
        String temp = new Gson().toJson(utenti.toArray()); 
        
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
