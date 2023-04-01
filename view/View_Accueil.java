package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class View_Accueil {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Accueil window = new View_Accueil();
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
	 */
	public View_Accueil() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_Livre = new JButton("Liste des Livres");
		btn_Livre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				View_Livre vl;
				try {
					vl = new View_Livre();
					//vl.main(null);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
		});
		btn_Livre.setBounds(23, 116, 167, 28);
		frame.getContentPane().add(btn_Livre);
		
		JButton btn_resa = new JButton("R\u00E9server un livre");
		btn_resa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				View_resa vr = new View_resa();
		
			}
		});
		btn_resa.setBounds(23, 170, 167, 26);
		frame.getContentPane().add(btn_resa);
		
		JButton btnCrationAdhrent = new JButton("Cr\u00E9ation Adh\u00E9rent");
		btnCrationAdhrent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				View_CreationAdherent vca= new View_CreationAdherent();
			}
		});
		btnCrationAdhrent.setBounds(240, 61, 167, 28);
		frame.getContentPane().add(btnCrationAdhrent);
		
		JButton btn_restituer = new JButton("Restituer un livre");
		btn_restituer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				View_RestitutionLivres vrl= new View_RestitutionLivres();
			}
		});
		btn_restituer.setBounds(240, 170, 167, 27);
		frame.getContentPane().add(btn_restituer);
		
		JButton btn_compte = new JButton("Compte Adherent");
		btn_compte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				View_CompteAdherent vrl= new View_CompteAdherent();
			}
		});
		btn_compte.setBounds(240, 117, 161, 26);
		frame.getContentPane().add(btn_compte);
		
		JButton btnNewButton = new JButton("Creation livres");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				View_CreationLivre vcl= new View_CreationLivre();
			}
		});
		btnNewButton.setBounds(23, 61, 167, 28);
		frame.getContentPane().add(btnNewButton);
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\myzs1_fw3t3bc\\eclipse-workspace\\Projet\\AP2\\src\\images\\biblio.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel);
		

	}
}
