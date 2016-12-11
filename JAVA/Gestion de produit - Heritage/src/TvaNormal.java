
public abstract class TvaNormal extends Produit {

//==== Attributs =================================================

	double TVA = 20.6;

//==== Constructeurs ========================================		

	public TvaNormal(String n, Double p) {
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