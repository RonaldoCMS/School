import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;






public class main {
	private String file;
	private JSONObject jobj;
	
	
	public main(String file) {
		this.file = file;
	}
	
	public void loadData() throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(file));
		this.jobj = (JSONObject) obj;
	}
	
	public List<String> getPersona() {
		List<String> persone = new ArrayList<>();
		
		Iterator it = this.jobj.values().iterator();
		
		while(it.hasNext()) {
			System.out.println(it.hasNext());
			String p = (String) it.next();
			persone.add(p);
		}
		
		return persone;
	}
	
	public static void main(String[] args) {
		main m = new main("Persona.json");
		try {
			m.loadData();
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
		System.out.println(m.getPersona());
		System.out.println("Hello");
	}

}
