
public class main {
	
//================ Client - Heritage =======================	

	public static void main(String[] args) {

		Client client1 = new Client("Lecourt","Vincent","lecourt.vincent@free.fr");
		client1.afficherClient();
				
		Client client2 = new Client("Leneveu","Cyrille","leneveu.cyrille@free.fr");
		client2.afficherClient();
				
		Client client3 = new Client("Lecourt","Vincent","lecourt.vincent@free.fr");
		client3.afficherClient();
					
		System.out.println(client1.equals(client2));
		System.out.println(client1.equals(client3));
		boolean b = (client1== client2);
		System.out.println(b);
		boolean c = (client1== client3);
		System.out.println(c);
				
		System.out.println((client1.getClass()).equals((client2.getClass())));
	}
}

