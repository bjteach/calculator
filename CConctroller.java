package Calculator;

import java.awt.*;
import java.awt.event.*;
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
		
	}
}