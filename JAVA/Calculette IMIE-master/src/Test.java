import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import calculette.CalculetteController;
import calculette.CalculetteModel;
import calculette.CalculetteView;

public class Test {

	public static void main(String[] args) {
		//JFrame fenetre = new Calculatrice2();
		//JFrame fenetre = new FenetreMenu();

		//Fenetre fen = new Fenetre();

		//Calculatrice2 cal = new Calculatrice2();

		calculatriceMVC();
		//FenetreClic fen = new FenetreClic();
	}

	public static void calculatriceMVC()
	{
		//Creation de notre modele
		CalculetteModel model = new CalculetteModel();

		//Creation de notre controller
		CalculetteController controller = new CalculetteController(model);

		//Creation de notre vue
		CalculetteView view = new CalculetteView(controller);

		//Notre vue observe notre modele
		model.addObserver(view);
	}

}
