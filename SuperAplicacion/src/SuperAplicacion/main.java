package SuperAplicacion;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {

		HijaEstudiante Objeto1 = new HijaEstudiante("0802708917", "9845");
		HijaEstudiante Objeto2 = new HijaEstudiante("0801167602", "MILER", "CEDEÑO", "9865");
		HijaEstudiante Objeto3 = new HijaEstudiante("JENNIFFER", "BAUTISTA", "COMERCIO EXTERIOR");
		HijaEstudiante Objeto4 = new HijaEstudiante("0801662164", "ARACELI", "GARCIA", "ESMERALDAS", "9870", "SISTEMAS");
		
		System.out.println("INFORMACION 1: ");
		Objeto1.setNombres("IVETTE");
		Objeto1.setApellidos("ADAME");
		Objeto1.setCiudad("ESMERALDAS");
		Objeto1.setCarrera("SISTEMAS");
		Objeto1.showDim();
		Objeto1.showInf();
		
		System.out.println("============================");
		
		System.out.println("INFORMACION 2: ");
		Objeto2.setCiudad("GUAYAQUIL");
		Objeto2.setCarrera("MEDICINA");
		Objeto2.showDim();
		Objeto2.showInf();

		System.out.println("============================");
		
		System.out.println("INFORMACION 3: ");
		Objeto3.setCedula_identidad("0802345762");
		Objeto3.setCiudad("QUITO");
		Objeto3.setCodigo_matricula("9836");
		Objeto3.showDim();
		Objeto3.showInf();

		System.out.println("============================");
		
		System.out.println("INFORMACION 4: ");
		Objeto4.showDim();
		Objeto4.showInf();
		
		
		JOptionPane.showMessageDialog(null, "PERSONAS QUE VIVEN EN ESMERALDAS, *ACEPTAR* PARA CONTINUAR: ");
		Objeto1.viveEsmeraldas();
		Objeto2.viveEsmeraldas();
		Objeto3.viveEsmeraldas();
		Objeto4.viveEsmeraldas();
		
	}

}
