
public class CollectionsPokemons {
	//==== Attributs ================================================		
	
		private Pokemon[] tab ;
		private int numLig = 0;

	//==== Constructeurs ============================================
		
		public CollectionsPokemons() {
			this.tab = new Pokemon[50];
		}
		
	//==== Methodes ===================================================	
		
		public void listPokemons() {
			for( int i=0 ; i<this.tab.length ; i++){
				if (tab[i]!=null){
					System.out.println(tab[i].toString());
				}
			}
		}
		
		public void ajoutPokemons(Pokemon idPokemon) {
			this.tab[numLig] = idPokemon;
			System.out.println("le pokemon :\n" + tab[numLig] + " est bien ete ajouter !\n");
			numLig = numLig +1;
			
		}
		
		public void DelPokemons(String nom){
				Pokemon idPokemon
			this.tab[numLig] = idPokemon;
			System.out.println("le pokemon :\n" + tab[numLig] + " est bien ete ajouter !\n");
			numLig = numLig +1;
			
		}

/*		public void VitesseMoyenne(){
			double sum = 0;
			
			for( int i=0 ; i< numLig ; i++){
				sum = sum +this.tab[i].get();
			}
			double moy = Math.round((sum/numLig)* 100.0) / 100.0;
			System.out.println("La moyenne des produits est de "+moy+" €");

	*/
	
}
