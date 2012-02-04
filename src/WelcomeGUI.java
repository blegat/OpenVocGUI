import javax.swing.*;

public class WelcomeGUI extends JPanel {
	
	public WelcomeGUI()
	{
		Box b = Box.createVerticalBox();
	
		JLabel l = new JLabel("Y U NO PRACTICING YET ?");
			
		b.add(l);
		
		add(b);
	}

}
