
abstract public class Terre extends Pokemon {

//───── Attributs ────────────────────────────────────────────────
	
	protected int nbPattes;
	protected double taille;
	
//───── Constructeurs ────────────────────────────────────────────
				
	public Terre(String nom, int poids, int nbPattes, double taille) {
		super(nom, poids);
		this.nbPattes = nbPattes;
		this.taille = taille;
	}
	
//───── Methodes ─────────────────────────────────────────────────


	public String toString() {
		return super.toString()+"├ Je me deplace sur la terre et j'ai " + nbPattes + " pattes.\n├ j'ai une taille de " + taille + " m.\n";
	}
	
	public double vitesse(){
		double v = nbPattes*taille*3;
		return v;	
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Terre other = (Terre) obj;
		if (nbPattes != other.nbPattes)
			return false;
		if (Double.doubleToLongBits(taille) != Double
				.doubleToLongBits(other.taille))
			return false;
		return true;
	}
	
//───── Getter / Setter ──────────────────────────────────────────	
	
	public int getNbPattes() {
		return nbPattes;
	}

	public void setNbPattes(int nbPattes) {
		this.nbPattes = nbPattes;
	}

	public double getTaille() {
		return taille;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}
	
}
