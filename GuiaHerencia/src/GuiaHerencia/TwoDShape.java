package GuiaHerencia;

public class TwoDShape {
	
	private double width;
	private double height;
	int bandera;
	private String nombre;
	
	public TwoDShape(){
		
	}
	
	public TwoDShape(double width, double height, String nombre){
		this.width = width;
		this.height = height;
		this.nombre = nombre;
	}
	
	public TwoDShape(double width){
		this.width = width;
	}
	
	public void showNombre(){
		System.out.println("NOMBRE TwoDShape -> "+this.nombre);
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void showDim(){
		System.out.println("ANCHO -> "+width+" || ALTO -> "+height);
	}
	
}
