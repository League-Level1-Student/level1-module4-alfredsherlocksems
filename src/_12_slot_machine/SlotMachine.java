package _12_slot_machine;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton spinButton = new JButton();
	JLabel slot1;
	JLabel slot2;
	JLabel slot3;

	void setup() {
		frame.setVisible(true);
		frame.setSize(250, 200);
		frame.add(panel);

		spinButton.setText("Spin");
		spinButton.addActionListener(this);
		frame.add(panel);
		
		try {
			slot1 = createLabelImage("Kiwi.jpg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			slot2 = createLabelImage("Knight(Chess).jpg");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			slot3 = createLabelImage("Simpsons.jpg");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		slot1.setPreferredSize(new Dimension (100, 100));
		slot2.setPreferredSize(new Dimension (100, 100));
		slot3.setPreferredSize(new Dimension (100, 100));

		panel.add(spinButton);
		panel.add(slot1);
		panel.add(slot2);
		panel.add(slot3);
		frame.pack();
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int num = ran.nextInt(3);
		try {
			if (num == 0) {
				slot1 = createLabelImage("Kiwi.jpg");
			}
			if (num == 1) {
				slot1 = createLabelImage("Knight(Chess).jpg");
			}
			if (num == 2) {
				slot1 = createLabelImage("Simpsons.jpg");
			}
			num = ran.nextInt(3);
			switch (num) {
			case 0: slot2 = createLabelImage("Kiwi.jpg");
			break;
			case 1: slot2 = createLabelImage("Knight(Chess).jpg");
			break;
			case 2: slot2 = createLabelImage("Simpsons.jpg");
			break;
			}
			num = ran.nextInt(3);
			switch (num) {
			case 0: slot3 = createLabelImage("Kiwi.jpg");
			break;
			case 1: slot3 = createLabelImage("Knight(Chess).jpg");
			break;
			case 2: slot3 = createLabelImage("Simpsons.jpg");
			break;
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		slot1.setPreferredSize(new Dimension (100, 100));
		slot2.setPreferredSize(new Dimension (100, 100));
		slot3.setPreferredSize(new Dimension (100, 100));
		frame.dispose();
		frame = new JFrame();
		frame.setVisible(true);
		panel = new JPanel();
		panel.add(spinButton);
		frame.add(panel);
		panel.add(slot1);
		panel.add(slot2);
		panel.add(slot3);
		frame.pack();
	}

}
