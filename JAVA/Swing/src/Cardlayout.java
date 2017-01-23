import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

	public class Cardlayout extends JFrame { 

		private JPanel pan  = new JPanel();
		
		private JButton b1 = new JButton("1");
		private JButton b2 = new JButton("2");
		private JButton b3 = new JButton("3");
		private JButton b4 = new JButton("4");
		private JButton b5 = new JButton("5");
		
		public Cardlayout(){
			
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
		
			this.setContentPane(pan);
			this.getContentPane().setVisible(true);
			this.getContentPane().setBackground(Color.BLUE);
			this.getContentPane().setLayout(new CardLayout());
			
			// affiche dans le panel
			// Bouton Nord
			pan.add(b1);
			pan.add(b2);
			pan.add(b3);
			pan.add(b4);
			pan.add(b5);
							
			this.setContentPane(pan);
			this.setVisible(true);
		}
	}	