import javax.swing.*;


public class MenuGUI {
	
	public MenuGUI() 
	
	{
		JFrame f = new JFrame ("OpenVoc");
			
		JTabbedPane tp = new JTabbedPane();
		tp.addTab("Practice", new ImageIcon("images/linux.png"), new PracticeGUI(), "still does nothing");
		tp.addTab("Add", new ImageIcon("images/linux.png"), new JPanel(), "does nothing yet");
		tp.addTab("Practice Anonymous", new ImageIcon("images/linux.png"), new JPanel(), "what did you think ? ");
		
		f.add(tp);
		f.pack();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}

	

}
