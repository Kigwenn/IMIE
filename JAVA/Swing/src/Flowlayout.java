import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flowlayout extends JFrame {

	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Bouton");
	
	public Flowlayout(){
		
		// Titre 
		this.setTitle("FlowLayout");

		// Taille
		this.setSize(300,300);
				
		// Bouton fermer Visible
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		// fenetre couleur
		this.setBackground(Color.GREEN);
		
		// panneau principal
		this.setContentPane(pan);
		this.getContentPane().setVisible(false);
		this.getContentPane().setBackground(Color.BLUE);
		
		// affiche dans le panel
		// Bouton
		pan.add(bouton);
	
		this.setContentPane(pan);
		this.setVisible(true);
	}
}
