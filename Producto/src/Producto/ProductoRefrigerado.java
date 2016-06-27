package Producto;

public class ProductoRefrigerado extends Producto{
	
	private String codigosupervision;
	
	public ProductoRefrigerado(){
				
	}
	
	public ProductoRefrigerado(String nombreproducto, String dia, String mes, String anio, String numerolote){
		super.setNombreproducto(nombreproducto);
		super.setDia(dia);
		super.setMes(mes);
		super.setAnio(anio);
		super.setNumerolote(numerolote);
	}

	public String getCodigosupervision() {
		return codigosupervision;
	}

	public void setCodigosupervision(String codigosupervision) {
		this.codigosupervision = codigosupervision;
	}

	public void showInf(){
		System.out.println("PRODUCTO -> "+getNombreproducto()+" || FECHA DE CADUCIDAD -> "+getDia()
		                  +"/"+getMes()+"/"+getAnio()
		                  +" || NUMERO DE LOTE -> "+getNumerolote()
		                  +" || CODIGO DEL ORGANISMO DE LA SUPERVISION ALIMENTARIA -> "+codigosupervision);
	}
	
	public void caducan(){
		if(getAnio()=="2016"){
		System.out.println("PRODUCTO -> "+getNombreproducto()+" || FECHA DE CADUCIDAD -> "+getDia()
		                  +"/"+getMes()+"/"+getAnio()
		                  +" || NUMERO DE LOTE -> "+getNumerolote()
		                  +" || CODIGO DEL ORGANISMO DE LA SUPERVISION ALIMENTARIA -> "+codigosupervision);
		}
	}

}
