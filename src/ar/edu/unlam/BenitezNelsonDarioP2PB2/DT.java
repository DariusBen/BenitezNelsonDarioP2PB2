package ar.edu.unlam.BenitezNelsonDarioP2PB2;

public class DT extends Persona implements ITipo {

	Integer edad;
	String equipo;
	
	public DT(String dNI, String nombre, Integer edad, String equipo) {
		
		super(dNI, nombre);
		// TODO Auto-generated constructor stub
		this.edad = edad;
		this.equipo = equipo;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "DT";
	}

	@Override
	public String getEquipo() {
		// TODO Auto-generated method stub
		return this.equipo;
	}

	@Override
	public void setEquipo(String Equipo) {
		// TODO Auto-generated method stub
		this.equipo = Equipo;
	}

}
