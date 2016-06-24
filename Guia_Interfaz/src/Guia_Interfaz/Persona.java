package Guia_Interfaz;

public interface Persona {
	
	int calcular_edad(int anio_nacimiento, int anio_actual);
	void setAnioNacimiento(int anio);
	int getAnio_nacimiento();
	void setNombre(String nombres);
	String getNombres();
	
}
