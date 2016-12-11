
public class Sportif extends Terre {

//==== Attributs ================================================
	
	private int frequenceCadiaque;
		
//==== Constructeurs ============================================	
	
	public Sportif(String nom, int poid, int nbPattes, double taille,
		int frequenceCadiaque) {
		super(nom, poid, nbPattes, taille);
		this.frequenceCadiaque = frequenceCadiaque;
	}
		
//==== Methodes =================================================
	
	@Override
	public String toString() {
		return super.toString()+"+ Je suis de Type : Sportif\n+ Ma frequence cadiaque est de " +frequenceCadiaque + " pulsations à la minute\n";
	}
	
//==== Getter / Setter ==========================================		

	public int getFrequenceCadiaque() {
		return frequenceCadiaque;
	}

	public void setFrequenceCadiaque(int frequenceCadiaque) {
		this.frequenceCadiaque = frequenceCadiaque;
	}
	
}
