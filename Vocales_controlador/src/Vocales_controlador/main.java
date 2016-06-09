package Vocales_controlador;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		Vocales cad = new Vocales();
		cad.setCadena(JOptionPane.showInputDialog("INGRESE LA PALABRA:"));
		
		cad.show_inf();
	}

}
