
public class Croisiere extends Eau {

//───── Attributs ───────────────────────────────────────────────
		
//───── Constructeurs ────────────────────────────────────────────	

	public Croisiere(String nom, int poids, int nbNageoires) {
		super(nom, poids, nbNageoires);
		System.out.println("├─ Le "+nom+" vient de voir le jour");
		System.out.println("");
	}
	
//───── Methodes ─────────────────────────────────────────────────

	public String toString() {
		return super.toString()+"└ Je suis de Type : Croisiere \n";
	}
	
	public double vitesse(){
		double v = ((poids/25)*nbNageoires)/2;
		return v;
	}	
//───── Getter / Setter ──────────────────────────────────────────		

}
