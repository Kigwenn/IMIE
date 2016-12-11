public class main {

	public static void main(String[] args) {

//= Exo 3 - Abstraction / Specialisation / Generalisation =

		System.out.println("+---------------------------------+");
		System.out.println("|      Gestion de produit         |");
		System.out.println("+---------------------------------+");
		System.out.println("");
		System.out.println("+---------------------------------+");		
		System.out.println("|        creation Produit         |");
		System.out.println("+---------------------------------+\n");
		System.out.println("livre1, livre2, elec1, alim1\n");
		
		Produit livre1 = new Livre("Dora Mini Coloring-Modèle aléatoire",9.34605,"Broché",2016);
		Produit livre2 = new Livre("Miss Peregrine et les enfants particuliers - Tome 1",15.0255,"Broché",2016);	
		Produit elec1 = new Electromenager("Fresh Express 3 en 1 râper trancher",27.7106, "Moulinex");
		Produit alim1 = new Aliment("Pommes x6",2.835,24,12,2016);
		
		System.out.println("+---------------------------------+");	
		System.out.println("|          Creation List          |");
		System.out.println("+---------------------------------+\n");
		System.out.println(" list\n");
		
		EnsembleProduit list = new EnsembleProduit();
		
		System.out.println("+---------------------------------+");
		System.out.println("|   Ajout de produit a la liste   |");
		System.out.println("+---------------------------------+\n");
		
		list.ajoutProduit(livre1);
		list.ajoutProduit(livre2);
		list.ajoutProduit(alim1);
		list.ajoutProduit(elec1);
		
		System.out.println("+---------------------------------+");
		System.out.println("|              Liste              |");
		System.out.println("+---------------------------------+\n");
		
		list.listProduit();
		
		System.out.println("+---------------------------------+");
		System.out.println("|            Prix Moyen           |");
		System.out.println("+---------------------------------+\n");
		
		list.prixMoyen();
	}	
}
