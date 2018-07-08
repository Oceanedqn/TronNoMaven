import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Menuu extends JPanel implements KeyListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	

	
	public void paintComponent(Graphics g){
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 600, 400);
		try
		{
			Image img = ImageIO.read(new File("src/pictures/TronBleu.png"));
			g.drawImage(img, 165, 50, this);
		} 
		catch(IOException e){
			e.printStackTrace();
		}
		
		
		
		
		try
		{
			Image img = ImageIO.read(new File("src/pictures/TronRose.png"));
			g.drawImage(img, 165, 50, this);
		} 
		catch(IOException e){
			e.printStackTrace();
		}
		
        
	}
	
	public Menuu() {
        	

        }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

	

}
