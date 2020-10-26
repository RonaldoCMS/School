package it.biblioteca.frontEnd.darshboard;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JFrame;

import it.biblioteca.backend.Biblioteca;
import it.biblioteca.frontEnd.darshboard.panels.MenuPanel;
import it.biblioteca.frontEnd.darshboard.panels.TitlePanel;
import it.biblioteca.frontEnd.panelLibro.LibriPanel;
import it.biblioteca.frontEnd.panelPrestiti.PrestitiPanel;
import it.biblioteca.frontEnd.panelUtenti.UtentiPanel;
import it.biblioteca.frontEnd.standard.Colore;
import javax.swing.JPanel;

final class Darshboard extends JFrame{
	private static final long serialVersionUID = 1L;
	private MenuPanel panelMenu;
	private TitlePanel title;
	private LibriPanel panelLibro;
	private UtentiPanel panelUtenti;
	private PrestitiPanel panelPrestiti;
	private Biblioteca biblioteca;
	
	public Darshboard() {
		super("Darshboard");		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		biblioteca = new Biblioteca();
		System.out.println(biblioteca.getUtenti().getUtenti().get(0));
		getContentPane().setBackground(Colore.getVerdeBlur());
		getContentPane().setLayout(null);	
		
		TitlePanel panelTitle = new TitlePanel(this, "Biblioteca");
		panelTitle.setBounds(0, 0, 890, 36);
		getContentPane().add(panelTitle);
		
		panelLibro = new LibriPanel(biblioteca.getLibri());
		objPanel(panelLibro);
		
		panelUtenti = new UtentiPanel(biblioteca.getUtenti());
		objPanel(panelUtenti);
		
		panelPrestiti = new PrestitiPanel();
		objPanel(panelPrestiti);
		
		panelMenu = new MenuPanel(panelLibro, panelUtenti, panelPrestiti);
		panelMenu.setBounds(0, 56, 99, 102);
		getContentPane().add(panelMenu);	
		
		setSize(890, 750);
		setUndecorated(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void objPanel(JPanel panel) {
		panel.setBounds(99, 56, 781, 683);
		getContentPane().add(panel);
		panel.setVisible(false);
	}
	
	public static void main(String[] args) {
		Darshboard start = new Darshboard();
	}
}
