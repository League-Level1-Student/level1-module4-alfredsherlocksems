package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField digit1 = new JTextField(10);
	JTextField digit2 = new JTextField(10);
	JButton add = new JButton();
	JButton subtract = new JButton();
	JButton multiply = new JButton();
	JButton divide = new JButton();
	JLabel answer = new JLabel();
	void setup () {
		frame.setVisible(true);
		frame.setSize(200, 200);
		frame.add(panel);
		panel.add(digit1);
		panel.add(digit2);
		panel.add(add);
		panel.add(subtract);
		panel.add(multiply);
		panel.add(divide);
		panel.add(answer);
		add.addActionListener(this);
		subtract.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		add.setText("add");
		subtract.setText("subtract");
		multiply.setText("multiply");
		divide.setText("divide");
		answer.setText("0");
		frame.pack();
	}
	int add(int num1, int num2) {
		return num1 + num2;
	}
	
	int subtract(int num1, int num2) {
		return num1 - num2;
	}

	int multiply (int num1, int num2) {
		return num1 * num2;
	}

	int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(digit1.getText());
		int num2 = Integer.parseInt(digit2.getText());
		String bob = "0";
		if (arg0.getSource() == add) {
			bob = "" + add(num1, num2);
		}
		if (arg0.getSource() == subtract) {
			bob = "" + subtract(num1, num2);
		}
		if (arg0.getSource() == multiply) {
			bob = "" + multiply(num1, num2);
		}
		if (arg0.getSource() == divide) {
			bob = "" + divide(num1, num2);
		}
		answer.setText(bob);
		frame.pack();
	}
}
