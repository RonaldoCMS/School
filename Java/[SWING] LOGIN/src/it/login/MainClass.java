package it.login;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class MainClass extends JFrame {

	private JPanel contentPane;
	private JLabel background;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainClass frame = new MainClass();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainClass() {
		
		addComponentListener(new ComponentAdapter() {
            @Override
             public void componentResized(ComponentEvent e) {
                 setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 120, 120));
             }
         });
		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 772);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbluser = new JLabel("Username");
		lbluser.setHorizontalTextPosition(SwingConstants.CENTER);
		lbluser.setForeground(Color.WHITE);
		lbluser.setHorizontalAlignment(SwingConstants.CENTER);
		lbluser.setFont(new Font("Verdana", Font.PLAIN, 18));
		lbluser.setBounds(20, 405, 123, 70);
		contentPane.add(lbluser);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBackground(Color.WHITE);
		separator.setBounds(30, 452, 300, 2);
		contentPane.add(separator);
		
		JLabel lblpsw = new JLabel("Password");
		lblpsw.setHorizontalTextPosition(SwingConstants.CENTER);
		lblpsw.setForeground(Color.WHITE);
		lblpsw.setHorizontalAlignment(SwingConstants.CENTER);
		lblpsw.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblpsw.setBounds(20, 451, 115, 70);
		contentPane.add(lblpsw);
		
		textField = new JTextField();
		textField.setBorder(null);
		textField.setForeground(Color.LIGHT_GRAY);
		textField.setFont(new Font("Verdana", Font.PLAIN, 16));
		textField.setOpaque(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(138, 434, 192, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBackground(Color.WHITE);
		separator_1.setBounds(30, 498, 300, 2);
		contentPane.add(separator_1);
		
		textField_1 = new JTextField();
		textField_1.setBorder(null);
		textField_1.setForeground(Color.LIGHT_GRAY);
		textField_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		textField_1.setOpaque(false);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(138, 480, 192, 20);
		contentPane.add(textField_1);
		
		background = new JLabel("");
		background.setBounds(5, 5, 440, 762);
		background.setHorizontalTextPosition(SwingConstants.CENTER);
		background.setHorizontalAlignment(SwingConstants.CENTER);
		background.setIcon(new ImageIcon("C:\\Users\\FABIO\\Desktop\\img\\background.jpeg"));
		contentPane.add(background);
	}
}
