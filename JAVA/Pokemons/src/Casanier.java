
public class Casanier extends Terre {

//==== Attributs ================================================
	
	private int heureJeu;
		
//==== Constructeurs ============================================	

	public Casanier(String nom, int poid, int nbPattes, double taille,
			int heureJeu) {
		super(nom, poid, nbPattes, taille);
		this.heureJeu = heureJeu;
	}
	
//==== Methodes =================================================

	public String toString() {
		return super.toString()+"+ Je suis de Type : Casanier, je joue " + heureJeu + " heure par jour\n";
	}
	
//==== Getter / Setter ==========================================		

	public int getHeureJeu() {
		return heureJeu;
	}

	public void setHeureJeu(int heureJeu) {
		this.heureJeu = heureJeu;
	}
	
}
