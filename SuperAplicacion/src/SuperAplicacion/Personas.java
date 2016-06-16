package SuperAplicacion;

public class Personas {

	private String cedula_identidad;
	private String nombres;
	private String apellidos;
	private String ciudad;
	
	public Personas(){
		
	}
	
	public String getCedula_identidad() {
		return cedula_identidad;
	}

	public void setCedula_identidad(String cedula_identidad) {
		this.cedula_identidad = cedula_identidad;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public void showDim(){
		System.out.println("CEDULA -> "+cedula_identidad+" || NOMBRES -> "+nombres+" || APELLIDOS -> "+apellidos+" || CIUDAD -> "+ciudad);
	}
	
}
