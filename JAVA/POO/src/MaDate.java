import java.util.Calendar;

public class MaDate {
	private int jour;
	private int mois;
	private int an;
	
	/**
	 * 
	 * @param j jour
	 * @param m mois
	 * @param a année
	 */
	public MaDate(int j, int m, int a) {
		this.jour = j;
		this.mois = m;
		this.an = a;
	}

	public MaDate() {
		today();
	}
	
	/**
	 * Initialise tous les attributs de la classe a la date d'aujourd'hui
	 */
	public void today()	{
		Calendar cal = Calendar.getInstance();
		this.jour = cal.get(Calendar.DAY_OF_MONTH);
		this.mois = cal.get(Calendar.MONTH)+1;
		this.an = cal.get(Calendar.YEAR);
	}
	
	/**
	 * @param autre
	 * @return
	 */
	public boolean egale(MaDate autre){
		boolean res;
		
		if(this.an == autre.getAn()
				&&this.mois == autre.getMois()
				&&this.jour == autre.getJour() 	
				){
			res = true;
			System.out.println("est true\n");
			}
				else {
			res = false;
			System.out.println("est false\n");
				}
		return res;
	}
	
	public int compare(MaDate autre){
		int res = 0;
		
		if(this.an < autre.getAn()){
			res=1;
		}
		else if (this.mois < autre.getMois()){
			res=1;
		}
		else if (this.jour < autre.getJour()){
			res=1;
		}
		
		if(this.an > autre.getAn()){
			res=-1;
		}
		else if (this.mois > autre.getMois()){
			res=-1;
		}
		else if (this.jour > autre.getJour()){
			res=-1;
		}
		
		
		return res;
	}
	
	public void interpreter(int res)
	{
		if(res == -1){
			System.out.println("la date comparé est avant la date");
		}
		
		if(res == 1){
			System.out.println("la date comparé est apres a la date");
		}
	
		if(res == 0){
			System.out.println("la date comparé sont les mêmes");
		}	
	}
	
	public void interpreter(MaDate res)
	{
			System.out.println("la date comparé est avant la date");
	}
	
	public MaDate plusPetite(MaDate autre){
		int c = this.compare(autre);
		if(c == -1){
			return autre;
		}	
		return this;
	}
	
	public String toString(){
		String d = jour + "/" + mois + "/" + an ;
		return d;
	}	
	
	public String dateEnLettres(){
	
	}
	
	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getAn() {
		return an;
	}

	public void setAn(int an) {
		this.an = an;
	}

	public void afficher(){
		System.out.println("Ma date "+ toString() +"\n");
	}
}
