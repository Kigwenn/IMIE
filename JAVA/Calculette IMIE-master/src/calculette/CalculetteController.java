package calculette;

import java.util.ArrayList;
import java.util.Arrays;

public class CalculetteController {

	private ArrayList<String> paveNumerique = new ArrayList<String>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", "="));
	private ArrayList<String> paveOperateurs = new ArrayList<String>(Arrays.asList("C", "+", "-", "*", "/", "="));
	private CalculetteModel model;
	private String operateur;
	private String chiffre;
	
	public CalculetteController(CalculetteModel mod) {
		model = mod;
	}

	
	public void setOperateur(String operateur) {
		System.out.println("Controlleur qui recoit un operateur de la vue");
		this.operateur = operateur;
		control();
	}

	public void setChiffre(String chiffre) {
		System.out.println("Controlleur qui recoit un chiffre de la vue");
		this.chiffre = chiffre;
		control();
	}
	
	public void reset() {
		System.out.println("Controlleur qui recoit un reset de la vue");
		model.reset();
	}
	
	public void control()
	{
		//Quand on clique sur un operateur, on calcule l'operation en cours
		if(paveOperateurs.contains(operateur))
		{
			model.setOperateur(operateur); //on previent notre modele
		}
		
		if(paveNumerique.contains(chiffre))
		{
			model.setChiffre(chiffre); //on previent notre modele
		}
		
		operateur = "";
		chiffre = "";
	}

}
