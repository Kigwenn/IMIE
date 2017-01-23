
public class main {

	public static void main(String[] args) {
		
		try {
			int i = 5/0;
		//	System.out.println(i);

		}
		
		catch(ArithmeticException e) {
			System.out.println("Exception capturée et traitée !");
		}
		
		System.out.println("suite...");
	
	}
	
}


