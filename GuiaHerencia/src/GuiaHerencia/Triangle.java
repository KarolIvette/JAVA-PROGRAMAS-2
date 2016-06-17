package GuiaHerencia;

public class Triangle extends TwoDShape{
	
	String style;
	private String nombre;
	
	public Triangle(){
		
	}
	
	public Triangle(String style, double width, double height, String nombreH, String nombreP){
		super(width, height, nombreP);
		this.style = style;
		this.nombre = nombreH;
	}
	
	public void showNombre(){
		super.showNombre();
		System.out.println("NOMBRE Triangle -> "+this.nombre);
	}
	
	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public void SetNombre(String nombre) {
		this.nombre = nombre;
	}

	double area(){
		super.bandera = 0;
		return ((super.getWidth() * super.getHeight()) /2) ;
	}
	
	/*double area(){
		return (width * height) /2 ;
	}*/
	
	void ShowStyle(){
		System.out.println("EL ESTILO ES -> "+style);
	}
	
}
