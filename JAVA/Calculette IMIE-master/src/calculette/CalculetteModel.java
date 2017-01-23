package calculette;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class CalculetteModel extends Observable {

	private ArrayList<Observer> listObserver = new ArrayList<Observer>(); 
	private boolean clicOperateur;							//booleen qui retient si le user a deja clique sur un operateur
	private String operateur;								//memorise le dernier operateur saisi
	private boolean calcul;									//memorise si un precedent calcul a ete fait
	private String ecran;
	
	public CalculetteModel() {
		clicOperateur = false;
		operateur = "";
		calcul = false;
		ecran = "";
	}
	
	public void setChiffre(String chiffre)
	{	
		System.out.println("Modele qui recoit un nouveau chiffre saisi depuis le controlleur");
		
		//Si on vient de faire un calcul et que l'on pas saisi d'operateur alors on doit repartir de 0
		if(calcul && !clicOperateur)
		{
			ecran = "0";
			calcul = false;
		}
		
		if(!chiffre.equals("0") || !ecran.equals("0"))
		{
			if(ecran.equals("0"))
				ecran = "";
			ecran += chiffre;
		}
		
		setChanged();
		notifyObservers(this);
	}
	
	public void setOperateur(String op)
	{
		System.out.println("Modele qui recoit un nouveau operateur saisi depuis le controlleur");
		
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
			ecran += " " + op + " ";
			operateur = op;
			clicOperateur = true;
		}
		
		setChanged();
		notifyObservers(this);
	}
	
	public void reset()
	{
		System.out.println("Modele qui recoit un reset depuis le controlleur");
		
		calcul = false;
		clicOperateur = false;
		operateur = "";
		ecran = "0";
		
		setChanged();
		notifyObservers(this);
	}
	
	/**
	 * Appeler quand l'utilisateur a appuye sur la touche "="
	 */
	public void calcul()
	{
		System.out.println("calcul : " + ecran);
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
				split = ecran.split("\\" + operateur);
			else
				split = ecran.split(operateur); 
			
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
			
			//String a afficher dans l'ecran, traitement special si c'est un entier pour enlever la virgule
			if(resultat == Math.round(resultat))
				ecran = String.valueOf((int)resultat);
			else
				ecran = String.valueOf(resultat);
			
			calcul = true;
		}
		else
			calcul = false;
	}

	/**
	 * @return the ecran
	 */
	public String getEcran() {
		return ecran;
	}
}
