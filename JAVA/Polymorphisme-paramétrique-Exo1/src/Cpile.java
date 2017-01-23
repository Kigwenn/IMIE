import java.util.LinkedList;
	
public class Cpile <A> implements IPile <A> {

	private LinkedList<A> list;

	public Cpile(){
		list = new LinkedList<A>();
	}
		
	public boolean estVide() {
		boolean vide = false;
		if (list.size() == 0){
			vide = true ;
			System.out.println("la pile est vide !");
		}
		else{
		System.out.println("la pile n'est pas vide !");
		}
		return vide;
	}

	public int nbElements() {
		return list.size();
	}
	
	public void empile(A a){
		list.add(a);
		System.out.println("element ajouter !");
	}

	public A depile() {
		return list.pollLast();
	}

	public A sommet() {
		return list.getLast();
	}
	
	public void afficher() {
		
		for(A a : list)
		{
			System.out.println(a);
		}
	}	
}
