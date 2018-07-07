import javax.swing.JFrame;

public class Fenetre extends JFrame{

	public Fenetre() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setAlwaysOnTop(true);
		this.setVisible(true);
	}
}
