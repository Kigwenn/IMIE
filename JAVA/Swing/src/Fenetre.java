
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Fenetre extends JFrame {
	
	public Fenetre(){
		
		JPanel pan0 = new JPanel();
		MonBouton b1 = new MonBouton("bouton1");
		MonBouton b2 = new MonBouton("bouton2");
		
		// Titre 
		this.setTitle("Ma premiere fenêtre Java");

		// Taille
		this.setSize(500,500);
		this.setLocationRelativeTo(null);

		// Bouton fermer Visible
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(pan0);
		this.getContentPane().setVisible(true);

		//Affectaion du bouton au panneau pan0
		pan0.add(b1);
		pan0.add(b2);
		
		//this.getContentPane().setBackground(Color.BLUE);
		this.setVisible(true);
		
	}

}
