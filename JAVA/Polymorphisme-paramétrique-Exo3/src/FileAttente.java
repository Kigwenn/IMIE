import java.util.ArrayList;


public class FileAttente {

	protected ArrayList<Personne> contenu = new ArrayList<Personne>() ;
	
	public FileAttente() {
		
	}
	
	public void entre(Personne p) {
		Personne.add(p);
	}
		
	public Personne sort() {
		
		Personne p = null ;
		
		if(!contenu.isEmpty()) {
			p = contenu.get(contenu.size() - 1) ;
			contenu.remove(contenu.size() - 1) ;
		}
			
	return p ;
	}
		
	public boolean estVide() {
		return contenu.isEmpty();
	}
	
	public String toString() {
		return "" + contenu;
	}
}