import java.awt.Dimension;

import javax.swing.*;


public class MenuGUI {
	
	public MenuGUI() 
	
	{
		JFrame f = new JFrame ("OpenVoc");
		f.setPreferredSize(new Dimension(600, 300));
		JTabbedPane tp = new JTabbedPane();
		tp.addTab("Welcome", new ImageIcon("images/linux.png"), new WelcomeGUI(), "still does nothing");
		tp.addTab("Practice", new ImageIcon("images/linux.png"), new PracticeGUI(), "in progress");
		tp.addTab("Practice Anonymous", new ImageIcon("images/linux.png"), new PracticeAnonymousGUI(), "what did you think ? ");
		tp.addTab("Test", new ImageIcon("images/linux.png"), new TestGUI(), "u're sure not ready");
		tp.addTab("Add", new ImageIcon("images/linux.png"), new AddGUI(), "does nothing yet");
				
		f.add(tp);
		f.pack();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}

	

}
