package it.biblioteca.frontEnd.panelLibro;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTable;
import it.biblioteca.backend.libreria.ListLibro;
import it.biblioteca.frontEnd.standard.Colore;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LibriPanel extends JPanel {

	
	private static final long serialVersionUID = 1L;
	private JTable table;
	
	public LibriPanel(ListLibro libri) {
		setBackground(Colore.getVerdeBlur());
		setSize(890, 750);
		setLayout(null);
	}
}
