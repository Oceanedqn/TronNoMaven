import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	

	
	
	public Window() {
		
	/*	this.setTitle("Tron");
		this.setSize(600,500);	
		
		// Nouveau panel
		JPanel pan = new JPanel();
		FlowLayout bl = new FlowLayout(FlowLayout.CENTER);
		pan.setLayout(bl); //Attache le layoutManger au panel
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setLocationRelativeTo(null);
		this.setResizable(false);		
		//Garde la fenêtre au premier plan
		this.setAlwaysOnTop(true);
		
		//this.setContentPane(new DesignGame());
		this.setContentPane(pan);*/
		
		JFrame f = new JFrame("Menu Demo");
	    f.setSize(600, 400);

	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JMenuBar jmb = new JMenuBar();

	    JMenu jmFile = new JMenu("File");
	    JMenuItem jmiOpen = new JMenuItem("Open");
	    JMenuItem jmiClose = new JMenuItem("Close");
	    JMenuItem jmiSave = new JMenuItem("Save");
	    JMenuItem jmiExit = new JMenuItem("Exit");
	    jmFile.add(jmiOpen);
	    jmFile.add(jmiClose);
	    jmFile.add(jmiSave);
	    jmFile.addSeparator();
	    jmFile.add(jmiExit);
	    jmb.add(jmFile);

	    JMenu jmOptions = new JMenu("Options");
	    JMenu a = new JMenu("A");
	    JMenuItem b = new JMenuItem("B");
	    JMenuItem c = new JMenuItem("C");
	    JMenuItem d = new JMenuItem("D");
	    a.add(b);
	    a.add(c);
	    a.add(d);
	    jmOptions.add(a);

	    JMenu e = new JMenu("E");
	    e.add(new JMenuItem("F"));
	    e.add(new JMenuItem("G"));
	    jmOptions.add(e);

	    jmb.add(jmOptions);

	    JMenu jmHelp = new JMenu("Help");
	    JMenuItem jmiAbout = new JMenuItem("About");
	    jmHelp.add(jmiAbout);
	    jmb.add(jmHelp);

	    jmiOpen.addActionListener(this);
	    jmiClose.addActionListener(this);
	    jmiSave.addActionListener(this);
	    jmiExit.addActionListener(this);
	    b.addActionListener(this);
	    c.addActionListener(this);
	    d.addActionListener(this);
	    jmiAbout.addActionListener(this);

	    f.setJMenuBar(jmb);
	    f.setVisible(true);
	  }
	  public void actionPerformed(ActionEvent ae) {
	    String comStr = ae.getActionCommand();
	    System.out.println(comStr + " Selected");
	  }
	  }	
	