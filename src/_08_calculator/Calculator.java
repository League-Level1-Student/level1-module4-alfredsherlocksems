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
	JTextField num1 = new JTextField(10);
	JTextField num2 = new JTextField(10);
	JButton add = new JButton();
	JButton subtract = new JButton();
	JButton multiply = new JButton();
	JButton divide = new JButton();
	JLabel answer = new JLabel();
	void setup () {
		frame.setVisible(true);
		frame.setSize(200, 200);
		frame.add(panel);
		panel.add(num1);
		panel.add(num2);
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
		frame.pack();
	}
	void add() {
		
	}
	void subtract() {
		
	}
	void divide() {
		
	}
	void multiply() {
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == add) {
			add();
		}
		if (arg0.getSource() == subtract) {
			subtract();
		}
		if (arg0.getSource() == multiply) {
			multiply();
		}
		if (arg0.getSource() == divide) {
			divide();
		}
	}
}
