package unOggetto;

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
import com.sun.javadoc.Type;

public class Persona {
	private String nome;
	private String cognome;
	
	
	
	public Persona(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
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



	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	public static void main(String[] args) {
		File f = new File("Persona.json");
		String str = null;
		String s = "";
		try {
			BufferedReader fr = new BufferedReader(new FileReader(f));
			while((str = fr.readLine()) != null) {
				s = s + str;
			}
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(s);
		
		Persona[] p = new Gson().fromJson(s, Persona[].class);
		
		ArrayList<Persona> pe = new Gson().fromJson(s, ArrayList.class);
		pe.add(new Persona("Ciao", "Mondo"));
		//System.out.println(pe.toString());
		
		java.lang.reflect.Type test = new TypeToken<ArrayList<Persona>>() {
			
		}.getType();
		System.out.println(s);
		List<Persona> persone = new Gson().fromJson(s, test);
		System.out.println(persone.get(0).toString());
		//System.out.println(p[0].nome);
		//System.out.println(p.get(0).toString());
		
        //persone.get(0).setCognome("Ronaldo");
    
        //String s1 = new Gson().toJson(persone.toArray()); 
        
//        try {
//			FileWriter fw = new FileWriter(f);
//			fw.write(s1);
//			fw.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        
//	}
	}
	
}
