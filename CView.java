package Calculator;

import java.awt.*;
import javax.swing.*;
import javax.swing.BorderFactory;
import java.awt.event.*;


public class CView 
{
	private JFrame _frame;
	private JLabel _display;
	private JPanel _buttons;

	public CView(ActionListener listener)
	{
		// Create and set up the window.
		_frame = new JFrame("Simple Calculator");
		_frame.setSize(400, 300);
		_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create display 
		_display = new JLabel("0");

		// Create buttons
		_buttons = new JPanel();
		_buttons.setLayout(new GridLayout(4, 4));
		for (int i = 0; i < 16; i++)
		{
			JButton button = new JButton();
			_buttons.add(button);
		}
	}

	public void show() 
	{
		// Show window
		_frame.setVisible(true);
	}
}