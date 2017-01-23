
public class EnsembleProduit{

//==== Attributs ================================================		
	
	private Produit[] tab ;
	private int numLig = 0;

//==== Constructeurs ============================================
	
	public EnsembleProduit() {
		this.tab = new Produit[50];
	}
	
//==== Methodes ===================================================	
	
	public void listProduit() {
		for( int i=0 ; i<this.tab.length ; i++){
			if (tab[i]!=null){
				tab[i].infoProduit();
			}
		}
	}
	
	public void ajoutProduit(Produit produit) {
		this.tab[numLig] = produit;
		numLig = numLig +1;
		System.out.println("le produit est bien enregistrer !\n");
	}

	public void prixMoyen(){
		double sum = 0;
		
		for( int i=0 ; i< numLig ; i++){
			sum = sum +this.tab[i].getPrixHt();
		}
		double moy = Math.round((sum/numLig)* 100.0) / 100.0;
		System.out.println("La moyenne des produits est de "+moy+" €");
	}
}

