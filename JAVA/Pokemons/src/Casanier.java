
public class Casanier extends Terre {

//==== Attributs ================================================
	
	private int heureJeu;
		
//==== Constructeurs ============================================	

	public Casanier(String nom, int poids, int nbPattes, double taille,	int heureJeu) {
		super(nom, poids, nbPattes, taille);
		this.heureJeu = heureJeu;
		System.out.println("├─ Le "+nom+" vient de voir le jour");
		System.out.println("");
	}
	
//==== Methodes =================================================

	public String toString() {
		return super.toString()+"└ Je suis de Type : Casanier, je joue " + heureJeu + " heure par jour\n";
	}
	
//==== Getter / Setter ==========================================		

	public int getHeureJeu() {
		return heureJeu;
	}

	public void setHeureJeu(int heureJeu) {
		this.heureJeu = heureJeu;
	}
	
}
