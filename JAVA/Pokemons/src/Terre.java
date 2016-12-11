
abstract public class Terre extends Pokemon {

//==== Attributs ================================================
	
	protected int nbPattes;
	protected double taille;
	
//==== Constructeurs ============================================
				
	public Terre(String nom, int poid, int nbPattes, double taille) {
		super(nom, poid);
		this.nbPattes = nbPattes;
		this.taille = taille;
	}
	
//==== Methodes =================================================

	@Override
	public String toString() {
		return super.toString()+"+ Je me deplace sur la terre et j'ai " + nbPattes + " pattes.\n+ j'ai une taille de " + taille + " m.\n";
	}
	
	public double vitesse(){
		double v = nbPattes*taille*3;
		return v;	
	}
	
//==== Getter / Setter ==========================================
	
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
