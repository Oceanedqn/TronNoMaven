import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Game extends JFrame implements KeyListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8395759457708163217L;

	public Game() {
		this.setTitle("Game Tron");
		this.setSize(900, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    this.setResizable(false);	
	    this.setAlwaysOnTop(true);	
		this.setBackground(Color.BLACK);
		this.setVisible(true);
	    
		
	}
	

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode())
		{
		case KeyEvent.VK_Z:
		//Insutrction aller en haut	
		break;
		
		case KeyEvent.VK_Q:
			//Insutrction aller GAUCHE	
		break;
			
		case KeyEvent.VK_S:
			//Insutrction aller en BAS	
		break;
			
		case KeyEvent.VK_D:
			//Insutrction aller DROITE
		break;
			
		case KeyEvent.VK_UP:
			//Insutrction aller en haut	
		break;
			
		case KeyEvent.VK_LEFT:
			//Insutrction aller en GAUCHE
		break;
			
		case KeyEvent.VK_DOWN:
			//Insutrction aller enBAS
		break;
			
		case KeyEvent.VK_RIGHT:
			//Insutrction aller en DROITE
		break;
			
			
		//CHOIX DE PLUS QUE DEUX JOUEURS
		
		
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//La moto n'as pas le droit de s'arrêter
		
	}
}
