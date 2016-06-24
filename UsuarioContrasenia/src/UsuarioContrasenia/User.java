package UsuarioContrasenia;
import javax.swing.JOptionPane;
import java.util.Random;
public class User implements Atributos{
	String a[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	String b[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	String c[]={"0","1","2","3","4","5","6","7","8","9"};
	String email;
	String contrasena[]= new String [9];
	Random aux = new Random(); 
	
	User usuario [] = new User[4];
	int contUser = 0;
	
	public User(){
		
    }
	
	public User(String email){
		this.email = email;
    }
	
	@Override
	public void setEmail(String email) {
		this.email = email;		
	}

	@Override
	public String getEmail() {
		return this.email;
	}


	@Override
	public void getGenerar_pasword() {
		int aux2;
		for(int i =0; i<9 ; i++){
			aux2= aux.nextInt(3)+1;
			if(aux2==1){
				contrasena[i]=a[aux.nextInt(a.length)+0];
			}
			if(aux2==2){
				contrasena[i]=b[aux.nextInt(b.length)+0];
			}
			if(aux2==3){
				contrasena[i]=c[aux.nextInt(c.length)+0];
			}
			aux2=0;
		}
		for(int i =0; i<9 ; i++){
			System.out.print(contrasena[i]);
		}
		
		if(b.length == 2 && a.length == 2 && c.length == 5){
			System.out.print("           LA CONTRASENIA ES SEGURA!");
     }
		else{
			System.out.print("           LA CONTRASENIA ES DEBIL!");
      }
	}
	
	public void ingresar(){
		setEmail(JOptionPane.showInputDialog(null, "INGRESE EL CORREO: "));
        
        User temp = new User(getEmail());
 
        temp.setEmail(getEmail());
        
		usuario[contUser] = temp;
        contUser++;
	}
	
	
	
	void informacion(){
		for(int i=0; i<contUser; i++){
			System.out.println("NUMERO              CORREO                     CONTRASENIA         TIPO DE CONTRASENA");
			System.out.print(("  "+(i+1))+"           "+getEmail()+"           "); getGenerar_pasword();System.out.println();
			System.out.print("EL CORREO QUE INGRESO ES: "+verificaCorreo()); 
		}
	}
	
	public boolean verificaCorreo(){
		boolean real = false;		
		char valor;
		for(char i = 0; i < email.length(); i++){
			valor = email.charAt(i);
	        if(valor == '@' && i == 0){
	        	real = false;
	        	break;
	        }
	    	if(valor == '@'){
	    		real = true;
	    		break;
	    	}
	    	else if(i == email.length()-1){
	    		real = false;
	    		break;
	    	}
	     }
		return real;
	}
	
}
