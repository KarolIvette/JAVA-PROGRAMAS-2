package Guia_Varargs;

public class Varargs {
	
	public Varargs(){
	}
	
	public void view_args(int ... a){
		int acum = 0;
		System.out.println("NUMERO DE ARGUMENTOS-> "+a.length);
		for(int i=0; i<a.length; i++){
			acum += a[i];
		}
		System.out.println("LA SUMA ES-> "+acum);
	}
	

}
