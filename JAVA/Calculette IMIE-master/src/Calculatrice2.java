import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Calculatrice2 extends JFrame {

	private JPanel container = new JPanel(); 				//container principal
	private JLabel ecran;									//ecran d'affichage de la calculette
	private String[] paveNumerique = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", "="};
	private String[] paveOperateurs = {"C", "+", "-", "*", "/"};
	private boolean clicOperateur;							//booleen qui retient si le user a deja clique sur un operateur
	private String operateur;								//memorise le dernier operateur saisi
	private boolean calcul;									//memorise si un precedent calcul a ete fait
	
	public Calculatrice2() {
		setSize(350, 350);
		setTitle("Calculette");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		clicOperateur = false;
		operateur = "";
		calcul = false;
		
		initComposants();
		
		setContentPane(container);
		setVisible(true);
	}

	/**
	 * Fonction qui initialise les composants de la calculatrice
	 */
	public void initComposants()
	{
		container.setLayout(new BorderLayout());
		
		initAffichage();
		initPaveNumerique();
		initOperateurs();
	}
	
	/**
	 * Initialisation de l'ecran d'affichage
	 */
	public void initAffichage()
	{
		 JPanel panEcran = new JPanel();
		 
		 //panEcran.setBackground(Color.RED);
		 panEcran.setBorder(new EmptyBorder(5, 5, 5, 5));
		 
		 ecran = new JLabel("0", JLabel.RIGHT);
		 ecran.setPreferredSize(new Dimension(330, 50));
		 ecran.setOpaque(true); //pour voir le background
		 ecran.setBackground(new Color(144, 147, 146));
		 ecran.setForeground(Color.WHITE); //couleur de la policec
		 ecran.setBorder(new EmptyBorder(5, 5, 5, 5));
		 
		 panEcran.add(ecran);
		 container.add(panEcran, BorderLayout.NORTH);
	}
	
	/**
	 * Init le pave numerique central
	 */
	public void initPaveNumerique()
	{
		JPanel panPave = new JPanel();
		panPave.setPreferredSize(new Dimension(350*3/4, 300));
		//panPave.setBackground(Color.BLUE);
		panPave.setLayout(new GridLayout(4, 3));
		panPave.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		//Init des boutons
		for(int i=0; i<paveNumerique.length; ++i)
		{
			JButton button = new JButton(paveNumerique[i]);
			button.setPreferredSize(new Dimension(350/4, 300/4));
			if(!paveNumerique[i].equals(".") && !paveNumerique[i].equals("="))
				button.addActionListener(new ChiffresListener()); //listener pour les chiffres
			else if(paveNumerique[i].equals("="))
				button.addActionListener(new OperateurListener()); //listener pour les operateurs
			panPave.add(button);
		}
		
		container.add(panPave, BorderLayout.CENTER);
	}
	
	public void initOperateurs()
	{
		JPanel panPave = new JPanel();
		//panPave.setBackground(Color.YELLOW);
		panPave.setPreferredSize(new Dimension(350/4, 300));
		panPave.setLayout(new GridLayout(5, 1));
		panPave.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		//Init des boutons
		for(int i=0; i<paveOperateurs.length; ++i)
		{
			JButton button = new JButton(paveOperateurs[i]);
			button.setPreferredSize(new Dimension(350/4, 300/5));
			button.setAlignmentX(CENTER_ALIGNMENT);
			if(!paveOperateurs[i].equals("C"))
				button.addActionListener(new OperateurListener());
			else {
				button.setForeground(Color.RED);
				button.addActionListener(new ResetListener());
			}
			panPave.add(button);
		}
		
		container.add(panPave, BorderLayout.EAST);
	}
	
	public class ChiffresListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String chiffre = ((JButton)e.getSource()).getText();
			
			//Si on vient de faire un calcul et que l'on pas saisi d'operateur alors on doit repartir de 0
			if(calcul && !clicOperateur)
			{
				ecran.setText("0");
				calcul = false;
			}
			
			if(!chiffre.equals("0") || !ecran.getText().equals("0"))
			{
				if(ecran.getText().equals("0"))
					ecran.setText("");
				ecran.setText(ecran.getText() + chiffre);
			}
		}
	}
	
	//Gere l'ecoute des operateurs
	public class OperateurListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String op = ((JButton)e.getSource()).getText();
			
			//Quand on clique sur "=", on calcule l'operation en cours
			if(op.equals("="))
			{
				calcul();
				operateur = "";
				clicOperateur = false;
			}
			//des que l'on clique sur un autre operateur, on memorise qu'on est en train de saisir notre 2e nombre
			else
			{
				if(clicOperateur)
				{
					calcul();
				}
				ecran.setText(ecran.getText() + " " + op + " ");
				operateur = op;
				clicOperateur = true;
			}
		}	
	}
	
	//Reset de tous les parametres
	public class ResetListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			calcul = false;
			clicOperateur = false;
			operateur = "";
			ecran.setText("0");
		}
	}
	
	/**
	 * Appeler quand l'utilisateur a appuye sur la touche "="
	 */
	public void calcul()
	{
		System.out.println("calcul : " + ecran.getText());
		//Si on a clique sur un operateur, il y a un calcul a faire
		if(clicOperateur)
		{
			double resultat, valG, valD;
			String [] split;
			
			System.out.println("op = " + operateur);
			
			//Les caracteres "+" et "*" sont des meta caracteres, on doit les echapper pour que la methode split fonctionne correctement
			//La fonction "split" place dans un tableau toutes les chaines de caractere separe par mon char "operateur"
			//par exemple si operateur vaut "+", alors la chaine "3+32" va se separer en deux chaines "3" et "32"
			if(operateur.equals("+") || operateur.equals("*"))
				split = ecran.getText().split("\\" + operateur);
			else
				split = ecran.getText().split(operateur); 
			
			//On recupere les valeurs
			valG = Double.valueOf(split[0]); //valeur a gauche de mon operateur
			valD = Double.valueOf(split[1]); //valeur a droite
			resultat = 0;
			
			switch (operateur) 
			{
				case "+":
					resultat = valG + valD;
					break;
				case "-":
					resultat = valG - valD;
					break;
				case "*":
					resultat = valG * valD;
					break;
				case "/":
					//Attention pour la division on doit traiter le cas de la division par zero
					if(valD != 0)
						resultat = valG / valD;
					else
						resultat = 0;
					break;
				default:
					break;
			}
			
			//Affichage du resultat, traitement special si c'est un entier pour enlever la virgule
			if(resultat == Math.round(resultat))
				ecran.setText(String.valueOf((int)resultat));
			else
				ecran.setText(String.valueOf(resultat));
			
			calcul = true;
		}
		else
			calcul = false;
	}
}
