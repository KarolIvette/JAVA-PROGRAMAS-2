package UsuarioContrasenia;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		User cad = new User();	
		
		cad.ingresar();
		cad.informacion();
		cad.verificaCorreo();
	}

}
