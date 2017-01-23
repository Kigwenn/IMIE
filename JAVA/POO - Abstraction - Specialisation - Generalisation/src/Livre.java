
public class Livre extends TvaReduite {

//==== Attributs ===========================================		
	
	private String editeur;
	private int annee;
	
//==== Constructeurs =======================================	
	
	public Livre(String n, Double p, String editeur, int annee) throws MonException {
		super(n, p);
		this.editeur = editeur;
		this.annee = annee;
	}

//==== Methodes ============================================

	public void infoProduit() {
	 super.infoProduit();
	 System.out.println("Editeur : "+editeur+"\nAnnée : "+annee +"\n");
	}
	
//==== Getter / Setter ==========================================	
	
	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
}
