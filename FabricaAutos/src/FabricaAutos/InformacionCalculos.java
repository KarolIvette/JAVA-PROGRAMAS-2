package FabricaAutos;

import javax.swing.JOptionPane;

public class InformacionCalculos extends CentrosDV{
	
	public InformacionCalculos(){
		
    }
	
	public InformacionCalculos(String modelo_auto, String punto_venta, int precio_auto){
		super(modelo_auto, punto_venta, precio_auto);
    }
	
	public void ingresar(){
        setModelo_auto(JOptionPane.showInputDialog(null, "INGRESE EL MODELO DEL AUTOMOVIL: "));
        setPunto_venta(JOptionPane.showInputDialog(null, "INGRESE EL CENTRO DE VENTA DEL AUTOMOVIL: "));
        setPrecio_auto(Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL PRECIO DE VENTA DEL AUTOMOVIL: ")));
        
        CentrosDV temp = new CentrosDV(getModelo_auto(), getPunto_venta(), getPrecio_auto());
 
        temp.setModelo_auto(getModelo_auto());
        temp.setPunto_venta(getPunto_venta());  
        temp.setPrecio_auto(getPrecio_auto());
        
		usuario[contUser] = temp;
        contUser++;
	}
	
	public void mostrar(){
		String ay="";
		
        for(int i=0; i<contUser; i++){
			ay+="MODELO DE AUTO: "+usuario[i].getModelo_auto()+" || "
        	  +"PRECIO DEL AUTOMOVIL: "+usuario[i].getPrecio_auto()+" || "
              +"CENTRO DE DISTRIBUCION Y VENTA: "+usuario[i].getPunto_venta()+"\n";
        }
        System.out.println(ay);
    }
	
	public void ventas_total(){
		int vt = 0;	
		int vc1 = 0, vc2 = 0, vc3 = 0, vc4 = 0;
		int vm1 = 0, vm2 = 0, vm3 = 0, vm4 = 0;
		int v1m1 = 0, v1m2 = 0, v1m3 = 0, v1m4 = 0;
		int v2m1 = 0, v2m2 = 0, v2m3 = 0, v2m4 = 0;
		int v3m1 = 0, v3m2 = 0, v3m3 = 0, v3m4 = 0;
		
		for(int i=0; i<contUser; i++){
			vt=1+i;
        }
		System.out.println("VOLUMEN DE VENTAS TOTAL: "+(vt));
		System.out.println("===================================================");
		
		for(int i=0; i<contUser; i++){
			if(usuario[i].getPunto_venta().equals("HYUNDAI MOTORS")){
				vc1++;
				if(usuario[i].getModelo_auto().equals("i30")){
					vm1++;
				}
				if(usuario[i].getModelo_auto().equals("RIO")){
					vm2++;
				}
				if(usuario[i].getModelo_auto().equals("FOCUS")){
					vm3++;
				}
				if(usuario[i].getModelo_auto().equals("CX-5")){
					vm4++;
				}
			}
			if(usuario[i].getModelo_auto().equals("KIA MOTORS")){
				vc2++;
				if(usuario[i].getModelo_auto().equals("i30")){
					v1m1++;
				}
				if(usuario[i].getModelo_auto().equals("RIO")){
					v1m2++;
				}
				if(usuario[i].getModelo_auto().equals("FOCUS")){
					v1m3++;
				}
				if(usuario[i].getModelo_auto().equals("CX-5")){
					v1m4++;
				}
			}
			if(usuario[i].getPunto_venta().equals("FORD MOTORS")){
				vc3++;
				if(usuario[i].getModelo_auto().equals("i30")){
					v2m1++;
				}
				if(usuario[i].getModelo_auto().equals("RIO")){
					v2m2++;
				}
				if(usuario[i].getModelo_auto().equals("FOCUS")){
					v2m3++;
				}
				if(usuario[i].getModelo_auto().equals("CX-5")){
					v2m4++;
				}
			}
			if(usuario[i].getPunto_venta().equals("MAZDA MOTORS")){
				vc4++;
				if(usuario[i].getModelo_auto().equals("i30")){
					v3m1++;
				}
				if(usuario[i].getModelo_auto().equals("RIO")){
					v3m2++;
				}
				if(usuario[i].getModelo_auto().equals("FOCUS")){
					v3m3++;
				}
				if(usuario[i].getModelo_auto().equals("CX-5")){
					v3m4++;
				}
			}
		}	
		
		System.out.println("VOLUMEN DE VENTAS HYUNDAI MOTORS: "+(vc1));
		System.out.println("VOLUMEN DE VENTAS KIA MOTORS: "+(vc2));
		System.out.println("VOLUMEN DE VENTAS FORD MOTORS: "+(vc3));
		System.out.println("VOLUMEN DE VENTAS MAZDA MOTORS: "+(vc4));
		System.out.println("===================================================");
		System.out.println("VOLUMEN DE VENTAS CENTRO HYUNDAI MOTORS MODELO i30: "+((vm1*100)/vt));
		System.out.println("VOLUMEN DE VENTAS CENTRO HYUNDAI MOTORS MODELO RIO: "+((vm2*100)/vt));
		System.out.println("VOLUMEN DE VENTAS CENTRO HYUNDAI MOTORS MODELO FOCUS: "+((vm3*100)/vt));
		System.out.println("VOLUMEN DE VENTAS CENTRO HYUNDAI MOTORS MODELO CX-5: "+((vm4*100)/vt));
		System.out.println("===================================================");
		System.out.println("VOLUMEN DE VENTAS CENTRO HYUNDAI MOTORS MODELO i30: "+((v1m1*100)/vt));
		System.out.println("VOLUMEN DE VENTAS CENTRO HYUNDAI MOTORS MODELO RIO: "+((v1m2*100)/vt));
		System.out.println("VOLUMEN DE VENTAS CENTRO HYUNDAI MOTORS MODELO FOCUS: "+((v1m3*100)/vt));
		System.out.println("VOLUMEN DE VENTAS CENTRO HYUNDAI MOTORS MODELO CX-5: "+((v1m4*100)/vt));
		System.out.println("===================================================");
		System.out.println("VOLUMEN DE VENTAS CENTRO HYUNDAI MOTORS MODELO i30: "+((v2m1*100)/vt));
		System.out.println("VOLUMEN DE VENTAS CENTRO HYUNDAI MOTORS MODELO RIO: "+((v2m2*100)/vt));
		System.out.println("VOLUMEN DE VENTAS CENTRO HYUNDAI MOTORS MODELO FOCUS: "+((v2m3*100)/vt));
		System.out.println("VOLUMEN DE VENTAS CENTRO HYUNDAI MOTORS MODELO CX-5: "+((v2m4*100)/vt));
		System.out.println("===================================================");
		System.out.println("VOLUMEN DE VENTAS CENTRO HYUNDAI MOTORS MODELO i30: "+((v3m1*100)/vt));
		System.out.println("VOLUMEN DE VENTAS CENTRO HYUNDAI MOTORS MODELO RIO: "+((v3m2*100)/vt));
		System.out.println("VOLUMEN DE VENTAS CENTRO HYUNDAI MOTORS MODELO FOCUS: "+((v3m3*100)/vt));
		System.out.println("VOLUMEN DE VENTAS CENTRO HYUNDAI MOTORS MODELO CX-5: "+((v3m4*100)/vt));
	}
		
}
