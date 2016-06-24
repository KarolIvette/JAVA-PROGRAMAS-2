package Guia_Interfaz;

public class Estudiante implements Persona{
	
	int anio_nacimiento;
	String nombres;
	int anio_actual = 2016;
	
	@Override
	public int calcular_edad(int anio_nacimiento, int anio_actual) {
		return anio_actual - anio_nacimiento;
	}

	@Override
	public void setAnioNacimiento(int anio) {
		this.anio_nacimiento = anio;
		
	}

	@Override
	public int getAnio_nacimiento() {
		return this.anio_nacimiento;
	}

	@Override
	public void setNombre(String nombres) {
		this.nombres = nombres;
	}

	@Override
	public String getNombres() {
		return this.nombres;
	}
	
}
