package _11_whack_a_mole;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WackAMole implements ActionListener {
	public JFrame frame = new JFrame();
	public JPanel panel = new JPanel();
	JButton moleButton;
	public int timesMissed;
	
	public void start () {
		frame.setVisible(true);
		frame.setTitle("Wack a Mole!");
		frame.setSize(200, 200);
		frame.add(panel);
		panel.setLayout(new GridLayout(3, 4));
		Random ran = new Random();
		DrawButtons(ran.nextInt(12));
	}
	void DrawButtons (int num) {
		for (int i = 0; i < 12; i++) {
			JButton button = new JButton();	
			panel.add(button);
			button.addActionListener(this);
			if (num == i) {
				moleButton = button;
				moleButton.setText("mole");
			}
		} 
		frame.pack();	
    }
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (moleButton == arg0.getSource()) {
			frame.dispose();
			frame.remove(panel);
			panel = new JPanel();
			start();
			System.out.println("Nice!");
		}
		else {
			System.out.println("missed");
			timesMissed++;
			if (timesMissed == 5) {
				JOptionPane.showMessageDialog(null, "You missed 5 times -- game over.");
				System.exit(0);
			}
	}
}
}