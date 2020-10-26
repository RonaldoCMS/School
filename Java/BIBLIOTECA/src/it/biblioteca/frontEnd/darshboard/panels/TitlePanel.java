package it.biblioteca.frontEnd.darshboard.panels;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Point;

import javax.swing.SwingConstants;

import it.biblioteca.frontEnd.standard.Colore;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class TitlePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private Point clickMouse;
	private JLabel lblTitle;
	private JPanel panelExit;
	private JLabel exit;

	public TitlePanel(JFrame frame, String title) {
		

		setLayout(null);
		setBackground(Colore.getVerdeBlur());
		setBounds(1, 1, 893, 32);

		lblTitle = new JLabel(title);
		configTitle();
		
		panelExit = new JPanel();
		panelExit(frame);
		

		exit = new JLabel("X");
		labelExit(frame);
	}
	
	private void configTitle() {
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setFont(new Font("Verdana", Font.PLAIN, 22));
		lblTitle.setBounds(23, 0, 753, 30);
		add(lblTitle);
	}
	
	private void panelExit(JFrame frame) {
		panelExit.setBounds(848, 0, 45, 30);
		panelExit.setBackground(Colore.getVerdeBlur());
		panelExit.setLayout(new BorderLayout(0, 0));
		
		panelExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelExit.setBackground(Color.RED);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				panelExit.setBackground(Colore.getVerdeBlur());
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}

		});
		add(panelExit);
	}
	
	private void labelExit(JFrame frame) {
		exit.setForeground(Color.WHITE);
		exit.setHorizontalAlignment(SwingConstants.CENTER);
		exit.setFont(new Font("Verdana", Font.PLAIN, 14));
		panelExit.add(exit);
		
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				Point newClick = e.getLocationOnScreen(); // Recupera le nuove coordinate
				newClick.translate(-clickMouse.x, -clickMouse.y);

				frame.setLocation(newClick);
			}
		});
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				clickMouse = e.getPoint();
			}
		});
	}
	
}
