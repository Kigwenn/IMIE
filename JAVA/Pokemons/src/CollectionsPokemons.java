import java.util.ArrayList;
import java.util.Iterator;


public class CollectionsPokemons {
	//==== Attributs ================================================		
	
		private ArrayList list ;
		
	
	//==== Constructeurs ============================================
		
		public CollectionsPokemons() {
			this.list = new ArrayList();
			System.out.println("      Une liste de collection à été creer !");
			System.out.println("          ─────────────────────────────    \n");
		}
		
	//==== Methodes ===================================================	
		
		public void listPokemons() {
			Iterator <Pokemon> i = list.iterator();
			while(i.hasNext()){
				Pokemon x = (Pokemon)i.next();
				System.out.println("                  ─ "+x.nom);
			}
			
		}
		
		public void ajoutPokemons(Pokemon idPokemon) {
			this.list.add(idPokemon) ;
			System.out.println("le pokemon "+idPokemon.nom+" a bien ete ajouter a la liste !\n");
		}
					
/*		public void DelPokemons(String nom){
			Pokemon idPokemon
			this.tab[numLig] = idPokemon;
			System.out.println("le pokemon :\n" + tab[numLig] + " est bien ete ajouter !\n");
			numLig = numLig +1;
			
		}
*/
		public void VitesseMoyenne(){
			double sum = 0;
			Iterator <Pokemon> i = list.iterator();
			while(i.hasNext()){
				Pokemon x = (Pokemon)i.next();
				sum = sum +x.vitesse();
			}
			System.out.println("\n┌──────────────────────────────────────────────────┐");
			System.out.println(" la vitesse moyenne des pokemons est de "+sum+" Km/h !");
			System.out.println("└──────────────────────────────────────────────────┘\n");
		}	
	
}
