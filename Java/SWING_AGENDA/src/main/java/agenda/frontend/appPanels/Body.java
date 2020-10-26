package agenda.frontend.appPanels;

import javax.swing.JPanel;

import agenda.backend.classe.Classe;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

/**
 * 
 * @author FABIO
 *
 * @apiNote Contiene tutti gli jcomponent della darshboard dell'applicativo.
 *
 *
 */
public class Body extends JPanel {
	
	public Body(List<Classe> classi) {
		
		JButton btnNewButton = new JButton("New button");
		add(btnNewButton);
		
		List<JButton> buttons = new LinkedList<JButton>();
		int i = 0;
		
		for(Classe e : classi) {
			buttons.add(new JButton(String.valueOf(e.getClasse()) + " " + e.getSezione() + " " + e.getIndirizzo()));
			buttons.get(i).setForeground(Color.WHITE);
			buttons.get(i).setFont(new Font("Trebuchet MS", Font.PLAIN, 33));
			buttons.get(i).setBackground(Color.GRAY);
			buttons.get(i).setFocusPainted(false);
			buttons.get(i).setFocusTraversalKeysEnabled(false);
			buttons.get(i).setFocusable(false);
			add(buttons.get(i));
			i++;
		}
		
	}

}
