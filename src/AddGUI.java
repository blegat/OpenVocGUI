import javax.swing.*;

public class AddGUI extends JPanel {
	
	public AddGUI()
	{
		Box b = Box.createVerticalBox();
	
		JLabel l = new JLabel("Add some word before ACTA is voted and you are not allowed to do it anymore.");
			
		b.add(l);
		
		add(b);
	}

}
