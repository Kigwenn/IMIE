import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import sun.text.resources.cldr.en.FormatData_en_NZ;

public class Calculatrice extends JFrame {
	

//pan 0	
	private JPanel pan0 = new JPanel();
	private JLabel affiche = new JLabel("Ecran");	
	
//pan 1	
	private JPanel pan1 = new JPanel();
	private Button bPoint  = new Button(".");
	private Button bEgale  = new Button("=");
	
//pan 2
	private JPanel  pan2    = new JPanel();
	private JButton bReset  = new JButton("C");
	private JButton bPlus   = new JButton("+");
	private JButton bMoins  = new JButton("-");
	private JButton bMulti  = new JButton("=");
	private JButton bDiv    = new JButton("/");
	

	public Calculatrice(){

	for(int i=0 ; i<10 ; i++) {
		MonBouton bt = new MonBouton(""+i);	
	}
		
// Titre 
		this.setTitle("Calculatrice");

// Taille
		this.setSize(350,500);
					
// Bouton fermer Visible
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

// fenetre couleur
		this.setBackground(Color.RED);
			
// Panneau Conteneur globale
		
		this.setContentPane(pan0);
		this.getContentPane().setVisible(true);
		this.getContentPane().setBackground(Color.GRAY);
		this.getContentPane().setLayout(new BorderLayout());
			
// affiche dans le panel
// Afficher

// Nord
		pan0.add(affiche, BorderLayout.NORTH);
		affiche.setPreferredSize(new Dimension(350, 80));
		
// Centre
		pan0.add(pan1, BorderLayout.CENTER);
		pan1.setLayout(new GridLayout(4,3));
		pan1.setBackground(new Color(0,102,204));
		
		((GridLayout) pan1.getLayout()).setHgap(5);
		((GridLayout) pan1.getLayout()).setVgap(5);
		Font f = new Font("Arial", Font.BOLD, 30); 
		for(int i=0 ; i<10 ; i++) {
			MonBouton b = new MonBouton(""+i);
			b.setFont(f);
			b.setBackground(new Color(102,178, 255));
		//	b.setPreferredSize(new Dimension(100,80));
			pan1.add(b);
		}
		pan1.add(bPoint);
		pan1.add(bEgale);
		bEgale.setBackground(Color.RED);
		
// Est
		pan0.add(pan2, BorderLayout.EAST);
		pan2.setLayout(new GridLayout(5,1));
		pan2.setBackground(Color.BLUE);
		
		((GridLayout) pan2.getLayout()).setHgap(5);
		((GridLayout) pan2.getLayout()).setVgap(5);
		
		pan2.add(bReset);
		pan2.add(bPlus);
		pan2.add(bMoins);
		pan2.add(bMulti);
		pan2.add(bDiv);
		
	

		this.setContentPane(pan0);
		this.setVisible(true);

	}
	
	public void mouseClicked(MouseEvent e){
		b.setText("On m'a cliquée");
		System.out.println("On m'a cliquée");
		}
 
	public void mousePressed(MouseEvent e) {
		b1.setText("Pressé !");
		System.out.println("Pressé !");
	}
	
	public void mouseReleased(MouseEvent e) {
		b1.setText("Relachâché");
		System.out.println("Relachâché");
	}
	
	// entre sur le bouton
	public void mouseEntered(MouseEvent e) {
		b1.setBackground(Color.BLUE);
	}
	// quite le bouton
	public void mouseExited(MouseEvent e) {
		b1.setText("bouton");
		b1.setBackground(Color.RED);
	}
}