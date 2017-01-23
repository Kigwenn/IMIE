package mvc;

public class MainMVC {

	public static void main(String[] args) {
		
		//Creation du modele
		Modele model = new Modele();
		
		//Creation du controlleur
		Controlleur control = new Controlleur(model);
		
		//Creation de la vue
		Vue v = new Vue(control);
		
		//ma vue observe mon modele
		model.addObserver(v); 
	}

}
