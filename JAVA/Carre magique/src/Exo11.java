
public class Exo11 {

//==== Attributs ================================================	
	private int[][] tab; 
	
//==== Constructeurs ============================================	
	
	public Exo11(int nbLig,int nbCol) {
		tab = new int[nbLig][nbCol];
	}

//==== Methodes =================================================	

	public void afficheTab(){
		for ( int i = 0; i < tab.length; i++) {
			System.out.println("\n==== Colonne ["+i +tab[i].length+"] ====");
			for (int j = 0; j < 5; j++) {
				System.out.println("position du tableau : tableau["+i+"]["+j+ "]"+tab[i][j]);  
			}
		}
	}
	
	public boolean somTab(){
		int som1 = 0;
		int som11 = 0;
		boolean col = true;
		for ( int i = 0; i < 1; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				som1 = som1 + tab[i][j];
			}
		}	
		
		for ( int ii = 1; ii < tab.length; ii++) {
			for (int jj = 0; jj < tab[ii].length; jj++) {
				som11 = som11 + tab[ii][jj];
			}
			if (som1 != som11){
				col = false;
				som11=0;
			}
			som11 = 0;
		}
		
		return col;
	}
	
	public boolean somLigTab(){
		int som2 = 0;
		int som22 = 0;
		boolean ling = true;
		
		for ( int i = 0; i < 1; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				som2 = som2 + tab[j][i];
			}
		}	
			
		for ( int ii = 0; ii < tab.length; ii++) {
			for (int jj = 0; jj < tab[ii].length; jj++) {
				som22 = som22 + tab[jj][ii];
			}
			if(som2 != som22){
				ling = false;
			}
			som22 = 0;		
		}
		
		return ling ;
	}
	
	public void isValidMagicSquare(){
		if(somLigTab() == false || somTab() == false){
			System.out.println("La grille n'est pas un carré MAGIQUE");
		}
		else{
			System.out.println("La grille est un carré MAGIQUE");
		}
	}
	
//==== Getter / Setter ============================================	
	
	public int[][] getTab() {
		return tab;
	}

	public void setTab(int nbLig,int nbCol, int val) {
		this.tab[nbLig][nbCol] = val;
	}
	
}
