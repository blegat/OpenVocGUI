
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PracticeGUI extends JPanel{
	
	private JLabel lcorrect;
	private JLabel lword;
	private JTextField tf;
	private JLabel lans;
	
	//temporaire en attendant la suite du projet
	private String word = "oui";
	private String ans = "yes";
	
	
	public PracticeGUI()
	{
		Box bAlot = Box.createVerticalBox();
		Box bCor = Box.createVerticalBox();
		Box bSw = Box.createVerticalBox();
	
		lword = new JLabel(word);
		lcorrect = new JLabel();
		lans = new JLabel();
		tf = new JTextField();
		
		JButton correct = new JButton("Correct");
			correct.addActionListener(new correctListener());
		JButton next = new JButton("Next");
			next.addActionListener(new nextListener());
		JButton showAns = new JButton ("Show answer");
			showAns.addActionListener(new showAnsListener());
		JButton sw = new JButton("Switch language");
			sw.addActionListener(new switchListener());
		JButton stuMis = new JButton ("Stupid Mistake");
			stuMis.addActionListener(new stuMis());
			
		bAlot.add(lword);
		bAlot.add(tf);
		bAlot.add(lcorrect);
		bAlot.add(lans);
		
		bCor.add(showAns);
		bCor.add(next);
		bCor.add(correct);
		bCor.add(stuMis);
		
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
			lcorrect.setText(new Boolean(ans.equals(tf.getText())).toString());
		}
			
	}
	
	private class nextListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
				lword.setText("en attendant la suite");		
				lcorrect.setText(" ");
				lans.setText("");
		}
		
	}
	private class showAnsListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			lans.setText(ans);
		}
		
	}
	private class stuMis implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			lcorrect.setText("ok but be careful");
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
