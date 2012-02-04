
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PracticeGUI extends JPanel{
	
	public PracticeGUI()
	{
	
		
		JLabel lword = new JLabel();
		JLabel lcorrect = new JLabel();
		JTextField tf = new JTextField();
		JButton correct = new JButton("Correct");
		correct.addActionListener(new correctListener());
		JButton sw = new JButton("Switch language");
		add(lword);
		add(lcorrect);
		add(tf);
		add(correct);
		add(sw);
	}
	
	private class correctListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			
		}
		
		
	}

}
