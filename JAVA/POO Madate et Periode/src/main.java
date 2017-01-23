
public class main {
	
//================ MA DATE - Periode =======================
	
	public static void main(String[] args) {

		MaDate d1,d2, d3, d4;
		d1 = new MaDate(30, 05, 2013);
		d2 = new MaDate(15, 10, 2015);
		d3 = new MaDate(11, 11, 2015);
		d4 = new MaDate(30, 10, 2015);
				
		Periode p1, p2;
		p1 = new Periode(d1, d2);
		p2 = new Periode(d3);
				
		System.out.println("\n== Periode 1 ==");	
		System.out.println(p1.toString());
			
		System.out.println("\n== Periode 2 ==");
		System.out.println(p2.toString());
				
		System.out.println("\n== Egale ==");
		p1.egale(p2);
			
		System.out.println("\n== Avant ==");
		p1.avant(p2);
			
		System.out.println("\n== Intrasecte ==");
		p1.intersecte(p2);
		p1.intersecte2(p2);
		
		System.out.println("\n=== Date 1 ===");
		MaDate date1 = new MaDate(8,5,1971);
		date1.afficherDate();
		
		//Afficher le jour de ma date
		//System.out.println(date1.getJour());
		System.out.println("\n=== Date 2 ===");
		MaDate date2 = new MaDate(12,07,1998);
		date2.afficherDate();
		
		//Afficher le jour de ma date
		//System.out.println(date2.getJour());
		System.out.println("\n=== egale (date1)/(date2) ===");
		date1.egale(date2);
		System.out.println("\n=== Compare (date1)/(date2)===");
		date1.interpreter(date1.compare(date2));
		System.out.println("\n=== Plus petit (date1)/(date2) ===");
		date1.interpreter(date1.plusPetite(date2));
		date1.toString();
	    MaDate day = new MaDate();
	    
	    System.out.println("\n=== Date du jour instancier (day) ===");
	    day.afficherDate();
	    System.out.println("\n=== date du jour en Date Lettre (day)===");
	    day.afficherLettre();
		day.setN(-1);
		System.out.println("=== Creation d'un tableau avec N=-1 ===");
		//int d = day.getN();
		//int tab[] = new int [d];
	}
	
}
