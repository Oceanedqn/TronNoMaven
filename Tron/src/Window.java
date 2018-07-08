import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window extends JFrame implements /*IView*/ ActionListener{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton bouton = new JButton("Start");
	private Menuu menuu = new Menuu();
	//private JPanel pan = new JPanel();
	 
	
	//Menuu menuu = new Menuu();

	public Window() {
		
		this.setTitle("Tron");
	    this.setSize(600, 400);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    this.setResizable(false);	
	    this.setAlwaysOnTop(true);	
	    

	    
	    this.getContentPane().setBackground(Color.BLACK);
	    
	    
	    menuu.setLayout(new BorderLayout());
	    menuu.add(bouton, BorderLayout.SOUTH);
	    bouton.addActionListener(this);
	    this.setContentPane(menuu);
	    this.setVisible(true);
		
			    
	  }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	  }	
	