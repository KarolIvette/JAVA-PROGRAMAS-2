package ObjetoEstudiante;

import javax.swing.JOptionPane;

public class Informacion {
	private String matricula;
	private String nombres;
	private String materia;
	private double nota_parciales;
	private double nota_examen;

	public Informacion(String matricula, String nombres, String materia, double nota_parciales, double nota_examen) {
		this.matricula = matricula;
    	this.nombres = nombres;
    	this.materia = materia;
    	this.nota_parciales = nota_parciales;
    	this.nota_examen = nota_examen;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public double getNota_parciales() {
		return nota_parciales;
	}

	public void setNota_parciales(float nota_parciales) {
		this.nota_parciales = nota_parciales;
	}

	public double getNota_examen() {
		return nota_examen;
	}

	public void setNota_examen(float nota_examen) {
		this.nota_examen = nota_examen;
	}
	
	public void show_inf(){
		System.out.println("MATRICULA->"+this.matricula+" | NOMRES->"+this.nombres+" | MATERIA->"+this.materia+" | NOTA PARCIALES->"+String.valueOf(nota_parciales)+" | NOTA EXAMEN->"+String.valueOf(nota_examen));
	}
}
