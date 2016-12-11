
public class Croisiere extends Eau {

//==== Attributs ================================================
		
//==== Constructeurs ============================================	

	public Croisiere(String nom, int poid, int nbNageoires) {
		super(nom, poid, nbNageoires);
	}
	
//==== Methodes =================================================

	public String toString() {
		return super.toString()+"+ Je suis de Type : Croisiere \n";
	}
	
	public double vitesse(){
		double v = ((poid/25)*nbNageoires)/2;
		return v;
	}	
//==== Getter / Setter ==========================================		

}
