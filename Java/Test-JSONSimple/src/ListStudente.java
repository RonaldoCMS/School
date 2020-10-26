import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ListStudente {
	
	List<Studente> lista;
	JSONObject jobj;
	
	public ListStudente() {
		super();
		this.lista = new ArrayList<>();
		try {
			loadStudenti();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Studente> getLista() {
		return lista;
	}

	public void setLista(List<Studente> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "ListStudente [lista=" + lista + "]";
	}
	
	private void loadStudenti() throws FileNotFoundException, IOException, ParseException {
		//Creo il Parser per importare qui tutto
		JSONParser parser = new JSONParser();
		//System.out.println(parser.toString());
		
		//Leggo il file che mi interessa
		Object obj = parser.parse(new FileReader("Studente.json"));
		System.out.println(obj.toString());
		
		

	}
	
}
