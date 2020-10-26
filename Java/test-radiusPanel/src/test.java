import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.ComponentOrientation;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.RoundRectangle2D;
import java.awt.Dialog.ModalExclusionType;

public class test extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
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
	public test() {
		addComponentListener(new ComponentAdapter() {
            @Override
             public void componentResized(ComponentEvent e) {
                 setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 120, 120));
             }
         });
		setAutoRequestFocus(false);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setUndecorated(true);
		setRootPaneCheckingEnabled(false);
		setResizable(false);
		setVisible(true);
		setOpacity(1.0f);
		setForeground(SystemColor.textHighlight);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\FABIO\\Desktop\\cop-6.jpg"));
		setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		setBackground(SystemColor.textHighlightText);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1158, 551);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setVerifyInputWhenFocusTarget(false);
		contentPane.setFocusable(false);
		contentPane.setFocusTraversalKeysEnabled(false);
		contentPane.setEnabled(false);
		contentPane.setDoubleBuffered(false);
		contentPane.setOpaque(false);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\FABIO\\Desktop\\cop-7.png"));
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(498, -26, 662, 612);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\FABIO\\Desktop\\cop-6.png"));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(-88, -61, 834, 669);
		contentPane.add(lblNewLabel);
	}
}
