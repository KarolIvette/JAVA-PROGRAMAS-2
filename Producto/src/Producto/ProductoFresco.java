package Producto;

public class ProductoFresco extends Producto{
	
	private String fechaenvasado;
	private String paisorigen;
	
	public ProductoFresco(){
				
	}
	
	public ProductoFresco(String nombreproducto, String dia, String mes, String anio, String numerolote){
		super.setNombreproducto(nombreproducto);
		super.setDia(dia);
		super.setMes(mes);
		super.setAnio(anio);
		super.setNumerolote(numerolote);
	}
	
	public String getFechaenvasado() {
		return fechaenvasado;
	}

	public void setFechaenvasado(String fechaenvasado) {
		this.fechaenvasado = fechaenvasado;
	}

	public String getPaisorigen() {
		return paisorigen;
	}

	public void setPaisorigen(String paisorigen) {
		this.paisorigen = paisorigen;
	}

	public void showInf(){
		System.out.println("PRODUCTO -> "+getNombreproducto()+" || FECHA DE CADUCIDAD -> "+getDia()
		                  +"/"+getMes()+"/"+getAnio()
		                  +" || NUMERO DE LOTE -> "+getNumerolote()+" || FECHA ENVASADO -> "+fechaenvasado
		                  +" || PAIS DE ORIGEN -> "+paisorigen);
	}
	
	public void caducan(){
		if(getAnio()=="2016"){
		System.out.println("PRODUCTO -> "+getNombreproducto()+" || FECHA DE CADUCIDAD -> "+getDia()
		                  +"/"+getMes()+"/"+getAnio()
		                  +" || NUMERO DE LOTE -> "+getNumerolote()+" || FECHA ENVASADO -> "+fechaenvasado
		                  +" || PAIS DE ORIGEN -> "+paisorigen);
		}
	}

}
