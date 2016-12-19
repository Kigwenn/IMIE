	import java.lang.Math;
	import java.util.Scanner;

public class MasterMind1{
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		int essais = 0, nb = 0, egale = 0, m = 0, exit = 0, c=0;
		int tirage[] = new int [5];
		int tirageClone[] = new int [5];
		int proposition[] = new int [5];
			
		/*=========================================================
		 *  			Message lancement du jeu	
		  =========================================================*/			

		System.out.println("");
		System.out.println("+-------------+");
		System.out.println("| MASTER MIND |");
		System.out.println("+-------------+");
		System.out.println("");

		/*=========================================================
		 *  			Tirage aleatoire	
		  =========================================================*/	

				for (int i=0 ; i<5 ; i++ ){
					int r = (int)(Math.random()* (9-1)) + 1;
					tirage[i] = r ;
					tirageClone[i] = r;
				}
				
		/*=========================================================
		 *  			  nb Essais	
		  =========================================================*/	

					System.out.println("\nEntrer le nombre de tentative: ");
					Scanner sc1;
					sc1 = new Scanner(System.in);
					String s1 = sc1.nextLine();
					essais = new Integer(s1);

		/*=========================================================
		 *  			Boucle d'essais	
		  =========================================================*/	
				
				do {
					
				/*=========================================================
				 *  			Affichage des chiffres
				  =========================================================*/	
					
					System.out.print("\nCombinaison ordinateur : ");

					for (int i=0 ; i<5 ; i++ ){
						int t = tirage [i] ;
						System.out.print(" "+ t);
					}

				/*=========================================================
				 *  			Saisie des propositions	
				  =========================================================*/				
					
					for (int i=0 ; i<5 ; i++ ){
						
						/*=========================================================
						 *  			Saisie des chiffres
						  =========================================================*/	
						
						do {
							c = 0;
							System.out.println("\nSaisissez un chiffre.");
							Scanner sc;
							sc = new Scanner(System.in);
							c = sc.nextInt();
											
						/*=========================================================
						*  			Verifie les 0
					    =========================================================*/	
						} while (c<0 || c>8);
					
						proposition[i] = c;
						if ( c==0){
							exit = exit + 1;
						}
					}

					if (exit == 5){
						nb = essais;
					} 


				/*=========================================================
				 *		  		Message tirage + proposition	
				  =========================================================*/	

					System.out.print("\nCombinaison ordinateur : ");
					for (int i=0 ; i<5 ; i++ ){
						int t = tirage [i] ;
						System.out.print(" "+ t);
					}

					System.out.print("\nProposition du joueur :  ");
					for (int i=0 ; i<5 ; i++ ){
						int p = proposition [i] ;
						System.out.print(" "+ p);
					}
					
				/*=========================================================
				 *  Test si la proposition est identique au tirage	
				 =========================================================*/			

					for( int i = 0 ; i< 5 ; i++){
						if (proposition[i] == tirage[i]){
							tirage[i] = 0 ;
							proposition[i] = 0;
							egale = egale +1;
						}
					}		
					System.out.print("\n" + egale +" chiffre(s) bien placé");
								
					if (egale == 5){
						nb = essais;
					}
					
				/*=========================================================
				 * 				Test les mals placés	
				  =========================================================*/				

					for( int i=0 ; i< 5 ; i++){
						for( int j=0 ; j<5 ; j++){
							if ( i != j && proposition[i] == tirage[j] && tirage[j] != 0 && proposition[i] != 0){
								m = m +1;
								tirage[j]=0;
								j=5;
							}
						}
					}
					System.out.println("\n" + m +" chiffre(s) mal placé");
					nb = nb+1;
					
				/*=========================================================
				 *  			regeneration du tirage	et comptage 
				  =========================================================*/	
									
					for (int i=0 ; i<5 ; i++ ){
						tirage [i] = tirageClone[i];
					}
					m = 0;
								
				} while (nb < essais || egale == 4 );
				
				System.out.println("\nnb :"+nb);
				System.out.println("essais :"+essais);
				System.out.println("egale :"+egale);
				
				if (exit == 5){
					System.out.print("\n Tu as abandonner, loser!");
				}
				if ( egale == 5){
					System.out.print("\n BRAVO VOUS AVEZ GAGNER !");
				}
				else if ( egale != 0 ) {
					System.out.print("\n vous n'avez plus d'essais ");
				}
			}
		}