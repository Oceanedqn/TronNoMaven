import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menuu extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Start");
	
	
	
	public void paintComponent(Graphics g){
        try{
        
       Image img = ImageIO.read(new File("src/pictures/TronBleu.png"));
       g.drawImage(img, 165, 50, this);
   } catch(IOException e){
       e.printStackTrace();
   }
        
	}
        public Menuu() {
        	

        }
	

}
