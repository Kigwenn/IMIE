
public class Aliment extends TvaReduite {

//==== Attributs ==================================================	
	
	private MaDate datePeramption;
		
//==== Constructeurs ==============================================
	
	public Aliment(String n, Double p, int j, int m, int y) {
		super(n, p);
		this.datePeramption = new MaDate(j, m, y) ;
	}
	
//==== Methodes ===================================================	
	
	public void infoProduit() {
		super.infoProduit();
		System.out.println("Date de péramption : "+datePeramption+"\n");
	}

//==== Getter / Setter ============================================
	
	public MaDate getDatePeramption() {
		return datePeramption;
	}

	public void setDatePeramption(MaDate datePeramption) {
		this.datePeramption = datePeramption;
	}

}
