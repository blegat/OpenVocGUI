
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PracticeGUI extends JPanel{
	
	private JLabel lcorrect;
	private JLabel lword;
	private JTextField tf;
	private JLabel lans;
	private JButton correct;
	private JButton next;
	private JButton showAns;
	private JButton stuMis;

	private WordSet set;
	boolean found;
	
	//temporaire en attendant la suite du projet
	private String word = "oui";
	private String ans = "yes";
	
	
	public PracticeGUI(WordSet set)
	{
		this.set = set;
		Box bAlot = Box.createVerticalBox();
		Box bCor = Box.createVerticalBox();
		Box bSw = Box.createVerticalBox();
	
		lword = new JLabel(set.next());
		lcorrect = new JLabel();
		lans = new JLabel();
		tf = new JTextField();
		
		correct = new JButton("Correct");
			correct.addActionListener(new correctListener());
		next = new JButton("Next");
			next.addActionListener(new nextListener());
			next.setEnabled(false);
		showAns = new JButton ("Show answer");
			showAns.addActionListener(new showAnsListener());
		JButton sw = new JButton("Switch language");
			sw.addActionListener(new switchListener());
		stuMis = new JButton ("Stupid Mistake");
			stuMis.addActionListener(new stuMis());
			stuMis.setEnabled(false);
			
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
			if (found = set.check(tf.getText())) { // Il y a 1 seul =, c'est fait expres
				lcorrect.setText("Correct");
			} else {
				lcorrect.setText("Wrong");
				lans.setText(set.answer());
				showAns.setEnabled(false);
				stuMis.setEnabled(true);
			}
			next.setEnabled(true);
			correct.setEnabled(false);
		}
			
	}
	
	private class nextListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			lcorrect.setText("");
			lans.setText("");
			tf.setText("");
			lword.setText(set.next());
			next.setEnabled(false);
			stuMis.setEnabled(false);
			found = false;
			correct.setEnabled(true);
			showAns.setEnabled(true);
		}
		
	}
	private class showAnsListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			lans.setText(set.answer());
			next.setEnabled(true);
			if (!found) {
				stuMis.setEnabled(true);
			}
			showAns.setEnabled(false);
		}
		
	}
	private class stuMis implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			lcorrect.setText("ok but be careful");
			stuMis.setEnabled(false);
		}
	}
	private class switchListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			lcorrect.setText("ru fckg kidding me? switcher = mauvaise idee");
		}
			
	}

}
