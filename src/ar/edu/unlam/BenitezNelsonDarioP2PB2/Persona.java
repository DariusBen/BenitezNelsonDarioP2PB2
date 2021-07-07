package ar.edu.unlam.BenitezNelsonDarioP2PB2;

public abstract class Persona {
	
	private String DNI;
	private String Nombre;
	
	public Persona(String dNI, String nombre) {
		DNI = dNI;
		Nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

}
