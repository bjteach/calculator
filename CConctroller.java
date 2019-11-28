package Calculator;

import java.awt.*;
import java.awt.event.*;

import javax.lang.model.util.ElementScanner6;
import javax.swing.*;

class CController implements ActionListener 
{
	private CView _view;
	private CModel _model;

	public CController()
	{
		_view = new CView(this);
		_model = new CModel();
	}

	public void run()
	{
		_view.show();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JButton button = (JButton) e.getSource();
		String text = button.getText();

		if (text == "C")
		{

		}
		else if (text == "+")
		{

		}
		else if (text == "-")
		{

		}
		else if (text == "*")
		{

		}
		else if (text == "/")
		{

		}
		else if (text == "=")
		{

		}
		else
		{

		}
	}

	private void clear()
	{
		_model.operand = 0;
		_model.operator = "";
		_view.display(_model.operand);
	}
}