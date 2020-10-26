/***
 * @author RonaldoCMS
 * @version 1.0.0
 */

package agenda;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import agenda.backend.ItemsManager;
import agenda.backend.alunno.Alunno;
import agenda.backend.classe.Classe;
import agenda.backend.classe.Indirizzo;
import agenda.backend.materia.Materia;
import agenda.backend.materia.Voto;
import agenda.backend.primitive.Data;
import agenda.frontend.appPanels.Body;
import agenda.frontend.appPanels.OptionsBody;

public class App extends JFrame {

	private JPanel contentPane;
	private Body body;
	private ItemsManager manager;
	private OptionsBody options;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public App() {
		List<Alunno> alunno = new LinkedList<Alunno>();
		alunno.add(new Alunno("WEWE", "Mammt", new Data(0,0,0), "Mammt"));

		alunno.add(new Alunno("Sort", "Sort", new Data(0,0,0), "Mammt"));
		
		List<Voto> voto = new LinkedList<Voto>();
		voto.add(new Voto(new Materia("Mammttt"), new Data(0,0,0), "AA", 10));
		
		HashMap<Alunno, List<Voto>> classee = new HashMap<Alunno, List<Voto>>();
		
		List<Classe> c = new LinkedList<Classe>();
		c.add(new Classe(classee, 1, "A", Indirizzo.INF));
		c.get(0).getAgenda().put(alunno.get(0), voto);
		
		manager = new ItemsManager(c);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		body = new Body(manager.getClasse());
		
		contentPane.add(body, BorderLayout.CENTER);
		
		options = new OptionsBody();
		contentPane.add(options, BorderLayout.SOUTH);
	}

}
