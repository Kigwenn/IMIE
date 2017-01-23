package calculette;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class CalculetteView extends JFrame implements Observer {

	private JPanel container = new JPanel(); 				//container principal
	private JLabel ecran;									//ecran d'affichage de la calculette
	private String[] paveNumerique = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", "="};
	private String[] paveOperateurs = {"C", "+", "-", "*", "/"};
	
	private CalculetteController controller;				//le controlleur
	
	public CalculetteView(CalculetteController control) {
		controller = control;
		
		setSize(350, 350);
		setTitle("Calculette");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
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
	
	//Gere l'ecoute des chiffres
	public class ChiffresListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String chiffre = ((JButton)e.getSource()).getText();
			controller.setChiffre(chiffre);
		}
	}
	
	//Gere l'ecoute des operateurs
	public class OperateurListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String op = ((JButton)e.getSource()).getText();
			controller.setOperateur(op);
		}	
	}
	
	//Reset de tous les parametres
	public class ResetListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			controller.reset();
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Vue qui recoit une mis a jour de son ecran par le modele");
		
		if(o instanceof CalculetteModel)
		{
			CalculetteModel m = (CalculetteModel)arg;
			ecran.setText(m.getEcran());
		}
	}

	
	
}
