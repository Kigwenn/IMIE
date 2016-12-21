
abstract public class Pokemon {

//───── Attributs ────────────────────────────────────────────────
	
	protected String nom;
	protected int poids;
	
//───── Constructeurs ────────────────────────────────────────────
	
	public Pokemon(String nom, int poids) {
			super();
			this.nom = nom;
			this.poids = poids;
		}

//───── Methodes ─────────────────────────────────────────────────
	
	public String toString() {
		return "┌ Je suis le pokémon " + nom + ".\n├ Mon poids est de " + poids + "kg.\n";
	}
	
	abstract double vitesse();

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (poids != other.poids)
			return false;
		return true;
	}
	
//───── Getter / Setter ──────────────────────────────────────────		
	
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
