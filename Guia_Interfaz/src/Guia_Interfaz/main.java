package Guia_Interfaz;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		int anio_nacimiento = 0;
		int anio_atual = 2016;
		
		Estudiante cad = new Estudiante();
		anio_nacimiento = (Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL ANIO DE NACIMIENTO:")));
		String nombres = (JOptionPane.showInputDialog("INGRESE EL NOMBRE:"));
		
		JOptionPane.showMessageDialog(null, "SU EDAD ES: "+cad.calcular_edad(anio_nacimiento, anio_atual));

	}

}
