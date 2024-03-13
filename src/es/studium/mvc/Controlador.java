package es.studium.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements WindowListener, ActionListener
{
	Modelo m;
	Vista v;
	
	public Controlador(Modelo modelo, Vista vista)
	{
		m = modelo;
		v = vista;
		
		vista.btnCalcular.addActionListener(this);
		vista.ventana.addWindowListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		int numero = Integer.parseInt(v.txtNumero.getText());
		v.txtResultado.setText(m.calcularDoble(numero) + "");
	}

	@Override
	public void windowClosing(WindowEvent e) 
	{
		System.exit(0);
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}