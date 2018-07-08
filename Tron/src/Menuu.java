import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Menuu extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor
	 */
	public Menuu() {
    }
	
	/**
	 * Method for draw the menu
	 */
	public void paintComponent(Graphics g){	
		/**
		 * Draw background black
		 */
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 600, 400);	
		/**
		 * Write a text gray
		 */
		g.setColor(Color.GRAY);		
		Font fonte = new Font("Zapfino", Font.BOLD,15);
		g.setFont(fonte);
		g.drawString("Press ENTER for start the game", 175, 250);
	
		/**
		 * Insert a picture for the background
		 */
		try
		{
			Image img = ImageIO.read(new File("src/pictures/TronBleu.png"));
			g.drawImage(img, 165, 50, this);
			System.out.println("On met l'image en bleu");
		} 
		catch(IOException e){
			e.printStackTrace();
		}

		//FAIRE UN TRUC POUR LE FAIRE CHANGER DE COULEUR
		
		try
		{
			Image img = ImageIO.read(new File("src/pictures/TronRose.png"));
			g.drawImage(img, 165, 50, this);
			System.out.println("On met l'image en rouge");
		} 
		catch(IOException e){
			e.printStackTrace();
		}		
	}
			

	
	
	
	

}
