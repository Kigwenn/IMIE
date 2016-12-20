
abstract public class Eau extends Pokemon  {

//==== Attributs ================================================
	
	protected int nbNageoires;
	
//==== Constructeurs ============================================	
				
	public Eau(String nom, int poids, int nbNageoires) {
		super(nom, poids);
		this.nbNageoires = nbNageoires;
	}
	
//==== Methodes =================================================

	public String toString() {
		return super.toString()+"├ Je me deplace dans l'eau et j'ai " + nbNageoires + " nageoires.\n";
	}

	
//==== Getter / Setter ==========================================	
	
	public int getNbNageoires() {
		return nbNageoires;
	}

	public void setNbNageoires(int nbNageoires) {
		this.nbNageoires = nbNageoires;
	}
}
