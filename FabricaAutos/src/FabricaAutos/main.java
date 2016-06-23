package FabricaAutos;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		String ax;
	    int op=0;
	    CentrosDV inf = new CentrosDV();
	    InformacionCalculos dat = new InformacionCalculos();
	    
	    do{
	    	ax = JOptionPane.showInputDialog(null,"1: VER LOS MODELOS DE AUTOS  Y PRECIOS DE VENTA"
	    			                        +"\n2: VER CENTROS DE DISTRIBUCION Y VENTA"
	    			                        +"\n3: INGRESAR REGISTRO DE VENTA"
	    			                        +"\n4: VISUALIZAR VENTAS REGISTRADAS"
	    			                        +"\n5: MOSTRAR EL VOLUMEN DE VENTAS TOTAL, "
	    			                        +"VOLUMEN DE VENTAS POR CENTRO Y "
	    			                        +"% DE UNIDADES POR MODELO VENDIDAS EN CADA CENTRO"
	    			                        +"\n6: SALIR DEL PROGRAMA"
	    			                        +"\n\nINGRESE SU OPCION:");
	    	if(ax!=null && !ax.equals("")){
	    		op = Integer.parseInt(ax);
	    		
	    		switch(op){
	    		 case 1:
	    				 System.out.println("===================================================");
	    			     inf.modelos();
	                     break;
	             case 2:
	            	     System.out.println("===================================================");
	                     inf.centros_distribucion();
	                     break;
	             case 3:
	                     dat.ingresar();
	                     break;
	             case 4:
	            	     System.out.println("===================================================");
	                     dat.mostrar();
	                     break;
	             case 5:
	            	     System.out.println("===================================================");
	                     dat.ventas_total();
	                     break;
	             case 6:
	            	     JOptionPane.showMessageDialog(null, "SALIENDO DEL PROGRAMA...");
	            	     break;
	             default:
	                     JOptionPane.showMessageDialog(null, "INGRESE UNA OPCION VALIDA");                  
	            }
	    	}
	    }while(op!=6);

	}

}
