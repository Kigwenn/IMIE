
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + nbNageoires;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Eau other = (Eau) obj;
		if (nbNageoires != other.nbNageoires)
			return false;
		return true;
	}
}
