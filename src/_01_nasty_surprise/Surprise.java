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
			showPictureFromTheInternet("https://www.google.com/imgres?imgurl=https%3A%2F%2Fi.ytimg.com%2Fvi%2F1ZJcfsUA-Xs%2Fhqdefault.jpg&imgrefurl=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3D1ZJcfsUA-Xs&tbnid=1Jp54ZaiSddzDM&vet=12ahUKEwj_p5bo3cTvAhUY66wKHSmfBEQQMygCegUIARDFAQ..i&docid=dF9ps-6lwOkyoM&w=480&h=360&q=cute%20monkeys&ved=2ahUKEwj_p5bo3cTvAhUY66wKHSmfBEQQMygCegUIARDFAQ");
			}
		else {
			showPictureFromTheInternet("");
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

