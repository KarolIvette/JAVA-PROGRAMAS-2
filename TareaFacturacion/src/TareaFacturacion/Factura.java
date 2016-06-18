package TareaFacturacion;

import javax.swing.JOptionPane;

public class Factura {
	
	private String nombre_producto;
	private float costo_producto;
	private int cantidad_producto;
	
	Factura usuario [] = new Factura[99];
	int contUser = 0;
	
	public Factura(){
		
    }
	
	public Factura(String nombre_producto, float costo_producto, int cantidad_producto){
		this.nombre_producto = nombre_producto;
    	this.costo_producto = costo_producto;
    	this.cantidad_producto = cantidad_producto;
    }

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public float getCosto_producto() {
		return costo_producto;
	}

	public void setCosto_producto(float costo_producto) {
		this.costo_producto = costo_producto;
	}

	public int getCantidad_producto() {
		return cantidad_producto;
	}

	public void setCantidad_producto(int cantidad_producto) {
		this.cantidad_producto = cantidad_producto;
	}
	
	
	public void ingresar(){
        nombre_producto = JOptionPane.showInputDialog(null, "INGRESE EL NOMBRE DEL PRODUCTO: ");
        costo_producto = Float.parseFloat(JOptionPane.showInputDialog(null, "INGRESE EL COSTO DEL PRODUCTO: "));
        cantidad_producto = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE LA CANTIDAD DEL PRODUCTO: "));
        
        Factura temp = new Factura(nombre_producto, costo_producto, cantidad_producto);
 
        temp.setNombre_producto(nombre_producto);
        temp.setCosto_producto(costo_producto);
        temp.setCantidad_producto(cantidad_producto);    
        
		usuario[contUser] = temp;
        contUser++;
    }

	public void mostrar(){
		String ay="";
 
        for(int i=0; i<contUser; i++){
        	ay+="NOMBRE DEL PRODUCTO: "+usuario[i].getNombre_producto()+" || "
              + "COSTO DEL PRODUCTO: "+usuario[i].getCosto_producto()+" || "
              + "CANTIDAD DEL PRODUCTO: "+usuario[i].getCantidad_producto()+" || "
              + "SUBTOTAL: "+usuario[i].costo_producto * usuario[i].cantidad_producto+"\n";
        }
        System.out.println(ay);
    }
	
	public void subtotal(){
		int i = Integer.parseInt(JOptionPane.showInputDialog("SE ENCUENTRA EN CIUDAD AFECTADA POR EL TERREMOTO (1 -> SI )/(2 -> NO )"));
		if(i==1){
			float subt = getCosto_producto() * getCantidad_producto();
			float iva = subt * ((float) (0.12));
			float total = subt+iva;
			JOptionPane.showMessageDialog(null, "SUBTOTAL: " +subt+" || IVA 12%: "+iva+" || TOTAL: "+total);
		}
		else{
			float subt = getCosto_producto() * getCantidad_producto();
			float iva = subt * ((float) (0.14));
			float total = subt+iva;
			JOptionPane.showMessageDialog(null, "SUBTOTAL: " +subt+" || IVA 14%: "+iva+" || TOTAL: "+total);
		}
	}
	
	public void limpiar(){
		for (int i = 0; i <= contUser; i++)
			usuario[i] = null;
		System.out.println("FACTURA LIMPIADA CON EXITO");
	}
	
}
