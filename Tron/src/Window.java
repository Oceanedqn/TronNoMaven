import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class Window extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	
	public Window() {
		
		this.setTitle("Tron");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,500);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		//Garde la fenêtre au premier plan
		this.setAlwaysOnTop(true);
	
		this.getContentPane().setBackground(Color.BLACK);
		
		this.setContentPane(new DesignGame());
	}
}
