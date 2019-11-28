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
		_display = new JLabel("0", SwingConstants.RIGHT);
		_display.setBackground(Color.WHITE);
		_display.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		_display.setFont(new Font("Serif", Font.PLAIN, 40));
		_frame.getContentPane().add(_display, BorderLayout.NORTH);

		// Create buttons
		String[] data = new String[] {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", "-", "C", "+"};
		_buttons = new JPanel();
		_buttons.setLayout(new GridLayout(4, 4));
		for (int i = 0; i < 16; i++)
		{
			JButton button = new JButton(data[i]);
			button.addActionListener(listener);
			_buttons.add(button);
		}

		_frame.getContentPane().add(_buttons, BorderLayout.CENTER);
	}

	public void show() 
	{
		// Show window
		_frame.setVisible(true);
	}
}