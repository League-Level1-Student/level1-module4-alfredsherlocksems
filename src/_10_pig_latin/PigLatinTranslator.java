
package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinTranslator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField input = new JTextField(15);
	JTextField output = new JTextField(15);
	JButton translateButton = new JButton();
	public void start () {
		frame.setVisible(true);
		frame.setSize(500, 95);
		frame.add(panel);
		panel.add(input);
		translateButton.addActionListener(this);
		translateButton.setText("Translate");
		panel.add(translateButton);
		panel.add(output);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
	
