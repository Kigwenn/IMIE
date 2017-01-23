
public class Client {
	
//==== Atributs =================================================		
	
	protected String nom;
	protected String prenom;
	protected String mail;
	public static int nb=0 ;
	
//==== Constructeurs ============================================	

		public Client(String nom, String prenom, String mail) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		nb= nb+1;
	}
	
//==== Methodes =================================================		
	
	public void afficherClient()
	{
		System.out.println(nb+"Nom : "+nom);
		System.out.println("Prenom : "+prenom);
		System.out.println("Mail :  "+mail);
		return;
	}
	
	public boolean equals(Object obj){
		boolean res = (this == obj);	
		return res;
	}
	
//==== Get / Set ================================================	

	public void afficheEquals(Object obj){
		if(equals(obj)){
			System.out.println("les objets sont eagux");
		}
		System.out.println("les objets sont differents");
	}
	
//==== Get / Set ================================================
			
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
		
}
