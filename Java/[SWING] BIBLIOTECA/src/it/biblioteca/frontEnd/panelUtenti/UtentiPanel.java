package it.biblioteca.frontEnd.panelUtenti;

import javax.swing.JPanel;

import it.biblioteca.backend.utenti.ListUtente;
import it.biblioteca.backend.utenti.Utente;
import it.biblioteca.frontEnd.standard.BTable;

import javax.swing.JLabel;
import javax.swing.JList;

public class UtentiPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	public UtentiPanel(ListUtente lista) {
		setSize(781, 683);
		setLayout(null);
		
		
		BTable tabella = new BTable();
		add(tabella);

	}
}
