package SuperAplicacion;
import javax.swing.JOptionPane;

public class HijaEstudiante extends Personas{

	private String codigo_matricula;
	private String carrera;
	
	public HijaEstudiante(){
				
	}
	
	public HijaEstudiante(String cedula_identidad, String codigo_matricula){
    	this.setCedula_identidad(cedula_identidad);
    	this.codigo_matricula = codigo_matricula;
	}
    
    public HijaEstudiante(String cedula_identidad, String nombres, String apellidos, String codigo_matricula){
    	this.setCedula_identidad(cedula_identidad);
    	this.setNombres(nombres);
    	this.setApellidos(apellidos);
    	this.codigo_matricula = codigo_matricula;
	}
    
    public HijaEstudiante(String nombres, String apellidos, String carrera){
    	this.setNombres(nombres);
    	this.setApellidos(apellidos);
    	this.carrera = carrera;
	}
    
    public HijaEstudiante(String cedula_identidad, String nombres, String apellidos, String ciudad, String codigo_matricula, String carrera){
    	this.setCedula_identidad(cedula_identidad);
    	this.setNombres(nombres);
    	this.setApellidos(apellidos);
    	this.setCiudad(ciudad);
    	this.codigo_matricula = codigo_matricula;
    	this.carrera = carrera;
	}
	
	public String getCodigo_matricula() {
		return codigo_matricula;
	}

	public void setCodigo_matricula(String codigo_matricula) {
		this.codigo_matricula = codigo_matricula;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	void showInf(){
		System.out.println("CODIGO MATRICULA -> "+codigo_matricula+" || CARRERA -> "+carrera);
	}
	
	void viveEsmeraldas(){
		if(getCiudad()=="ESMERALDAS"){
			JOptionPane.showMessageDialog(null, "CEDULA -> "+getCedula_identidad()+" || NOMBRES -> "+getNombres()+" || APELLIDOS -> "+getApellidos()+" || CIUDAD -> "+getCiudad()+" || CODIGO MATRICULA -> "+codigo_matricula+" || CARRERA -> "+carrera);
		}
	}
	
}
