package GuiaHerencia;

public class main {

	public static void main(String[] args) {
		
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		t1.width = 4;
		t1.height = 2.5;
		t1.style = "FILLED";
		
		t2.width = 10;
		t2.height = 5;
		t2.style = "OUTLINE";
		
		System.out.println("INFORMACION DEL TRIANGULO 1: ");
		t1.showDim();
		t1.ShowStyle();
		System.out.println("EL AREA ES -> "+t1.area());
		
		System.out.println("============================");
		
		System.out.println("INFORMACION DEL TRIANGULO 2: ");
		t2.showDim();
		t2.ShowStyle();
		System.out.println("EL AREA ES -> "+t2.area());
		
	}

}
