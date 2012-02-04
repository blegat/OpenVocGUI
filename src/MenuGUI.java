import javax.swing.*;


public class MenuGUI {
	
	public MenuGUI() 
	
	{
		JFrame f = new JFrame ("OpenVoc");
		JPanel p = new JPanel();
		f.add(p);
		
		JTabbedPane tp = new JTabbedPane();
		tp.addTab("Practice", new ImageIcon("images/linux.png"), new JPanel(), "still does nothing");
		tp.addTab("Add", new ImageIcon("images/linux.png"), new JPanel(), "does nothing yet");
		tp.addTab("Practice Anonymous", new ImageIcon("images/linux.png"), new JPanel(), "what did you think ? ");
		p.add(tp);
		f.pack();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}

	

}
