package ar.edu.unlam.BenitezNelsonDarioP2PB2;

public class Jugador extends Persona implements ITipo{
	
	String equipo;
	String posicion;
	Integer camiseta;
	
	public Jugador(String dNI, String nombre, String equipo, String posicion, Integer camiseta) {
	
		super(dNI, nombre);
		
		this.equipo = equipo;
		this.posicion=posicion;
		this.camiseta = camiseta;
	
	}


	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public Integer getCamiseta() {
		return camiseta;
	}

	public void setCamiseta(Integer camiseta) {
		this.camiseta = camiseta;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Jugador";
	}


	@Override
	public String getEquipo() {
		// TODO Auto-generated method stub
		return this.equipo;
	}


	@Override
	public void setEquipo(String Equipo) {
		this.equipo=Equipo;
	}

	
}
