
public class main {

	public static void main(String[] args) {
		
		int t[] = {1,2,3,0,5} ;
		int sommes =0,  valeur=0;
		for (int i=0; i<5; i++){
			sommes= sommes + t[i]; 
			if (t[i] == 0){
				valeur=1;
			}
		}
		
		System.out.println("sommes du tableau = "+sommes+"\n");
		if(valeur==1){
			System.out.println("il y a une/des valeur(s) a 0");
		}
	}
}
