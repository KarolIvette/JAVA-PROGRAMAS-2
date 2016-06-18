package TareaFacturacion;

import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {
		
		String ax;
	    int op=0;
	    Factura inf = new Factura();
	    
	    do{
	    	ax = JOptionPane.showInputDialog(null, "1: INGRESAR PRODUCTOS\n2: MOSTRAR PRODUCTOS\n3: CALCULAR TOTAL\n4: LIMPIAR FACTURA\n5: SALIR\n\nINGRESE SU OPCION:");
	    	if(ax!=null && !ax.equals("")){
	    		op = Integer.parseInt(ax);
	    		
	    		switch(op){
	    		 case 1:
	    			     inf.ingresar();
	                     break;
	             case 2:
	                     inf.mostrar();
	                     break;
	             case 3:
	                     inf.subtotal();
	                     break;
	             case 4:
	                     int resp = Integer.parseInt(JOptionPane.showInputDialog(null, "DESEA LIMPIAR LA FACTURA (1 -> SI )/(2 -> NO )"));
	                     if(resp == 1){
	                    	 inf.limpiar();
	                     }
	                     break;
	             case 5:
	                     JOptionPane.showMessageDialog(null, "SALIENDO...");
	                     break;
	             default:
	                     JOptionPane.showMessageDialog(null, "INGRESE UNA OPCION VALIDA");                  
	            }
	    	}
	    }while(op!=5);
	}
	
}
