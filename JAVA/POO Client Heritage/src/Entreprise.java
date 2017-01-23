
public class Entreprise extends Client {

//==== Atributs =================================================	
	
	private int siret;
	
//==== Constructeurs ============================================	

	public Entreprise (String nom, String mail, int siret) {
		super(nom,"",mail);
		this.siret = siret ;
	}
	
//==== Methodes =================================================		

	public void afficherEntreprise(){
		super.afficherClient();
		System.out.println("Siret : " + siret);
	}

//==== Get / Set ============================================
	
	public int getSiret() {
		return siret;
	}
	
	public void setSiret(int siret) {
		this.siret = siret;
	}
}
