import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Joueur {

//==== Attributs ================================================
		
	private String login ;
	private String pw ;	
	
//==== Constructeurs ============================================
	
	public Joueur() {
		identification();
	}
	
//==== Methodes =================================================
	
	public void identification(){
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("\t\t  ┌──────────────────────┐");
		System.out.println("\t\t  │      Connection      │");
		System.out.println("\t\t  └──────────────────────┘\n");
		System.out.print("\t\t    login : ");
		login = sc.nextLine();
		System.out.print("\n\t\t    Mot de passe : ");
		pw = sc.nextLine();
	}
	
	public boolean check(){
		
		String query ="SELECT login,id_compte FROM compte WHERE login = ?";
		String query2 ="SELECT login, id_compte, pw FROM compte WHERE login = ? AND pw = ?";
	
		try{
			//utilisation de PreparedStatement pour l'utilisation de trou dans les query on peut lire le resultat dans les 2 senses les changements ne seront
			//pas visible et les données seront que consultablent.
			PreparedStatement prepare = Connect.getInstance().prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			prepare.setString(1, login);
			ResultSet result = prepare.executeQuery();
			
			if(result.first()){
				PreparedStatement prepare2 = Connect.getInstance().prepareStatement(query2, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				prepare2.setString(1, login);
				prepare2.setString(2, pw);
				
				ResultSet result2 = prepare2.executeQuery();
				
				//user identifie
				
				if(result2.first()){
					System.out.println("\nIdentification OK...\n");
					
					//On remplit nos attibuts
					int id = result2.getInt("id_compte");
					
					if(result2.getString("login") != null){
						login = result2.getString("login");
						return true;	
					}	
							
				}				
			
				//Mot de passe non valide !
				else {
					System.out.println("\nAttention le mot de passe est invalide !\n");
					return false;
				}
			}
			
			else {
				System.out.println("\nAttention le login saisi n'existe pas !\n");
				return false;
			}
		}	
		catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	
//==== get /set =================================================
				
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}					

}

