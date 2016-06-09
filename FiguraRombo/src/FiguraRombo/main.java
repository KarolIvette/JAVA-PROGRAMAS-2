package FiguraRombo;
import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {
		Rombo figura =  new Rombo();
		figura.set_tamaño(Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL TAMAÑO:")));
		
		figura.dibujarombo(figura.get_tamaño());		
	}

}
