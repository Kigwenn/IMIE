
abstract public class Pokemon {

//==== Attributs ================================================
	
	protected String nom;
	protected int poids;
	
//==== Constructeurs ============================================
	
	public Pokemon(String nom, int poids) {
			super();
			this.nom = nom;
			this.poids = poids;
		}

//==== Methodes =================================================
	
	public String toString() {
		return "┌ Je suis le pokémon " + nom + ".\n├ Mon poids est de " + poids + "kg.\n";
	}
	
	abstract double vitesse();
	
//==== Getter / Setter ==========================================	
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPoid() {
		return poids;
	}
	public void setPoid(int poids) {
		this.poids = poids;
	}
}
