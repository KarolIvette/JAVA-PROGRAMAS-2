package MatrizAleatoria;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		int filas, columnas, dig;
		int[][] arr;
		
		
		filas = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE FILAS:"));
		columnas = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE COLUMNAS:"));
		dig = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL DIGITO DE NUMEROS A MOSTRAR:"));
		
		arr = new int [filas][columnas];
		
		Aleatorio vec = new Aleatorio (arr, filas, columnas, dig);
		
		vec.cargar(arr, filas, columnas, dig);
	}
}