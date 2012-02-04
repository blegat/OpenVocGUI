import java.awt.Dimension;

import java.io.*;

import javax.swing.*;
import javax.imageio.*;

import java.awt.image.*;

import java.net.URL;


public class MenuGUI {
	
	public MenuGUI() 
	
	{
		WordSet set = new WordSet("set.ocv");
		JFrame f = new JFrame ("OpenVoc");
		f.setPreferredSize(new Dimension(600, 300));
		JTabbedPane tp = new JTabbedPane();
		tp.addTab("Welcome", tux("tux_welcome.gif"), new WelcomeGUI(), "still does nothing");
		tp.addTab("Practice", tux("tux_big.png"), new PracticeGUI(set), "in progress");
		tp.addTab("Practice Anonymous", tux("tux_anonymous.png"), new PracticeAnonymousGUI(), "what did you think ? ");
		tp.addTab("Test", tux("tux_teacher.png"), new TestGUI(), "u're sure not ready");
		tp.addTab("Add", tux("tux_atlas.png"), new AddGUI(), "does nothing yet");
				
		f.add(tp);
		f.pack();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}

	private ImageIcon tux (String fileName) {
		try {
			BufferedImage big = ImageIO.read(new File("images/" + fileName));
			BufferedImage small = new BufferedImage(32, 32, BufferedImage.TYPE_INT_RGB);
			small.getGraphics().drawImage(big, 0, 0, 32, 32, null);
			return new ImageIcon(small, "Tux, always there when you need him");
		} catch (IOException e) {
			System.err.println("Can't locate Tux image");
		}
		return null;
	}

}
