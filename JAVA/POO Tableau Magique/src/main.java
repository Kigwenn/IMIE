public class main {

	// ================ Exo 11 ==================================

	public static void main(String[] args) {

		System.out.println("+---------------------------------+");
		System.out.println("|           Tableau 1             |");
		System.out.println("+---------------------------------+");

		Exo11 t1 = new Exo11(5, 5);

		t1.setTab(0, 0, 2);
		t1.setTab(0, 1, 3);
		t1.setTab(0, 2, 15);
		t1.setTab(0, 3, 22);
		t1.setTab(0, 4, 23);
		t1.setTab(1, 0, 1);
		t1.setTab(1, 1, 9);
		t1.setTab(1, 2, 14);
		t1.setTab(1, 3, 20);
		t1.setTab(1, 4, 21);
		t1.setTab(2, 0, 13);
		t1.setTab(2, 1, 16);
		t1.setTab(2, 2, 17);
		t1.setTab(2, 3, 8);
		t1.setTab(2, 4, 11);
		t1.setTab(3, 0, 24);
		t1.setTab(3, 1, 18);
		t1.setTab(3, 2, 7);
		t1.setTab(3, 3, 10);
		t1.setTab(3, 4, 6);
		t1.setTab(4, 0, 25);
		t1.setTab(4, 1, 19);
		t1.setTab(4, 2, 12);
		t1.setTab(4, 3, 5);
		t1.setTab(4, 4, 4);

		// t1.afficheTab();
		t1.somTab();
		t1.somLigTab();
		t1.isValidMagicSquare();

		System.out.println("+---------------------------------+");
		System.out.println("|           Tableau 2             |");
		System.out.println("+---------------------------------+");

		Exo11 t2 = new Exo11(6, 6);

		t2.setTab(0, 0, 2);
		t2.setTab(0, 1, 4);
		t2.setTab(0, 2, 9);
		t2.setTab(0, 3, 31);
		t2.setTab(0, 4, 32);
		t2.setTab(0, 5, 33);
		t2.setTab(1, 0, 1);
		t2.setTab(1, 1, 5);
		t2.setTab(1, 2, 20);
		t2.setTab(1, 3, 26);
		t2.setTab(1, 4, 29);
		t2.setTab(1, 5, 30);
		t2.setTab(2, 0, 3);
		t2.setTab(2, 1, 27);
		t2.setTab(2, 2, 25);
		t2.setTab(2, 3, 17);
		t2.setTab(2, 4, 18);
		t2.setTab(2, 5, 21);
		t2.setTab(3, 0, 34);
		t2.setTab(3, 1, 23);
		t2.setTab(3, 2, 16);
		t2.setTab(3, 3, 14);
		t2.setTab(3, 4, 13);
		t2.setTab(3, 5, 11);
		t2.setTab(4, 0, 35);
		t2.setTab(4, 1, 24);
		t2.setTab(4, 2, 19);
		t2.setTab(4, 3, 15);
		t2.setTab(4, 4, 12);
		t2.setTab(4, 5, 6);
		t2.setTab(5, 0, 36);
		t2.setTab(5, 1, 28);
		t2.setTab(5, 2, 22);
		t2.setTab(5, 3, 8);
		t2.setTab(5, 4, 7);
		t2.setTab(5, 5, 10);

		// t2.afficheTab();
		t2.somTab();
		t2.somLigTab();
		t2.isValidMagicSquare();

		System.out.println("+---------------------------------+");
		System.out.println("|           Tableau 3             |");
		System.out.println("+---------------------------------+");

		Exo11 t3 = new Exo11(5, 5);

		t3.setTab(0, 0, 2);
		t3.setTab(0, 1, 3);
		t3.setTab(0, 2, 15);
		t3.setTab(0, 3, 22);
		t3.setTab(0, 4, 23);
		t3.setTab(1, 0, 1);
		t3.setTab(1, 1, 9);
		t3.setTab(1, 2, 14);
		t3.setTab(1, 3, 20);
		t3.setTab(1, 4, 21);
		t3.setTab(2, 0, 13);
		t3.setTab(2, 1, 16);
		t3.setTab(2, 2, 18);
		t3.setTab(2, 3, 8);
		t3.setTab(2, 4, 11);
		t3.setTab(3, 0, 24);
		t3.setTab(3, 1, 17);
		t3.setTab(3, 2, 7);
		t3.setTab(3, 3, 10);
		t3.setTab(3, 4, 6);
		t3.setTab(4, 0, 25);
		t3.setTab(4, 1, 19);
		t3.setTab(4, 2, 12);
		t3.setTab(4, 3, 5);
		t3.setTab(4, 4, 4);

		// t3.afficheTab();
		t3.somTab();
		t3.somLigTab();
		t3.isValidMagicSquare();

		System.out.println("+---------------------------------+");
		System.out.println("|           Tableau 4             |");
		System.out.println("+---------------------------------+");

		Exo11 t4 = new Exo11(6, 6);

		t4.setTab(0, 0, 2);
		t4.setTab(0, 1, 4);
		t4.setTab(0, 2, 9);
		t4.setTab(0, 3, 31);
		t4.setTab(0, 4, 32);
		t4.setTab(0, 5, 33);
		t4.setTab(1, 0, 1);
		t4.setTab(1, 1, 5);
		t4.setTab(1, 2, 20);
		t4.setTab(1, 3, 26);
		t4.setTab(1, 4, 29);
		t4.setTab(1, 5, 30);
		t4.setTab(2, 0, 3);
		t4.setTab(2, 1, 27);
		t4.setTab(2, 2, 25);
		t4.setTab(2, 3, 17);
		t4.setTab(2, 4, 18);
		t4.setTab(2, 5, 21);
		t4.setTab(3, 0, 34);
		t4.setTab(3, 1, 23);
		t4.setTab(3, 2, 16);
		t4.setTab(3, 3, 14);
		t4.setTab(3, 4, 13);
		t4.setTab(3, 5, 11);
		t4.setTab(4, 0, 35);
		t4.setTab(4, 1, 24);
		t4.setTab(4, 2, 19);
		t4.setTab(4, 3, 15);
		t4.setTab(4, 4, 2);
		t4.setTab(4, 5, 6);
		t4.setTab(5, 0, 36);
		t4.setTab(5, 1, 28);
		t4.setTab(5, 2, 22);
		t4.setTab(5, 3, 8);
		t4.setTab(5, 4, 7);
		t4.setTab(5, 5, 10);

		// t4.afficheTab();
		t4.somTab();
		t4.somLigTab();
		t4.isValidMagicSquare();
	}
}
