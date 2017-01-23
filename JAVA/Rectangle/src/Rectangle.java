
public class Rectangle implements IRectangle {
	
	private int longueur;
	private int largeur;
	
	public Rectangle(int longueur, int largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public float perimetre() {
		float p = (largeur+longueur)*2;
		return p;
	}
		
	@Override
	public String toString() {
		return "Rectangle [ perimetre=" + perimetre() + ", angle=" + angle()
				+ ", largeur=" + largeur() + ", longueur=" + longueur()
				+ ", nbCotes=" + nbCotes() + " ]";
	}

	@Override
	public float angle() {
		return angle;
	}

	@Override
	public float largeur() {
		return largeur;
	}

	@Override
	public float longueur() {
		return longueur;
	}

	@Override
	public int nbCotes() {
		return nbCotes;
	}
	
}
