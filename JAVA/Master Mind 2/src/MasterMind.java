
public class MasterMind {

	import java.util.Scanner;
import java.util.Scanner;

	public class main {
		
		@SuppressWarnings("resource")
		public static void main(String[] args) {
		
		mastermind(5,5);
		
		}	
		public static void mastermind(int nbPions,int nbEssais){	
			int bienPlace, malPlace, perdu;
			boolean exit = false;
			int tirage[] = new int [nbPions];
			int cloneTirage[] = new int [nbPions];
			bienPlace = malPlace = perdu = 0;
		    
				System.out.println("");
				System.out.println("+-------------+");
				System.out.println("| MASTER MIND |");
				System.out.println("+-------------+");
				System.out.println("");
				
				tirage = tirage(nbPions);
							
				
				
					infoTirage(tirage);
					reset(cloneTirage, tirage);
								
					do{ 
						perdu += 1;
						System.out.println("+------   saisis + control  -------");
						int test[] = saisis();
						infoTest(test);
						System.out.println("+------   Test  -------");
						System.out.println(" - "+bienPlaces(tirage,test)+" chiffre(s) bien placé");
						System.out.println("\n - "+malPlaces(tirage,test) +" chiffre(s) mal placé\n");
						System.out.println("+------   info tirage  -------\n");	
						bienPlace = bienPlaces(tirage,test);
						malPlace= malPlaces(tirage,test);
						exit = exit(test);
						reset(tirage, cloneTirage);
					
					} while(bienPlace != 5 && perdu != nbEssais && exit != false ); 
					
					resultat(perdu, bienPlace, exit );
		
		}			
		public static int[] tirage(int n) {
			int tirage[] = new int[n];
			for (int i=0 ; i<5 ; i++ ){
				int r = (int)(Math.random()* (9-1)) + 1;
				tirage[i] = r ;
			}
			return tirage ;
		}
		
		public static int essais() {
			int essais = 0;
			System.out.println("\nEntrer le nombre de tentative: ");
			Scanner sc1;
			sc1 = new Scanner(System.in);
			String s1 = sc1.nextLine();
			essais = new Integer(s1);
			return essais;
		}
		
		public static int bienPlaces(int test[],int tirage[]) {
			int bp = 0;
			for( int i = 0 ; i< 5 ; i++){
				if (test[i] == tirage[i]){
					tirage[i] = 0 ;
					test[i] = 0;
					bp = bp +1;
				}
			}		
		return bp;			
		}
		
		public static boolean exit(int test[]) {
			boolean sortie = false;
			for( int i = 0 ; i< 5 ; i++){
				if (test[i] == 0){
					sortie = true ;
				}
			}		
		return sortie;			
		}
		
		public static int malPlaces(int test[],int tirage[]) {
			int mp = 0;
			for( int i=0 ; i< 5 ; i++){
				for( int j=0 ; j<5 ; j++){
					if ( i != j && test[i] == tirage[j] && tirage[j] != 0 && test[i] != 0){
						mp = mp +1;
			 			tirage[j]=0;
						j=5;
					}
				}
			}
		return mp ;
		}
		
		public static int[] saisis(){
			int test[] = new int [5];
			int saisis = 0;
			for (int i=0 ; i<5 ; i++ ){
				do {
					System.out.println("\nSaisissez un chiffre compirs entre 1 et 8.");
					System.out.println((i+1)+"/5 saisis");
					Scanner sc;
					sc = new Scanner(System.in);
					saisis = sc.nextInt();
				} while (saisis<0 || saisis>8);
				test[i] = saisis;
			}
			return test ;
		}
		
		public static void infoTirage(int tirage[]){ 
			System.out.print("\nLe tirage à trouver est : ");
			for (int i=0 ; i<5 ; i++ ){
				int t = tirage [i] ;
				System.out.print(" "+ t);
			}
		System.out.print("\n");
		}
		
		public static void infoTest(int test[]){	
			System.out.print("\nProposition du joueur :  ");
			for (int i=0 ; i<5 ; i++ ){
				int p = test [i] ;
				System.out.print(" "+ p);
			}
		System.out.print("\n");
		}
		
		public static void reset(int reset[], int clone[]){	
			for (int i=0 ; i<5 ; i++ ){
				reset [i] = clone[i];
			}
		}
		
		public static void info(int test[]){	
			
			for (int i=0 ; i<5 ; i++ ){
				int p = test [i] ;
				System.out.print(" "+ p);
			}
		System.out.print("\n");
		}
		
		public static void resultat(int perdu, int gagner, Boolean exit ){	
			if (exit == true ){
				System.out.print("\n Tu as abandonner, loser!");
			}
			if ( gagner == 5){
				System.out.print("\n BRAVO VOUS AVEZ GAGNER !");
			}
			else if ( perdu > 0 ) {
				System.out.print("\n vous n'avez plus d'essais ");
			}
		}	
	}



