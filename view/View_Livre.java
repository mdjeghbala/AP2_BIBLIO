package view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;

import controller.mainMVC;
import model.model;

import java.awt.List;
import java.sql.SQLException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class View_Livre {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Livre window = new View_Livre();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the application.
	 * @throws SQLException 
	 */
	public View_Livre() throws SQLException {
		mainMVC.getM().getAll();
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 255, 250));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		List list = new List();
		list.setBounds(117, 79, 307, 130);
		frame.getContentPane().add(list);
		
		JButton btnNewButton = new JButton("FERMER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(299, 21, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Liste des livres:");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_1.setForeground(new Color(25, 25, 112));
		lblNewLabel_1.setBounds(136, 44, 220, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Mohamed.D\\eclipse-workspace\\ap2\\src\\images\\listelivres.png"));
		lblNewLabel.setBounds(-13, 63, 158, 158);
		frame.getContentPane().add(lblNewLabel);
		

		
		System.out.println(mainMVC.getM().getListLivre().size());
	
		for (int i=0;i!=mainMVC.getM().getListLivre().size();i++)
		{
			
			list.add(mainMVC.getM().getListLivre().get(i).Ligne());
		
		}
		
			
	}
}
