package ObjetoEstudiante;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		int opcion=99;
		
		Informacion[] items = new Informacion[5];
		items[0] = new Informacion("0001", "KAROL CEDEÑO ", "MATEMATICA  ", 25, 17.5);
		items[1] = new Informacion("0002", "DIANA TAMAYO ", "CONTABILIDAD", 27.8, 14);
		items[2] = new Informacion("0003", "KAREN ACHILIE", "QUIMICA     ", 19, 7.5);
		items[3] = new Informacion("0004", "TAMARA CHAVEZ", "DISEÑO      ", 23, 15.5);
		items[4] = new Informacion("0005", "XIMENA TORRES", "FISICA      ", 12, 6);
		
		while(!(opcion==4)){
			opcion = Integer.parseInt(JOptionPane.showInputDialog("1: LISTA ESTUDIANTES\n2: BUSCAR ESTUDIANTES POR MATRICULA\n3: MOSTRAR ESTUDIANTES QUE APRUEBAN\n4: SALIR\n\nINGRESE SU OPCION:"));
		
		switch(opcion){
		case 1:
			    for(int i=0; i<items.length; i++){
			    	items[i].show_inf();
			    }
			    break;
		case 2: 
			    System.out.println("**********************************************************************************************************");
			    boolean bandera = false;
			    String matricula = JOptionPane.showInputDialog("INGRESE MATRICULA:");
			    for(int i=0; i<items.length; i++){
			    	if(matricula.equals(items[i].getMatricula())){
			    		items[i].show_inf();
			    	    bandera = true;
			    	}
		        }
			    if(!bandera)
			    	JOptionPane.showMessageDialog(null, "NO EXISTE EL ALUMNO");
			    break;
		case 3: 
			System.out.println("**********************************************************************************************************");
			    double promedio = 0;
			    for(int i=0; i<items.length; i++){
			    	promedio = items[i].getNota_parciales() + items[i].getNota_examen();
			    	if(promedio >= 30){
			    		items[i].show_inf();
			    	}
		        }
			    break;
		case 4: 
			    JOptionPane.showMessageDialog(null, "SE VA A CERRAR");
			    break;
		}
		
	    }
	}
}
