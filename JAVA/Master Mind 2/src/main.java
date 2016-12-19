import java.util.Scanner;


public class main {
	
	public static void main(String[] args) {
		
		if(Connect.getInstance() != null){
			menuPrincipal();
		}	
		else{
			System.out.println("La connexion à la BDD a échoué ! Aurevoir !");
		}
	}
	
	public static void menuPrincipal()
		{
		Scanner sc = new Scanner(System.in);
		int choix;
		do {	

			System.out.println("");
			System.out.println("           ┌────────────────────────────────────┐");
			System.out.println("           │             MASTERMIND             │");
			System.out.println("           ├───                               ──┤");
			System.out.println("           │           MENU PRINCIPAL           │");
			System.out.println("           ├──────                        ──────┤");
			System.out.println("           │                                    │");			
			System.out.println("           │  1 - Connexion                     │");
			System.out.println("           │                                    │");
			System.out.println("           │  2 - Connexion en mode invité      │");
			System.out.println("           │                                    │");
			System.out.println("           │  3 - Création d'un nouveau compte  │");
			System.out.println("           │                                    │");
			System.out.println("           │  4 - Quitter                       │");
			System.out.println("           │                                    │");			
			System.out.println("           └────────────────────────────────────┘");

			choix = menuEntrer(4, "\n                   Choisir une option : ");
			System.out.println("");
			
			switch(choix){
			case 1:
				Joueur j = new Joueur();
				if(j.check()){
					new Plateau(4, 15, j);
				}	
				break;
			case 2:
				break;
			case 3:   
				break;
			case 4:
				break;
		}
		}		
		
		while(choix != 4);
		
		System.out.println("Bye bye !");
	}

		
	public static int menuEntrer(int n, String message){
		
		Scanner sc = new Scanner(System.in);
		int choix;
		boolean choixValide;
		choixValide = false;
			
		do{
			System.out.print(message);
			choix = sc.nextInt();
					
			if(choix >= 1 && choix <=n){
				choixValide = true;
			}
				
			else {
				System.out.print("Attention, vous devez saisir un entier entre 1 et " + n + ".");
			}
		}
		while(!choixValide); //tant que le choix n'est pas valide ou qu'il n'a pas demander a quitter
	
		return choix;
	
	}
		
}



