package agenda.frontend.appPanels;

import javax.swing.JPanel;

import agenda.frontend.appPanels.events.ClickEvent;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OptionsBody extends JPanel {
	
	private JButton btnAdd;
	private JButton btnDel;

	public OptionsBody() {
		btnAdd = new JButton("Aggiungi classe");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Aggiungi
			}
		});
		add(btnAdd);
		
		btnDel = new JButton("Rimuovi classe");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Rimuovi
			}
		});
		add(btnDel);	
	}

	public JButton getBtnAdd() {
		return btnAdd;
	}

	public void setBtnAdd(JButton btnAdd) {
		this.btnAdd = btnAdd;
	}

	public JButton getBtnDel() {
		return btnDel;
	}

	public void setBtnDel(JButton btnDel) {
		this.btnDel = btnDel;
	}
	
	
}
