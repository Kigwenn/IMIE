
public abstract class Produit {

//==== Attributs ================================================	
	
	protected String nom;
	protected double prixHt;

//==== Constructeurs ============================================		

	public Produit (String n, Double p) throws MonException {
		if( p <0 ){
			throw new MonException();
		}
		else {
		nom = n;
		prixHt = p;
		}
	}
	
//==== Methodes =================================================

	public void infoProduit(){
		System.out.println("Nom : " + nom + "\nPrix Ht :"+ prixHt +" €");
	}
	
	abstract double prixTtc();

//==== Getter / Setter ==========================================		
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrixHt() {
		return prixHt;
	}

	public void setPrixHt(double prixHt) {
		this.prixHt = prixHt;
	}	

}
