import java.awt.Button;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MonBouton extends Button implements MouseListener{
	
		public MonBouton(String label) {
			super(label);
			addMouseListener(this);
}
	
	public void mouseClicked(MouseEvent e){
		this.setLabel("On m'a cliquée");
		System.out.println("On m'a cliquée");
		}
 
	public void mousePressed(MouseEvent e) {
		this.setLabel("Pressé !");
		System.out.println("Pressé !");
	}
	
	public void mouseReleased(MouseEvent e) {
		this.setLabel("Relachâché");
		System.out.println("Relachâché");
	}
	
	// entre sur le bouton
	public void mouseEntered(MouseEvent e) {
		this.setBackground(Color.BLUE);
	}
	// quite le bouton
	public void mouseExited(MouseEvent e) {
		this.setLabel("bouton");
		this.setBackground(Color.RED);
		
	}
	


}