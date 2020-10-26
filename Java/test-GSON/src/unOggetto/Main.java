package unOggetto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) {
		
//		/********
//		 * Esporta oggetto
//		 */
//		List<Persona> p = new ArrayList<>();
//		File f = new File("Persona.json");
//		
//	      Persona santa = new Persona("Santa", "Claus");
//	      Gson gson = new Gson();
//	      System.out.println(gson.toJson(santa));
//
//	      String json = "{\"nome\":\"Peter\",\"cognome\":\"Captain Hook\"}";
//	      Persona peterPan = gson.fromJson(json, Persona.class);
//	      
//	      p.add(new Persona(peterPan.getNome(), peterPan.getCognome()));
//	      p.add(new Persona("Gennaro", "Genny"));
//	      
//	      System.out.println(p.get(0));
//	      
//	      System.out.println(peterPan);
//	      
//	      try {
//			FileWriter fw = new FileWriter(f);
//			for (Persona pe : p) {
//				fw.write(pe.toString());
//				fw.flush();
//			}
//			
//			fw.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		List<Persona> lista = new ArrayList();
		lista.add(new Persona("Giorgio", "Giorgione"));
		lista.add(new Persona("Fabio", "Giorgione"));
		lista.add(new Persona("Pippo", "Giorgione"));
		
		/***
		 * Scrittura
		 */
		File f = new File("Persona.json");
		try {
			FileWriter fw = new FileWriter(f, false);
			fw.write("[\n");
			fw.flush();
			for(Persona p : lista) {
				fw.write("\t{ \"nome\" : " + "\"" + p.getNome() + "\", " + "\"cognome\" : " +  "\"" + p.getCognome() + "\" }, \n");
				fw.flush();
			}
			fw.write("]");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/***
		 * Lettura
		 */
		
		List<Persona> lista2 = new ArrayList<>();
		
		Gson gson = new Gson();
		String json = lista.toString();
		Persona pe = gson.fromJson(json, Persona.class);
		System.out.println(pe.getNome());

//	      Persona santa = new Persona("Santa", "Claus");
//	      Gson gson = new Gson();
//	      System.out.println(gson.toJson(santa));
//
//	      String json = "{\"nome\":\"Peter\",\"cognome\":\"Captain Hook\"}";
//	      Persona peterPan = gson.fromJson(json, Persona.class);
//	      
//	      p.add(new Persona(peterPan.getNome(), peterPan.getCognome()));
		
	}

}
