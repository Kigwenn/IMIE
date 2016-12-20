
public class Mer extends Eau {
	
//==== Attributs ================================================
			
//==== Constructeurs ============================================	

	public Mer(String nom, int poids, int nbNageoires) {
		super(nom, poids, nbNageoires);
		System.out.println("├─ Le "+nom+" vient de voir le jour");
		System.out.println("");
	}
	
//==== Methodes =================================================
	
	public String toString() {
		return super.toString()+"└ Je suis de Type : Mer \n";
	}		
	
	public double vitesse(){
		double v = (poids/25)*nbNageoires;
		return v;
	}
	
//==== Getter / Setter ==========================================		

}
