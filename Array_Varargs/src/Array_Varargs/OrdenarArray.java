package Array_Varargs;

public class OrdenarArray {
	private String cadena[];
	private int[] arreglo;
	
	public OrdenarArray(String ... a ){
		cadena = a;
	}
	
	public void ascendente(String ... cadena){
		int posMin;
		String aux;

		for(int i=0;i<cadena.length-1;i++){
			posMin=i;
			for(int j=i+1;j<cadena.length;j++){
				if(cadena[posMin].length()>0) posMin=j;
			}
			if(posMin!=i){
				aux=new String(cadena[i]);
				cadena[i]=cadena[posMin];
				cadena[posMin]=aux;
			}
		}
        System.out.println("ARRAY ORDENADO ASCENDENTE: "); 
        for(int i=0; i<cadena.length; i++) {
        	System.out.println(" [" + i + "] = " + cadena[i]);
        }
	}
	
	public void descendente(String ... cadena){
		int posMin;
		String aux;

		for(int i=0;i<cadena.length-1;i++){
			posMin=i;
			for(int j=i+1;j<cadena.length;j++){
				if(cadena[posMin].length()>0) posMin=j;
			}
			if(posMin!=i){
				aux=new String(cadena[i]);
				cadena[i]=cadena[posMin];
				cadena[posMin]=aux;
			}
		}
        System.out.println("ARRAY ORDENADO DESCENDENTE: "); 
        for(int i=cadena.length-1; i>=0; i--) {
        	System.out.println(" [" + i + "] = " + cadena[i]);
        }
	}
}
