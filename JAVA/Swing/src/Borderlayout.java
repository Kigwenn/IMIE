	import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

	public class Borderlayout extends JFrame { 

		private JPanel pan  = new JPanel();
		
		private JButton nord   = new JButton("nord");
		private JButton ouest  = new JButton("ouest");
		private JButton centre = new JButton("center");
		private JButton est    = new JButton("est");
		private JButton sud    = new JButton("sud");
		
		public Borderlayout(){
			
			// Titre 
			this.setTitle("Borderlayout");

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
			this.getContentPane().setLayout(new BorderLayout());
			
			
			// affiche dans le panel
			// Bouton Nord
			pan.add(nord, BorderLayout.NORTH);
		
			
			// Bouton Ouest, Centre, Est
			//pan.add(ouest, BorderLayout.WEST);
			pan.add(ouest, BorderLayout.WEST);
			centre.setPreferredSize(new Dimension(200, 100));
			pan.add(centre, BorderLayout.CENTER);
			
			pan.add(est, BorderLayout.EAST);

			// Bouton Sud
			pan.add(sud, BorderLayout.SOUTH);			
			
			this.setContentPane(pan);
			this.setVisible(true);
		}
	}
