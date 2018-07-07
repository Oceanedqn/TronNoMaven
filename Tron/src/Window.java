import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JPanel areaScore = new JPanel();
	JPanel areaGame = new JPanel();
	
	
	public Window() {
		
		this.setTitle("Tron");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setAlwaysOnTop(true);
		this.setVisible(true);
		//this.getContentPane().setBackground(Color.BLACK);
	}
}
