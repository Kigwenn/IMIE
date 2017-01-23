import java.util.ArrayList;
import java.util.Iterator;

public class EnsProduit {
	
//==== Attributs ================================================		
	
		private ArrayList list ;
		private int numLig = 0;

//==== Constructeurs ============================================
		
		public EnsProduit() {
			this.list = new ArrayList();
		}
		
//==== Methodes ===================================================	
		
		public void listProduit() {
			Iterator <String> i = list.iterator();
			while(i.hasNext()){
				String x = (String)i.next();
				System.out.println("valeur de l'objet list de type ArrayList methode iterator " + x);
			}
		}
		
		public void ajoutProduit(String produit) {
			this.list.add(produit) ;
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
