import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panneau extends JPanel {
	
	private int i = 0;
	
	
			
	public void paintComponent(Graphics g) {
		
		int taille = (Math.min(getWidth(), getHeight()))/2;
						
		System.out.println("Execution numéro : " + (i++));
		//System.out.println("Taille: "+taille*2);
		
		// Polygone 
		g.setColor(Color.GREEN);
		int x[] = {0, taille/2,taille };
	    int y[] = {taille, 0, taille};
	    g.fillPolygon(x, y, 3);
	    
	    // Rectangle x,y,longueur,hauteur
	    int x1 = taille;
	    int y1 = taille;
	    g.setColor(Color.BLUE);
	    g.fillRect(x1, 0, taille,taille );
	    
	    // Cercle
	    int x2 = 0;
	    int y2 = taille;
	    g.setColor(Color.YELLOW);
	    g.fillOval(x2, y2, taille, taille);
	    
	    // Images
	    try{
	    	Image img = ImageIO.read(new File("images/imie.png"));
	    	int h = img.getHeight(null);
	    	int l = img.getWidth(null);
	    	int himg = h;
	    	int limg = l;
	    	int pl= l/taille;
	    	
	    	if (h<taille){
	    		himg= h;
	    	}
	    	
	    	else{
	    		int calc = (h/100)*taille;
	    		himg = calc;
	    		}
	    	
	    	    	
	    	
	    	if (l<taille){
	    		limg= l;
	    	}
	    	
	    	else{
	    		int calc2 = (l/100)*taille;
	    		int calc = (h/100)*(l/taille);
	    		limg = calc2;
	    		himg = calc ;
	    	}
	    	
	    	System.out.println("Taille img :"+ taille+" / "+taille);
	    	System.out.println("Taille img :"+ l+" / "+h);
	    	System.out.println("Taille img :"+ limg+" / "+himg);
	    	
	    	g.drawImage(img, taille, taille,limg,himg,this);	
	   	} catch (IOException e) {
	        e.printStackTrace();
	   	}
	    
	}
	
}