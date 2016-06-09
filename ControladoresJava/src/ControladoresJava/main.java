package ControladoresJava;

public class main {

	public static void main(String[] args) {
		
		Manzana item1 = new Manzana(2);
		Manzana item2 = new Manzana("001");
		Manzana item3 = new Manzana("002",3);
		Manzana item4 = new Manzana("003",2,"verde");
		
		/*item1.color = "verde";
		item2.color = "roja";
		
		item1.setCodigo("001");
		item2.setCodigo("002");
		
		item1.setTamanio(2);
		item2.setTamanio(3);*/
		
		item1.show_inf();
		item2.show_inf();
		item3.show_inf();
		item3.show_inf();
	}

}
