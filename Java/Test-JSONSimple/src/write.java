import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class write {

	public static void main(String[] args) {
		
		File file = new File("Persona.json");
		
		JSONObject me = new JSONObject();
		me.put("Nome:", "Fabio");
		me.put("Cognome:", "Danubbio");
		
		JSONArray arr = new JSONArray();
		arr.add("c");
		arr.add("Java");
		
		me.put("Array", arr);
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write(me.toString());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		System.out.println(me.toString());
	}

}
