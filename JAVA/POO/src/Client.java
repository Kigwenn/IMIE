
public class Client {
	
	private String nom;
	private String prenom;
	private String mail;
		
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public String getmail() {
		return mail;
	}
	
	public void setNom(String cNom) {
		nom = cNom;
	}
	
	public void setPrenom(String cPrenom) {
		prenom = cPrenom;
	}
	
	public void setmail(String cMail) {
		mail = cMail;
	}
	
	public Client(String nom, String prenom, String mail) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
	}
	
	public void afficherClient()
	{
		System.out.println(nom +" "+prenom+" "+mail);
		return;
	}
}
