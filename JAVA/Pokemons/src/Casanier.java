
public class Casanier extends Terre {

//───── Attributs ────────────────────────────────────────────────
	
	private int heureJeu;
		
//───── Constructeurs ────────────────────────────────────────────		

	public Casanier(String nom, int poids, int nbPattes, double taille,	int heureJeu) {
		super(nom, poids, nbPattes, taille);
		this.heureJeu = heureJeu;
		System.out.println("├─ Le "+nom+" vient de voir le jour");
		System.out.println("");
	}
	
//───── Methodes ─────────────────────────────────────────────────

	public String toString() {
		return super.toString()+"└ Je suis de Type : Casanier, je joue " + heureJeu + " heure par jour\n";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Casanier other = (Casanier) obj;
		if (heureJeu != other.heureJeu)
			return false;
		return true;
	}
		
//───── Getter / Setter ──────────────────────────────────────────		

	public int getHeureJeu() {
		return heureJeu;
	}

	public void setHeureJeu(int heureJeu) {
		this.heureJeu = heureJeu;
	}
	
}
