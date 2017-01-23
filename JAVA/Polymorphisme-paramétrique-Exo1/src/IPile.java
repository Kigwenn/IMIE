
abstract public interface IPile <A> {
	
	boolean estVide();
	void empile(A a);
	void afficher();
	int nbElements();
	
	A depile(); //retourne l'élément en sommet de la pile et dépile
	A sommet(); //retourne l'élément au sommet de la pile mais ne le retire pas
	
}

