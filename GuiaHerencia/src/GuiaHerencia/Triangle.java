package GuiaHerencia;

public class Triangle extends TwoDShape{
	
	String style;
	
	double area(){
		return (width * height) /2 ;
	}
	
	void ShowStyle(){
		System.out.println("EL ESTILO ES -> "+style);
	}
	
}
