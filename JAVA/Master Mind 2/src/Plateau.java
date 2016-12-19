import java.util.Scanner;

public class Plateau {

//==== Attributs ================================================
	
	private int nbPion;
	private int nbEssais;
	private int bienPlace;
	private int malPlace;
	private int gagner;
	private int tours;
	
	private boolean perdu;
	private boolean exit;
	
	private Joueur joueur;
	private Pion[] tirage;
	private Pion[] cloneTirage;
	private Pion[] test;
	
//==== Constructeurs ============================================	

	public Plateau(int nbPions, int nbEssais, Joueur j) {
		joueur = j;
		initClone(nbPions);
		int bienPlace, malPlace, tours ;
		bienPlace = malPlace = tours = 0;
		boolean perdu;
		tours = nbEssais;


		System.out.println("");
		System.out.println("┌───────────────────────────────────────────────────────────┐");
		System.out.println("│                        MASTERMIND                         │");
		System.out.println("└───────────────────────────────────────────────────────────┘");
		System.out.println("");
		System.out.println("            Bienvenue dans le jeu du Mastermind");
		System.out.println("");
		System.out.println("    la regle est simple, trouvez la combinaison gagnante!");
		System.out.println("  Il y a "+nbPions+" chiffres a trouver, ils sont compris entre 1 et 9");
		System.out.println("     on peu quiter la partie en saisissant le chiffre 0");
		System.out.println("");
		System.out.println("                     A vous de jouer !");
		System.out.println("");
		System.out.println(" ───────────────────────────────────────────────────────────");
		tirage = tirage(nbPions);
		infoTirage(tirage);
		reset(tirage, cloneTirage);

		do{ 
			tours-= 1;
			System.out.println("┌───────────────────────────────────────────────────────────┐");
			System.out.println("│   A VOUS DE JOUER               Il vous restera "+(tours)+" Essais  │");
			System.out.println("└───────────────────────────────────────────────────────────┘\n");
			test = saisies(nbPions);
			infoTest(test);
			bienPlace = bienPlaces(tirage,test);
			malPlace = malPlaces(tirage,test);
			System.out.println("│                                                           │");
			System.out.print("│  Il y a "+bienPlace+" pion(s) bien placé(s)");
			System.out.println(" et "+malPlace+" pion(s) mal placé(s) │");
			System.out.println("└───────────────────────────────────────────────────────────┘");	
			exit = exit(test);
			reset(cloneTirage,tirage);
			perdu = nbEssais(tours);
	
		} while(perdu != true && bienPlace != nbPions && exit != true ); 
			
		resultat (perdu, bienPlace, exit );
	}

//==== Methodes ============================================		
	
	public Pion[] tirage(int n){
		tirage = new Pion [n];
		for (int i=0 ; i<n ; i++ ){
			int r = (int)(Math.random()* (9-1)) + 1;
			tirage[i] = new Pion(r) ;
		}
		return tirage ;
	}
	
	public Pion[] initClone(int n){
		cloneTirage = new Pion [n];
		for (int i=0 ; i<n ; i++ ){
			cloneTirage[i] = new Pion(0);
		}
		return cloneTirage ;
	}
	
	public Pion[] saisies(int n){
		Pion[] test = new Pion [n];
		int s = 0;
		for (int i=0 ; i<n ; i++ ){
			do {
				System.out.print("                       "+(i+1)+"/"+n+" saisie : ");
				Scanner sc;
				sc = new Scanner(System.in);
				s = sc.nextInt();
				if(s<0 || s>8){
					System.out.println("\nSaisissez un chiffre compirs entre 1 et 9 !");
				}
			} while (s<0 || s>8);
		System.out.println("");
		test[i] = new Pion(s);
		}
		return test ;
	}
	
	public boolean nbEssais(int nbEssais) {
		if(nbEssais != 0){
			return false;
		}
		return true;	
	}

	public int bienPlaces(Pion[] tirage,Pion[] test) {
		int bp = 0;
		for( int i = 0 ; i< tirage.length ; i++){
			if (tirage[i].getCouleur() == test[i].getCouleur()){
				tirage[i].setCouleur(0);
				bp = bp +1;
			}
		}		
		return bp;			
	}
	
	public int malPlaces(Pion tirage[],Pion test[]) {
		int mp = 0;
		for( int i=0 ; i< tirage.length ; i++){
			for( int j=0 ; j<tirage.length ; j++){
				if ( i != j && tirage[i].getCouleur() == test[j].getCouleur() && test[j].getCouleur() != 0 && tirage[i].getCouleur() != 0){
					mp = mp +1;
					test[j].setCouleur(0);
					j=tirage.length;
				}
			}
		}
		return mp ;
	}
	
	public boolean exit(Pion[] test) {
		boolean sortie = false;
		for( int i = 0 ; i< test.length ; i++){
			if (test[i].getCouleur() == 0){
				sortie = true ;
			}
		}		
		return sortie;			
	}
	
//=========================== Affichage  ========================================================== 	
	
	public void infoTirage(Pion tirage[]){ 
		System.out.println("\n             La combinaison gagnante a trouver : ");
		System.out.print("                       ");
		for (int i=0 ; i<tirage.length ; i++ ){
			int t = tirage[i].getCouleur() ;

			System.out.print(" "+ t);
		}
		System.out.println("\n");
		System.out.println(" ───────────────────────────────────────────────────────────");
	}

	public void infoTest(Pion test[]){
		System.out.println("┌───────────────────────────────────────────────────────────┐");
		System.out.print("│           Proposition du joueur :  ");
		for (int i=0 ; i<test.length ; i++ ){
			int p = test[i].getCouleur() ;
			System.out.print(" "+ p);
		}
		System.out.println("               │");
		System.out.println("├───────────────────────────────────────────────────────────┤");
	}

	public void reset(Pion clone[], Pion reset[]){
		for (int i=0 ; i<clone.length ; i++ ){
			int c = clone[i].getCouleur();
			reset[i].setCouleur(c);
		}
	}

	public void info(Pion test[]){	
		for (int i=0 ; i<test.length ; i++ ){
			int p = test[i].getCouleur() ;
			System.out.print(" "+ p);
		}
		System.out.print("\n");
	}

	public void resultat(Boolean perdu, int gagner, Boolean exit ){	
		if (exit == true ){
			System.out.print("\n                  Tu as abandonner, loser!");
		}
		if ( gagner == 5){
			System.out.print("\n                  BRAVO VOUS AVEZ GAGNER !");
		}
		else if ( perdu == true ) {
			System.out.print("\n                  Vous n'avez plus d'essais ");
		}
	}

}