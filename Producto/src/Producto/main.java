package Producto;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		String ax;
	    int op=0;
	    
	    Producto[] objeto = new Producto[6];
		
		objeto[0] = new ProductoFresco("LECHE NUTRI", "12", "06", "2016", "0001");
		objeto[1] = new ProductoFresco("LENTEJA", "22", "05", "2017", "0002");
		objeto[2] = new ProductoRefrigerado("QUESO MOZZARELLA", "08", "02", "2016", "0003");
		objeto[3] = new ProductoRefrigerado("YOGURT TONI", "15", "09", "2018", "0004");
		objeto[4] = new ProductoCongelado("MIXTO DE VEGETALES", "29", "11", "2016", "0005");
		objeto[5] = new ProductoCongelado("PULPA DE FRUTA", "17", "10", "2017", "0006");
		
		objeto[0].setFechaenvasado("12/06/2014");
		objeto[0].setPaisorigen("Ecuador");
		
		objeto[1].setFechaenvasado("22/05/2015");
		objeto[1].setPaisorigen("Ecuador");
		
		objeto[2].setCodigosupervision("CS 2203");
		objeto[3].setCodigosupervision("CS 2204");
		
		objeto[4].setTemperaturacongelacion("27° C");
		objeto[5].setTemperaturacongelacion("28° C");
		
		do{
	    	ax = JOptionPane.showInputDialog(null,"1: MOSTRAR TODOS LOS PRODUCTOS"
	    			                        +"\n2: VER PRODUCTOS QUE CADUCAN EN EL 2016"
	    			                        +"\n3: BUSCAR PRODUCTO POR NUMERO DE LOTE"
	    			                        +"\n4: SALIR");
	    	if(ax!=null && !ax.equals("")){
	    		op = Integer.parseInt(ax);
	    		
	    		switch(op){
	    		 case 1:
	    				 System.out.println("=================================================================================================================================================");
	    				 for(int i=0; i<objeto.length; i++){
	    				    	//objeto[i].showDim();
	    				    	objeto[i].showInf();
	    				    }
	                     break;
	             case 2:
	            	     System.out.println("=================================================================================================================================================");
	            	     for(int i=0; i<objeto.length; i++){
	    				    	objeto[i].caducan();
	    				    }
	                     break;
	             case 3:
	            	     System.out.println("================================================================================================================================================");
	            	     boolean bandera = false;
     			         String numlot = JOptionPane.showInputDialog("INGRESE NUMERO DE LOTE:");
     			         for(int i=0; i<objeto.length; i++){
     			        	 if(numlot.equals(objeto[i].getNumerolote())){
     			        		 objeto[i].showInf();
     			        		 bandera = true;
     			        	}
     			        }
     			         if(!bandera)
     			        	 JOptionPane.showMessageDialog(null, "NO EXISTE EL PRODUCTO");
	                     break;
	             case 4:
	            	     JOptionPane.showMessageDialog(null, "SALIENDO DEL PROGRAMA...");
	                     break;
	             default:
	                     JOptionPane.showMessageDialog(null, "INGRESE UNA OPCION VALIDA");                  
	            }
	    	}
	    }while(op!=4);
		
		
	}

}
