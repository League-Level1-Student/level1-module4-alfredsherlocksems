package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Surprise implements ActionListener {
	JFrame window = new JFrame();
	JPanel panel = new JPanel();
	JButton trick = new JButton();
	JButton treat = new JButton();
	public Surprise () {
		window.add(panel);
		window.setVisible(true);
		panel.add(trick);
		panel.add(treat);
		trick.setText("Trick");
		treat.setText("Treat");
		window.pack();
		trick.addActionListener(this);
		treat.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == trick) {
			showPictureFromTheInternet("https://i.pinimg.com/originals/84/91/bb/8491bbf75049ac2b8549a723d99f6858.jpg");
			}
		else {
			showPictureFromTheInternet("https://i.kym-cdn.com/entries/icons/facebook/000/029/498/Frog_relaxing_0-9_screenshot.jpg");
		}
	}
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
}

