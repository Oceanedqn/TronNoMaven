import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame{


	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Start");
	
	//Menuu menuu = new Menuu();

	public Window() {
		
		this.setTitle("Tron");
	    this.setSize(600, 400);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    this.setResizable(false);	
	    this.setAlwaysOnTop(true);	
	    

	    this.getContentPane().setBackground(Color.BLACK);
	    this.setVisible(true);
		
			    
	  }
	  }	
	