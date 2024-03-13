package es.studium.mvc;

public class Principal 
{
	public static void main(String[] args) 
	{
		Modelo m = new Modelo();
		Vista vista = new Vista();
		
		new Controlador(m, vista);
	}
}