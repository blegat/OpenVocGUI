import javax.swing.*;

public class TestGUI extends JPanel{
	
	public TestGUI()
	{
		Box b = Box.createVerticalBox();
	
		JLabel l = new JLabel("Find a way to find the shortest hamiltonian cycle in a polynomial time. You have 4h.");
			
		b.add(l);
		
		add(b);
	}

}
