
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PracticeGUI extends JPanel{
	
	private JLabel lcorrect;
	private JLabel lword;
	private JTextField tf;
	
	public PracticeGUI()
	{
		Box bAlot = Box.createVerticalBox();
		Box bCor = Box.createVerticalBox();
		Box bSw = Box.createVerticalBox();
	
		lword = new JLabel();
		lcorrect = new JLabel();
		tf = new JTextField();
		JButton correct = new JButton("Correct");
		correct.addActionListener(new correctListener());
		JButton sw = new JButton("Switch language");
		sw.addActionListener(new switchListener());
		bAlot.add(lword);
		bAlot.add(tf);
		bAlot.add(lcorrect);
		bCor.add(correct);
		bSw.add(sw);
		
		
		add(bAlot);
		add(Box.createHorizontalStrut(10));
		add(bCor);
		add(Box.createHorizontalStrut(50));
		add(bSw);
	}
	
	private class correctListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			lcorrect.setText("for the moment just useless");
		}
			
	}
	private class switchListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			lcorrect.setText("switcher = mauvaise idee");
		}
			
	}

}
