import javax.swing.*;

public class PracticeAnonymousGUI extends JPanel {
	
	public PracticeAnonymousGUI()
	{
		Box b = Box.createVerticalBox();
	
		JLabel l = new JLabel("You are now a member of anonymous. This has been sent to the FBI.");
			
		b.add(l);
		
		add(b);
	}

}
