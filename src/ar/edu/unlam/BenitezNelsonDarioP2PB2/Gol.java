package ar.edu.unlam.BenitezNelsonDarioP2PB2;

public class Gol implements Comparable<Gol> {

	
	String equipo;
	Integer nroCamiseta;
	Integer minuto;
	
	
	
	public Gol(String equipo, Integer nroCamiseta, Integer minuto) {

		this.equipo = equipo;
		this.nroCamiseta = nroCamiseta;
		this.minuto = minuto;
	}
	
	
	
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public Integer getNroCamiseta() {
		return nroCamiseta;
	}
	public void setNroCamiseta(Integer nroCamiseta) {
		this.nroCamiseta = nroCamiseta;
	}
	public Integer getMinuto() {
		return minuto;
	}
	public void setMinuto(Integer minuto) {
		this.minuto = minuto;
	}
	
	@Override
	public int compareTo(Gol o) {
		return this.getMinuto().compareTo(o.getMinuto());
	}

	
}
