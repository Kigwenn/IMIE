import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FenetreClic extends JFrame {
	
	private Button bouton;
	private Button bouton2;
	private JPanel panneau = new JPanel();
		
	
	public FenetreClic(){
		super("Une fenetre qui traite les clics souris sur bouton");
		
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		bouton = new Button("Mon bouton");
		bouton2 = new Button("Mon bouton 2");
		
		bouton.addActionListener(new EcouteBouton1());
		bouton2.addActionListener(new EcouteBouton2());
		
		panneau.add(bouton);
		panneau.add(bouton2);
		
		setContentPane(panneau);
		setVisible(true);
	}
	
		class EcouteBouton1 implements ActionListener{ 
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clic sur le bouton 1 !");
			}
		}	
		
		class EcouteBouton2 implements ActionListener{ 
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clic sur le bouton 2 !");
			}
			
		
	}
}	
