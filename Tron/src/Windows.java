import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Windows extends JFrame implements KeyListener{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	JButton bouton = new JButton("Start");
	private Menuu menuu = new Menuu();
	//private JPanel pan = new JPanel();
	 
	
	//Menuu menuu = new Menuu();

	public Windows() {
		
		this.setTitle("Tron");
	    this.setSize(600, 400);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    this.setResizable(false);	
	    this.setAlwaysOnTop(true);	
	    

	    
	    this.getContentPane().setBackground(Color.BLACK);
	    
	    
	  //  menuu.setLayout(new BorderLayout());
	  //  menuu.add(bouton, BorderLayout.SOUTH);
	   // bouton.addActionListener(this);
	    this.setContentPane(menuu);
	    this.setVisible(true);
		
	    this.addKeyListener((KeyListener) this);
		System.out.println("caca");
	    
			    
	  }
	
	
	public void closeWindow() {
		this.setVisible(false);
	}
	
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
	if(e.getKeyCode() == KeyEvent.VK_ENTER) {
		closeWindow();
		System.out.println("caca");	
		Game game = new Game();

	}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

	
}	
	