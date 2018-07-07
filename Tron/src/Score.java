import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Score extends JPanel{

	public void paintComponent(Graphics g) {
		
		//Couleur du fond score
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, 600, 100);
		
		//Couleur du fond jeu
		g.setColor(Color.BLACK);
		g.fillRect(0, 100, 600, 400);
		
		//Couleur du contour fond score
		g.setColor(Color.WHITE);
		g.drawRoundRect(0, 0, 593, 100, 10,10);
		
		//Couleur du contour fond jeu
		g.setColor(Color.WHITE);
		g.drawRoundRect(0, 100, 593, 370, 10,10);
	}
}
