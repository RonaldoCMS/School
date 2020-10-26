package it.biblioteca.frontEnd.darshboard.panels;

import javax.swing.JPanel;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import it.biblioteca.frontEnd.standard.Colore;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuPanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	private JPanel Libripanel;
	private JPanel Utentipanel;
	private JPanel PrestitiPanel;
	
	public MenuPanel(JPanel libri, JPanel utenti, JPanel prestiti) {
		setLayout(new GridLayout(3, 0, 0, 0));
		
		Libripanel = new JPanel();
		Libripanel.setForeground(Color.WHITE);
		Libripanel.setBorder(null);
		Libripanel.setDoubleBuffered(false);
		Libripanel.setFocusTraversalKeysEnabled(false);
		Libripanel.setFocusable(false);
		Utentipanel = new JPanel();
		PrestitiPanel = new JPanel();
		
		configPanels(Libripanel, "Libri", libri, utenti, prestiti);
		configPanels(Utentipanel, "Utenti", libri, utenti, prestiti);
		configPanels(PrestitiPanel, "Prestiti", libri, utenti, prestiti);	
	}
	
	public void configPanels(JPanel panel, String title, JPanel libri, JPanel utenti, JPanel prestiti) {
		JLabel label = new JLabel(title);
		
		label.setForeground(Color.white);
		label.setFont(new Font("Verdana", Font.PLAIN, 12));
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label);
		
		panel.setBackground(Colore.getVerdeBlur());
		
		panel.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				JPanel button = (JPanel) e.getSource();
				button.setBackground(Colore.getVerdeScuro());
			}
			
			public void mouseExited(MouseEvent e) {
				JPanel button = (JPanel) e.getSource();
				button.setBackground(Colore.getVerdeBlur());
			}
			
			public void mouseClicked(MouseEvent e) {
				
				utenti.setVisible(false);
				prestiti.setVisible(false);
				libri.setVisible(false);
				
				
				if (title.equals("Libri")) {
					libri.setVisible(true);
				}
				else if (title.equals("Prestiti")) {
					prestiti.setVisible(true);
				}
				else if (title.equals("Utenti")) {
					utenti.setVisible(true);
				}
			}
			
		});
		add(panel);
		
	}
	


	public JPanel getLibripanel() {
		return Libripanel;
	}

	public void setLibripanel(JPanel libripanel) {
		Libripanel = libripanel;
	}

	public JPanel getUtentipanel() {
		return Utentipanel;
	}

	public void setUtentipanel(JPanel utentipanel) {
		Utentipanel = utentipanel;
	}

	public JPanel getPrestitiPanel() {
		return PrestitiPanel;
	}

	public void setPrestitiPanel(JPanel prestitiPanel) {
		PrestitiPanel = prestitiPanel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
