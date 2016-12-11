
abstract public class Pokemon {

//==== Attributs ================================================
	
	protected String nom;
	protected int poid;
	
//==== Constructeurs ============================================
	
	public Pokemon(String nom, int poid) {
			super();
			this.nom = nom;
			this.poid = poid;
		}

//==== Methodes =================================================
	
	public String toString() {
		return "+ Je suis le pokémon " + nom + ".\n+ Mon poids est de " + poid + "kg.\n";
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
		return poid;
	}
	public void setPoid(int poid) {
		this.poid = poid;
	}
}
