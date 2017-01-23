import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class MonBouton extends Button implements ActionListener{

	public MonBouton(String label) {
		super(label);
		addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Clic sur bouton !");
	}
}

