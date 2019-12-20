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
        _model.operand = 0;
	}

	public void run()
	{
		_view.show();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
        JButton button = (JButton) e.getSource();
        String upper = button.getText();
        long num = Integer.parseInt(upper);
        long new_num = _model.operand * 10 + num;

        if (new_num <= 99999999999999999L)
        {
            _model.operand = new_num;
            _view.display(new_num);
        }
	}
}