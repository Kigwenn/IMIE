import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Fenetre2 extends JFrame {
		
	private JPanel pan = new JPanel();
	
	// Group
	private JButton bouton = new JButton("Mon bouton");
	
	// Group
    private JCheckBox checkbox = new JCheckBox("Mon checkbox");
    
    // Group 
    private JRadioButton oui = new JRadioButton("oui",true);
    private JRadioButton non = new JRadioButton("non",true);
    private ButtonGroup bg = new ButtonGroup();
    
    // etiquette
    private JLabel etiquette = new JLabel("Mon etiquette");
    
    // Texte
    private JTextField field = new JTextField("test");
    private JComboBox combo = new JComboBox();
    
	public Fenetre2(){

	// liste d'option deroulante
	
	// Titre 
	this.setTitle("Ma deuxieme fenêtre Java");

	// Taille
	this.setSize(500,500);
			
	// Bouton fermer Visible
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);

	// fenetre
	this.setBackground(Color.GREEN);
		
	// liste d'option deroulante
	combo.setPreferredSize(new Dimension(100, 20));
	combo.addItem("vert");
	combo.addItem("bleu");
	combo.addItem("noir");
	combo.addItem("rouge");
	combo.setSelectedItem("rouge");
		
			
	// panneau principal
	this.getContentPane().setVisible(false);
	this.getContentPane().setBackground(Color.BLUE);
	this.setContentPane(pan);
	
	
	// affiche dans le panel
	// Bouton
		pan.add(bouton);

	// checkbox		
	pan.add(checkbox);

	// Radio 
	bg.add(oui);
	bg.add(non);
	pan.add(oui);
	pan.add(non);
	
	// Etiquette
	pan.add(etiquette);
	
	// Champ								
	pan.add(field);
			
	// Liste deroulante
	pan.add(combo);
			
	this.setContentPane(pan);
	this.setVisible(true);
	
	}
}
