package ar.edu.unlam.BenitezNelsonDarioP2PB2;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Partido {

	String Equipo1;
	String Equipo2;
	
	TreeSet<Gol> goles;
	
	List<Jugador> jugadores;

	public Partido(String equipo1, String equipo2) {
		Equipo1 = equipo1;
		Equipo2 = equipo2;
		this.jugadores = new ArrayList<Jugador>();
		this.goles = new TreeSet<Gol>();
		
	}
	
	public void agregarJugador(Jugador jugador)
	{
		jugadores.add(jugador);
	}
	
	public void agregarGol(Gol gol)
	{
		
		this.goles.add(gol);
		
	}
	
	
	public Integer getCantidadJugadoresDelEquipo(String equipo)
	{
		Integer cantJugadores = 0;
		
    	for (Jugador jugador: jugadores) {
    		if (jugador.getEquipo() == equipo)
			{
				cantJugadores++;
			}
    	}
    	return cantJugadores;
	}
	
	public Integer getCantidadGoles()
	{
		return this.goles.size();
		
	}	
		
	public TreeSet<Gol> getGoles()
	{
		return this.goles;
		
	}	
}	

