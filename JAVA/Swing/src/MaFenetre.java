import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;

public class MaFenetre extends JFrame {
	
// création d'une barreMenus Popup
		JPopupMenu pop = new JPopupMenu(" Mon menu ");
		
// création d'une barreMenus 1
		JMenuBar barreMenus = new JMenuBar();
		
// création d'une barreMenus 2
		
		JMenuBar barreMenus2 = new JMenuBar();
		
// création d'une barre d'outils	
		JToolBar barreOutils = new JToolBar();
		
		public MaFenetre() {
		super("Une fenetre qui traite les clics souris");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
// creation d'un bouton de label image, rouge et vert pour la barre d'outil
		ImageIcon boutonIcon = new ImageIcon("images/uioi.gif");
		JButton boutonRouge = new JButton("Rouge");
		JButton boutonVert = new JButton("Vert");
		
		AbstractAction icon = new AbstractAction("ton icone", boutonIcon) {
	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			}
		};
		
// on affecte cette barreMenu 1 a notre fenetre
		setJMenuBar(barreMenus); 

// on affecte cette barreMenu 2 a notre fenetre		
		setJMenuBar(barreMenus2);

// on affecte cette barre d'outils a un panneau		
		getContentPane().add(barreOutils);
		barreOutils.setFloatable(true);
		
// Ajout bouton a la barre d'outil Rouge , image et vert		
		barreOutils.add(icon);
		barreOutils.add(boutonRouge);
		barreOutils.add(boutonVert);

//		
		boutonRouge.doClick();
		boutonVert.doClick();
		
		
// Ajout de la barreMenu 1 dans la fenetre
// création d'un menu Couleur et de ses options Rouge et Vert
		JMenu couleur = new JMenu("Couleur");
		barreMenus.add(couleur);
		final JMenuItem rouge = new JMenuItem("Rouge");
		couleur.add(rouge);
		
//ajout d'une barre séparatrice avant l'option suivante
		couleur.addSeparator();
		JMenuItem vert = new JMenuItem("Vert");
		couleur.add(vert);
		
// Ajout de la barreMenu 2 dans la fenetre
//création d'un menu Couleur2 et de ses options bleu et jaune		
		JMenu couleur2 = new JMenu("Couleur2");
		barreMenus2.add(couleur2);

// Ajout menu avec boutton
		JRadioButtonMenuItem bleu = new JRadioButtonMenuItem("bleu");
		JRadioButtonMenuItem jaune = new JRadioButtonMenuItem("jaune");
		couleur.add(bleu);
		couleur.add(jaune);		

//Les option boutons radio sont placée dans un groupe de type ButonGroup afin d'assurer
//l'unicité de la sélection à l'interieur du groupe
		ButtonGroup groupe = new ButtonGroup();
		groupe.add(bleu);
		groupe.add(jaune);
			
//la fenetre fait appel a un écouteur souris pour traiter les clics souris
		addMouseListener(new EcouteurSouris());

//On selectionne l'option bleu par defaut
		bleu.setSelected(true);
		
//Si l'option jaune est selectionné
		if(jaune.isSelected()){
			//faire quelque chose !
		}
		
		
		vert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.GREEN);
				
			}
		});
		
		rouge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.RED);
				
			}
		});
		
		boutonRouge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rouge.doClick(); 
			}
		});
		
		boutonVert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.GREEN);
				
			}
		});
		
		bleu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.BLUE);
				
			}
		});
		
		jaune.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.YELLOW);
				
			}
		});
		
	pop.add(rouge);
		
// le premier argument correspond à la fenêtre parent de la boite de message.
// Cet argument peu prendre la valeur null.
	
JOptionPane.showMessageDialog(this,"Salut je suis une boite de dialogue !");	
	
//le premier argument correspond à la fenêtre parent de la boite de message.
//Cet argument peu prendre la valeur null.
	
JOptionPane.showMessageDialog(this,"Message de la boite", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);

JOptionPane.showConfirmDialog(this,"Voulez-vous continuer ?");

JOptionPane.showMessageDialog(this,"Message de la boite", "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);

JOptionPane.showMessageDialog(this,"Message de la boite", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);

JOptionPane.showMessageDialog(this,"Message de la boite", "QUESTION_MESSAGE", JOptionPane.QUESTION_MESSAGE);

JOptionPane.showMessageDialog(this,"Message de la boite", "PLAIN_MESSAGE", JOptionPane.PLAIN_MESSAGE);



		}
		
			
	
//L'ecouteur d'évenements souris doit implementer l'interface MousListener qui correspond
//a une categorie d'événement souris.

	class EcouteurSouris implements MouseListener {
	 
//redefinition de la méthode appelée  lors d'un clic souris

		public void mouseCliked(MouseEvent e) {
			System.out.println("clic dans la fenetre");
		}
	
// la  redefinition des autre méthodes est "vide"

		public void mouseClicked(MouseEvent e){}
		public void mousePressed(MouseEvent e) {}

	
		public void mouseReleased(MouseEvent e) {
			if (e.getButton() == MouseEvent.BUTTON3) {
				pop.show(getContentPane(), e.getX(),e.getY());
			}
		}
	
		public void mouseExited(MouseEvent e) {}
		public void mouseEntered(MouseEvent arg0) {}
		
		
	}
}