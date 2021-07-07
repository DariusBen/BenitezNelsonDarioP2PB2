package ar.edu.unlam.BenitezNelsonDarioP2PB2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Torneo {

	List<Persona> miembros;

	HashMap<Integer, Partido> partidos;

	String nombreTorneo;
	
	
	public Torneo(String nombreTorneo) {

		this.nombreTorneo = nombreTorneo;
		this.miembros = new ArrayList<Persona>();
		this.partidos = new HashMap<Integer, Partido>();
	}
	
	
	public void agregarMiembro(Persona miembro)
	{
	
		this.miembros.add(miembro);
		
	}
	

	public void crearPartido(Integer idPartido, String equipo1, String equipo2)
	{
	
		this.partidos.put(idPartido, new Partido(equipo1, equipo2));
		
	}
	
	public Integer cantidadDeMiembros()
	{
		return this.miembros.size();
	}
	
	public Integer cantidadDePartidos()
	{
		return this.partidos.size();
	}
	
	public Partido getPartido(Integer idPartido)
	{
		return this.partidos.get(idPartido);
		
	}
	
	
}
