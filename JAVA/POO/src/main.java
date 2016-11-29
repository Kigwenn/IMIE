
public class main {


	public static void main(String[] args) {

		System.out.println("=== Date 1 ===");
		MaDate date1 = new MaDate(8,5,1971);
		date1.afficher();
		
		//Afficher le jour de ma date
		//System.out.println(date1.getJour());
		System.out.println("=== Date 2 ===");
		MaDate date2 = new MaDate(9,5,1971);
		date2.afficher();
		
		//Afficher le jour de ma date
		//System.out.println(date2.getJour());
		System.out.println("=== egale ===");
		date1.egale(date2);
		System.out.println("=== Compare ===");
		date1.interpreter(date1.compare(date2));
		System.out.println("\n=== Plus petit ===");
		date1.interpreter(date1.plusPetite(date2));
		date1.toString();
		
				
	}

	/*		Bidule b = new Bidule();	
	}
  public static void exoClient(){
		Client c = new Client("jean", "petit", "jean@petit@mail.com");*/	
}