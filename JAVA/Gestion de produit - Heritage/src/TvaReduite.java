
public abstract class TvaReduite extends Produit {

//==== Attributs ===========================================	

	protected double TVA = 5.5;

//==== Constructeurs ========================================		

	public TvaReduite(String n, Double p) {
		super(n, p);
	}
	
//==== Methodes ============================================	
	
	public double prixTtc(){
		double ttc = super.prixHt * ((TVA/100)+1);
	return 	ttc;
	}
	
	public void infoProduit() {
		double pttc = Math.round(prixTtc()* 100.0) / 100.0;
		super.infoProduit();
		System.out.println("Prix TTC : "+pttc +" € " ); 
		
	}
	
}
