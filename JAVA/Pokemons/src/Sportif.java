
public class Sportif extends Terre {

//───── Attributs ────────────────────────────────────────────────
	
	private int frequenceCadiaque;
		
//───── Constructeurs ────────────────────────────────────────────	
	
	public Sportif(String nom, int poid, int nbPattes, double taille,
		int frequenceCadiaque) {
		super(nom, poid, nbPattes, taille);
		this.frequenceCadiaque = frequenceCadiaque;
		System.out.println("├─ Le "+nom+" vient de voir le jour");
		System.out.println("");
	}
		
//───── Methodes ─────────────────────────────────────────────────
	

	public String toString() {
		return super.toString()+"├ Je suis de Type : Sportif\n└ Ma frequence cadiaque est de " +frequenceCadiaque + " pulsations à la minute\n";
	}
		
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sportif other = (Sportif) obj;
		if (frequenceCadiaque != other.frequenceCadiaque)
			return false;
		return true;
	}
	
//───── Getter / Setter ──────────────────────────────────────────	

	public int getFrequenceCadiaque() {
		return frequenceCadiaque;
	}

	public void setFrequenceCadiaque(int frequenceCadiaque) {
		this.frequenceCadiaque = frequenceCadiaque;
	}

	
}
