import java.lang.Math;
import java.util.Scanner;

public class dev {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println(" Bienvenu dans");
		System.out.println("+-------------+");
		System.out.println("| MASTER MIND |");
		System.out.println("+-------------+");
		System.out.println("");

		int tirage[];
		tirage = new int [5];


		for (int i=0 ; i<5 ; i++ ){
			int r = Math.abs((int)(Math.random()*(1 - 9)+1));
			tirage[i] = r;
		}

		System.out.print("\nCombinaison ordinateur : ");
		for (int i=0 ; i<5 ; i++ ){
			int t = tirage [i] ;
		System.out.print(" "+ t);
		}
		
		
		int proposition[];
		proposition = new int [5];
		
		for (int i=0 ; i<5 ; i++ ){
			Scanner sc;
			sc = new Scanner(System.in);
			System.out.println("\nSaisissez un 1 Chifre.");
			String s = sc.nextLine();
			int c = new Integer(s);
			proposition[i] = c;
		}
		
		System.out.print("\nCombinaison ordinateur : ");
		for (int i=0 ; i<5 ; i++ ){
			int t = tirage [i] ;
		System.out.print(" "+ t);
		}
		
		System.out.print("\nProposition du joueur :  ");
		for (int i=0 ; i<5 ; i++ ){
			int t = proposition [i] ;
		System.out.print(" "+ t);
		}

		int egale = 0;
		
		for (int i=0 ; i<5 ; i++ ){
			if (tirage[i] == proposition[i]){
				egale = egale +1;
			}
			
			if (egale==5){
				System.out.print("\n BRAVO VOUS AVEZ GAGNER !");
			}
		
		}
	}

}
