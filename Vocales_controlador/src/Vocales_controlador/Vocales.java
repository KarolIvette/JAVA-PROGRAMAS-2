package Vocales_controlador;

public class Vocales {
	private String cadena;
	
	public Vocales(){
		
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public void show_inf(){
		vocales(cadena);
	}
	
	private void vocales(String cadena){
		int contador = 0;
		for(int x=0;x<cadena.length();x++) {
			if ((cadena.charAt(x)=='a') || (cadena.charAt(x)=='e') || (cadena.charAt(x)=='i') || (cadena.charAt(x)=='o') || (cadena.charAt(x)=='u')){
			    contador++;
			 }
		}
		System.out.println("La cadena tiene: "+contador+" vocales");
	}
}
