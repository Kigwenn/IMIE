
public class main {
	
	public static void main(String[] args) {
		
	Cpile<String> pile = new Cpile<>();
	pile.empile("je suis le 1er saisie !");
	pile.empile("moi le 2eme !");
	pile.estVide();
	pile.nbElements();
	pile.depile();
	System.out.println(pile.nbElements());
	pile.empile("et moi le 3eme !");
	pile.empile("suis le 4eme !");
	pile.empile("enfin le 5eme !");
	System.out.println(pile.nbElements());
	pile.depile();
	System.out.println(pile.sommet());
	System.out.println();
	pile.afficher();
	
	}

}
