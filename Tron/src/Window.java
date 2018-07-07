import javax.swing.JFrame;

public class Window extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public Window() {
		
		this.setTitle("Tron");
		this.setSize(600,500);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setLocationRelativeTo(null);
		this.setResizable(false);		
		//Garde la fenêtre au premier plan
		this.setAlwaysOnTop(true);
		
		this.setContentPane(new Menuu());
		
		
		
	    
	  }
	  }	
	