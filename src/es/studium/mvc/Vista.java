package es.studium.mvc;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

public class Vista 
{
	Frame ventana = new Frame("Doble");
	TextField txtNumero = new TextField(20);
	Button btnCalcular = new Button("Calcular");
	TextField txtResultado = new TextField(20);
	
	public Vista()
	{
		ventana.setLayout(new FlowLayout());
		
		ventana.add(txtNumero);
		ventana.add(btnCalcular);
		ventana.add(txtResultado);
		
		ventana.setSize(240,150);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new Vista();
	}
}