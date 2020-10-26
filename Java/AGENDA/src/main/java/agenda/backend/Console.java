package agenda.backend;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import agenda.backend.alunno.Alunno;
import agenda.backend.classe.Classe;
import agenda.backend.classe.Indirizzo;
import agenda.backend.materia.Materia;
import agenda.backend.materia.Voto;
import agenda.backend.primitive.Data;

public class Console {

	public static void main(String[] args) {
		
		List<Alunno> alunno = new LinkedList<Alunno>();
		alunno.add(new Alunno("WEWE", "Mammt", new Data(0,0,0), "Mammt"));

		alunno.add(new Alunno("Sort", "Sort", new Data(0,0,0), "Mammt"));
		
		List<Voto> voto = new LinkedList<Voto>();
		voto.add(new Voto(new Materia("Mammttt"), new Data(0,0,0), "AA", 10));
		
		HashMap<Alunno, List<Voto>> classee = new HashMap<Alunno, List<Voto>>();
		
		List<Classe> c = new LinkedList<Classe>();
		c.add(new Classe(classee, 1, "A", Indirizzo.INF));
		c.get(0).getAgenda().put(alunno.get(0), voto);
		
		ItemsManager test = new ItemsManager(c);
		
		
		test.getClasse().get(0).getAgenda().forEach( (k,v) ->{
			System.out.println(k.getNome());
		}
		); 
		
		
	

	}

}
