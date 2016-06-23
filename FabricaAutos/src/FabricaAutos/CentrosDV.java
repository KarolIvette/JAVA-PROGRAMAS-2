package FabricaAutos;

public class CentrosDV {
	
	private String modelo_auto;
	private String punto_venta;
	private int precio_auto;
	
	CentrosDV usuario [] = new CentrosDV[99];
	int contUser = 0;
	
	public CentrosDV(){
		
    }
	
	public CentrosDV(String modelo_auto, String punto_venta, int precio_auto){
		this.modelo_auto = modelo_auto;
    	this.punto_venta = punto_venta;
    	this.precio_auto = precio_auto;
    }
	
	public CentrosDV(int contUser){
		this.contUser = contUser;
    }
	
	public String getModelo_auto() {
		return modelo_auto;
	}

	public void setModelo_auto(String modelo_auto) {
		this.modelo_auto = modelo_auto;
	}

	public String getPunto_venta() {
		return punto_venta;
	}	
	
	public void setPunto_venta(String punto_venta) {
		this.punto_venta = punto_venta;
	}
	
	public int getPrecio_auto() {
		return precio_auto;
	}

	public void setPrecio_auto(int precio_auto) {
		this.precio_auto = precio_auto;
	}

	public void modelos(){
		System.out.println("MODELO #1: i30 -> PRECIO DE VENTA: $ 1O.000"
	                      +"\nMODELOS #2: RIO -> PRECIO DE VENTA: $ 12.500"
				          +"\nMODELO #3: FOCUS -> PRECIO DE VENTA: $ 15.600"
                          +"\nMODELO #4: CX-5 -> PRECIO DE VENTA: $ 18.200");
	}
	
	public void centros_distribucion(){
		System.out.println("HYUNDAI MOTORS CENTRO DE DISTRIBUCION  Y VENTA"
	                      +"\nKIA MOTORS CENTRO DE DISTRIBUCION  Y VENTA"
				          +"\nFORD MOTORS CENTRO DE DISTRIBUCION  Y VENTA"
                          +"\nMAZDA MOTORS CENTRO DE DISTRIBUCION  Y VENTA");
	}
	
}
