package MesVector;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		int numes;
		
		String arr[] = {"ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO","JULIO","AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE"};
		NumeroMes vec = new NumeroMes(arr);
		
		do{
		numes = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NUMERO:"));
		}while(numes<0 || numes>12);
		
		vec.getNombreMes(arr, numes);
	}
}
