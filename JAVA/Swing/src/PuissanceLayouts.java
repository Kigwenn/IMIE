import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.org.apache.bcel.internal.generic.NEW;

	public class PuissanceLayouts extends JFrame { 

		private JPanel pan1  = new JPanel();
		private JPanel pan2  = new JPanel();
		
		private JButton b1 = new JButton("1");
		private JButton b2 = new JButton("2");
		private JButton b3 = new JButton("3");
		private JButton b4 = new JButton("4");
		private JButton b5 = new JButton("5");
		private JButton b6 = new JButton("6");
		private JButton b7 = new JButton("7");
		private JButton b8 = new JButton("8");
		
		public PuissanceLayouts(){
			
			// Titre 
			this.setTitle("Cardlayout");

			// Taille
			this.setSize(500,500);
					
			// Bouton fermer Visible
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);

			// fenetre couleur
			this.setBackground(Color.GREEN);
			
			// panneau Conteneur globale
		
			this.setContentPane(pan1);
			this.getContentPane().setVisible(true);
			this.getContentPane().setBackground(Color.BLUE);
			this.getContentPane().setLayout(new BoxLayout(pan1, BoxLayout.PAGE_AXIS));
			
			pan2.setLayout(new GridLayout(2,3));
			pan2.setBackground(Color.GREEN);
			
			// affiche dans le panel
			// Bouton Nord
			pan1.add(b1);
			pan1.add(b2);
			pan1.add(b3);
			pan2.add(b4);
			pan2.add(b5);
			pan2.add(b6);
			pan2.add(b7);
			pan2.add(b8);
			pan1.add(pan2);				
			this.setContentPane(pan1);
			this.setVisible(true);
		}
	}	