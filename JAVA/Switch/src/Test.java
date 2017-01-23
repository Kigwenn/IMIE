import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		String ms;
		
		sc = new Scanner(System.in);
		System.out.println("Que voulez-vous faire ? \nSaisissez l'option souhaitée.");
		System.out.println("1 - Faire une addition");
		System.out.println("2 - Faire une soustraction");
		System.out.println("3 - Faire une multiplication");
		System.out.println("4 - Rien ! Je veux glander !");
		String s = sc.nextLine();
		int nb = new Integer(s);		
		
		switch(nb){
		
		case 1:
			ms = "Faire une addition";
			break;
		case 2:
			ms = "Faire une soustraction";
			break;
		case 3:
			ms = "Faire une multiplication";
			break;
		default:
			ms = "Rien ! Je veux glander !";
			break;
		}

/*		if (nb == 1) {
			ms = "Faire une addition";
			}
		if (nb == 2){
			ms = "aire une soustraction";
			}
		if (nb == 3){
			ms = "Faire une multiplication";
			}
		else {ms = "Rien ! Je veux glander !"; 			
			}
*/			
		System.out.println("Vous avez choisi: " + ms);
	}
}
