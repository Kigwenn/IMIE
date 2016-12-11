
public class Mer extends Eau {
	
//==== Attributs ================================================
			
//==== Constructeurs ============================================	

	public Mer(String nom, int poid, int nbNageoires) {
		super(nom, poid, nbNageoires);
	}
	
//==== Methodes =================================================
	
	public String toString() {
		return super.toString()+"+ Je suis de Type : Mer \n";
	}		
	
	public double vitesse(){
		double v = (poid/25)*nbNageoires;
		return v;
	}
	
//==== Getter / Setter ==========================================		

}
