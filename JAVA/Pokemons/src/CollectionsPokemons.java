import java.util.ArrayList;
import java.util.Iterator;

import sun.invoke.empty.Empty;


public class CollectionsPokemons {

//───── Attributs ────────────────────────────────────────────────		
	
	private ArrayList list ;
		
	
//───── Constructeurs ────────────────────────────────────────────
		
	public CollectionsPokemons() {
		this.list = new ArrayList();
		System.out.println("      Une liste de collection à été creer !");
		System.out.println("          ─────────────────────────────    \n");
	}
		
//───── Methodes ─────────────────────────────────────────────────
		
	public void listPokemons() {
		Iterator <Pokemon> i = list.iterator();
		while(i.hasNext()){
			Pokemon x = (Pokemon)i.next();
			System.out.println("                  ─ "+x.nom);
		}
		
	}

	public void ajoutPokemons(Pokemon idPokemon) {
		if(list.isEmpty() == true){
		this.list.add(idPokemon);
			System.out.println("le pokemon "+idPokemon.nom+" a bien ete ajouter a la liste !\n");
		}
		else{
			Iterator <Pokemon> i = list.iterator();
			boolean r = false;
			while(i.hasNext()){
				Pokemon x = (Pokemon)i.next();
				if(idPokemon.equals(x)){
					r = true;
				}
			}	
			if( r == false){
				this.list.add(idPokemon);
				System.out.println("le pokemon "+idPokemon.nom+" a bien ete ajouter a la liste !\n");
			}
			else{
				System.out.println("────── Le pokemon "+idPokemon.nom+" n'a pas ete ajouter !──────\n");
			}
		}
	
	}
					
	public void delPokemons(Pokemon idPokemon){
		this.list.remove(idPokemon);
		System.out.println("le pokemon "+idPokemon.nom+" a bien ete effacer a la liste !\n");
	}

	public void VitesseMoyenne(){
		double sum = 0;
		Iterator <Pokemon> i = list.iterator();
		while(i.hasNext()){
			Pokemon x = (Pokemon)i.next();
			sum = sum +x.vitesse();
		}
		System.out.println("\n┌──────────────────────────────────────────────────┐");
		System.out.println(" la vitesse moyenne des pokemons est de "+sum+" Km/h !");
		System.out.println("└──────────────────────────────────────────────────┘\n");
	}	
	
}
