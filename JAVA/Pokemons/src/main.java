import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

public class main {

	public static void main(String[] args) {

		System.out.println("     ┌────────────────────────────────────┐");
		System.out.println("     │ Bienvenue dans l'exercice Pokémons │");
		System.out.println("     └────────────────────────────────────┘");
		System.out.println("          ─────────────────────────────    ");
		System.out.println("     ┌────────────────────────────────────┐");
		System.out.println("     │     instance de pokemons yeah!!    │");
		System.out.println("     └────────────────────────────────────┘");
		System.out.println("");
		
		Pokemon pok1 = new Sportif("Pikachu", 18, 2, 0.85, 120);
		Pokemon pok2 = new Casanier("Salameche", 12, 2, 0.65, 8);
		Pokemon pok3 = new Mer("Ondoudou", 45, 2);
		Pokemon pok4 = new Croisiere("Bulbizarre", 15, 3);
		Pokemon pok5 = new Croisiere("Bulbizarre", 15, 3);
		
		System.out.println("");
		System.out.println("     ┌────────────────────────────────────┐");
		System.out.println("     │          caracteristiques          │");
		System.out.println("     └────────────────────────────────────┘");
		System.out.println("");
		
		System.out.println(pok1);
		System.out.println(pok2);
		System.out.println(pok3);
		System.out.println(pok4);
		
		System.out.println("");
		System.out.println("     ┌────────────────────────────────────┐");
		System.out.println("     │     Creation d'une liste de Pok.   │");
		System.out.println("     └────────────────────────────────────┘");
		System.out.println("");
		
		CollectionsPokemons liste1 = new CollectionsPokemons();
		
		liste1.ajoutPokemons(pok1);
		liste1.ajoutPokemons(pok2);
		liste1.ajoutPokemons(pok3);
		liste1.ajoutPokemons(pok4);
		liste1.ajoutPokemons(pok5);
		
		System.out.println("");
		System.out.println("     ┌────────────────────────────────────┐");
		System.out.println("     │     Affiche la liste de Pokemon    │");
		System.out.println("     └────────────────────────────────────┘");
		System.out.println("");
		
		liste1.listPokemons();
		liste1.VitesseMoyenne();
		
		System.out.println("");
		System.out.println("     ┌────────────────────────────────────┐");
		System.out.println("     │         Effacer un Pokemon         │");
		System.out.println("     └────────────────────────────────────┘");
		System.out.println("");
		
		liste1.delPokemons(pok3);
		liste1.listPokemons();
		
		
		System.out.println("");
		System.out.println("     ┌────────────────────────────────────┐");
		System.out.println("     │     Affiche la liste de Pokemon    │");
		System.out.println("     └────────────────────────────────────┘");
		System.out.println("");
		
		liste1.VitesseMoyenne();
		
		
	}	
}