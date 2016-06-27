package Producto;

public class ProductoCongelado extends Producto {
	
	private String temperaturacongelacion;
	
	public ProductoCongelado(){
				
	}
	
	public ProductoCongelado(String nombreproducto, String dia, String mes, String anio, String numerolote){
		super.setNombreproducto(nombreproducto);
		super.setDia(dia);
		super.setMes(mes);
		super.setAnio(anio);
		super.setNumerolote(numerolote);
	}

	public String getTemperaturacongelacion() {
		return temperaturacongelacion;
	}

	public void setTemperaturacongelacion(String temperaturacongelacion) {
		this.temperaturacongelacion = temperaturacongelacion;
	}

	public void showInf(){
		System.out.println("PRODUCTO -> "+getNombreproducto()+" || FECHA DE CADUCIDAD -> "+getDia()
		                  +"/"+getMes()+"/"+getAnio()
		                  +" || NUMERO DE LOTE -> "+getNumerolote()
		                  +" || TEMPERATURA DE CONGELACION RECOMENDADA -> "+temperaturacongelacion);
	}
	
	public void caducan(){
		if(getAnio()=="2016"){
		System.out.println("PRODUCTO -> "+getNombreproducto()+" || FECHA DE CADUCIDAD -> "+getDia()
		                  +"/"+getMes()+"/"+getAnio()
		                  +" || NUMERO DE LOTE -> "+getNumerolote()
		                  +" || TEMPERATURA DE CONGELACION RECOMENDADA -> "+temperaturacongelacion);
		}
	}

}
