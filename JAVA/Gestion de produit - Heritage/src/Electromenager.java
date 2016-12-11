
public class Electromenager extends TvaNormal {

//==== Attributs =================================================	
	
	private String marque;

//==== Constructeurs =============================================
	
	public Electromenager(String n, Double p, String marque) {
		super(n, p);
		this.marque = marque;
	}
	
//==== Methodes ==================================================		
	
	public void infoProduit() {
		super.infoProduit();
		System.out.println("Marque : "+marque+"\n");
	}

//==== Getter / Setter ===========================================	
	
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}


}
