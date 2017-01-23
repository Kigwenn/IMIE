public class Periode {
	
//==== Atributs ================================================
	
	private MaDate dateDeb;
	private MaDate dateFin;

//==== Constructeurs ============================================
	
	public Periode(MaDate d1, MaDate d2) {
		
		if (d1.plusPetite(d2)==d1){
			this.dateDeb = d1;
			this.dateFin = d2;
		}
		else{	
			this.dateDeb = d2;
			this.dateFin = d1;
		}	
		
	}
	
	public Periode(MaDate autre) {
		MaDate d1;
		MaDate d2;
		
		d1 = autre;
		d2 = new MaDate();
		
		if (d1.plusPetite(d2)==d1){
			this.dateDeb = d1;
			this.dateFin = d2;
		}
		else{	
			this.dateDeb = d2;
			this.dateFin = d1;
		}
	}
	
//==== Methodes =================================================	
	
	public boolean egale(Periode periode){
		boolean egale;
		egale = false;
		if ((this.dateDeb.egale(periode.dateDeb)==true) && (this.dateFin.egale(periode.dateFin)==true)){
			egale = true;
		}
		System.out.println (egale + " / egalite");
		return egale;
	}
	
	
	public boolean intersecte(Periode periode){
		boolean chevauche;
		chevauche = false;
		if (((this.dateFin.avant(periode.dateDeb)>0) &&(periode.dateFin.avant(this.dateFin)>0))
				|| ((periode.dateFin.avant(this.dateDeb)>0) &&(this.dateFin.avant(periode.dateFin)>0))
				|| (((this.dateDeb.avant(periode.dateDeb)<0)&&(this.dateFin.avant(periode.dateFin)>0)))
				|| (((periode.dateDeb.avant(this.dateDeb)<0)&&(periode.dateFin.avant(this.dateFin)>0))))
			{
			chevauche = true;
			}
		System.out.println (chevauche + " / chevauche");
		return chevauche;
	}
	
	public boolean intersecte2(Periode periode)
	{
		boolean chevauche2;
		chevauche2 = true;
		if ( ((this.dateFin.avant(periode.dateDeb)<0) &&(this.dateDeb.avant(periode.dateDeb)<0))
				|| ((periode.dateFin.avant(this.dateDeb)<0) &&(periode.dateDeb.avant(this.dateDeb)<0)) )
			{
			chevauche2 = false;
			}
		System.out.println (chevauche2 + " / chevauche2");
		return chevauche2;
	}
	
	public boolean avant(Periode periode){
		
		boolean avant;
		avant = false;
		if ((this.dateFin.avant(periode.dateDeb)<0)
			|| (periode.dateFin.avant(periode.dateDeb)<0)){
			avant = true;
			}
		System.out.println (avant + " / avant");
		return avant;
	}
	
	public String toString(){
	String p1 = dateDeb.toString();
	String p2 = dateFin.toString();
	return p1+ " - " + p2;
	}
	
//==== Accesseurs ===============================================
	
	public MaDate getDateDeb() {
		return dateDeb;
	}

	public void setDateDeb(MaDate dateDeb) {
		this.dateDeb = dateDeb;
	}

	public MaDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(MaDate dateFin) {
		this.dateFin = dateFin;
	}

}
