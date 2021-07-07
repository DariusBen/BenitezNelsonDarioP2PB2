package ar.edu.unlam.BenitezNelsonDarioP2PB2;

import static org.junit.Assert.*;
import org.junit.Test;


public class pruebaParcial2 {
	
	@Test
	public void poderCrearUnJugador() {
		
		Jugador Dario = new Jugador("27308397", "Dario",  "River", "DEF", 4);
		
		
		assertEquals((Integer)4, Dario.getCamiseta());
	}
	
	@Test
	public void queSePuedaCrearUnTorneoYSeSumenMiembros() {	
	
		Torneo miTorneo = new Torneo("Mi Bonito Torneo");
		
		miTorneo.agregarMiembro(new Jugador("27308397", "Dario", "River", "DEF", 4));
		miTorneo.agregarMiembro(new Jugador("2808397", "Juan", "River", "DEF", 2));
		miTorneo.agregarMiembro(new Jugador("29308397", "Claudio", "River", "MED", 5));
		miTorneo.agregarMiembro(new Jugador("30308397", "Javier", "River", "MED", 6));
		miTorneo.agregarMiembro(new Jugador("31308397", "Javier", "River", "DEL", 7));
		miTorneo.agregarMiembro(new Jugador("32308397", "Sebas", "River", "ARQ", 1));
		miTorneo.agregarMiembro(new DT("25308397", "Gallardo", 50, "River"));

		miTorneo.agregarMiembro(new Jugador("33308397", "Pedro",  "Boca", "DEF", 4));
		miTorneo.agregarMiembro(new Jugador("34308397", "Manuel", "Boca", "DEF", 2));
		miTorneo.agregarMiembro(new Jugador("35308397", "Homero", "Boca", "MED", 5));
		miTorneo.agregarMiembro(new Jugador("36308397", "Luke", "Boca", "MED", 6));
		miTorneo.agregarMiembro(new Jugador("37308397", "Pepito", "Boca", "DEL", 7));
		miTorneo.agregarMiembro(new Jugador("38308397", "Leia", "Boca", "ARQ", 1));
		miTorneo.agregarMiembro(new DT("18308397", "Palermo", 50, "Boca"));
		
		assertEquals((Integer) 14, miTorneo.cantidadDeMiembros());

	}
	
	@Test
	public void  queSePuedaCrearUnPartidoEnElTorneo() {
	
		Torneo miTorneo = new Torneo("Mi Bonito Torneo");
		
		miTorneo.crearPartido(1,"River","Boca");
		
				
		assertEquals((Integer) 1, miTorneo.cantidadDePartidos());
	}

	@Test
	public void  queSePuedaAgregarJugadoresAUnPartido() {
		Torneo miTorneo = new Torneo("Mi Bonito Torneo");
		
		miTorneo.crearPartido(1, "Boca", "River");
		
		miTorneo.getPartido(1).agregarJugador(new Jugador("27308397", "Dario", "River", "DEF", 4));
		miTorneo.getPartido(1).agregarJugador(new Jugador("2808397", "Juan", "River", "DEF", 2));
		miTorneo.getPartido(1).agregarJugador(new Jugador("29308397", "Claudio", "River", "MED", 5));
		miTorneo.getPartido(1).agregarJugador(new Jugador("30308397", "Javier", "River", "MED", 6));
		miTorneo.getPartido(1).agregarJugador(new Jugador("31308397", "Javier", "River", "DEL", 7));
		miTorneo.getPartido(1).agregarJugador(new Jugador("32308397", "Sebas", "River", "ARQ", 1));

		miTorneo.getPartido(1).agregarJugador(new Jugador("33308397", "Pedro",  "Boca", "DEF", 4));
		miTorneo.getPartido(1).agregarJugador(new Jugador("34308397", "Manuel", "Boca", "DEF", 2));
		miTorneo.getPartido(1).agregarJugador(new Jugador("35308397", "Homero", "Boca", "MED", 5));
		miTorneo.getPartido(1).agregarJugador(new Jugador("36308397", "Luke", "Boca", "MED", 6));
		miTorneo.getPartido(1).agregarJugador(new Jugador("37308397", "Pepito", "Boca", "DEL", 7));
		miTorneo.getPartido(1).agregarJugador(new Jugador("38308397", "Leia", "Boca", "ARQ", 1));
		
		
		assertEquals((Integer) 6, miTorneo.getPartido(1).getCantidadJugadoresDelEquipo("Boca"));
		
	}
	
	@Test
	public void  queSePuedaRegistrarUnGolEnElMinutoVeinticinco() {
		
		Torneo miTorneo = new Torneo("Mi Bonito Torneo");
		
		miTorneo.crearPartido(1, "Boca", "River");
		
		miTorneo.getPartido(1).agregarJugador(new Jugador("27308397", "Dario", "River", "DEF", 4));
		miTorneo.getPartido(1).agregarJugador(new Jugador("2808397", "Juan", "River", "DEF", 2));
		miTorneo.getPartido(1).agregarJugador(new Jugador("29308397", "Claudio", "River", "MED", 5));
		miTorneo.getPartido(1).agregarJugador(new Jugador("30308397", "Javier", "River", "MED", 6));
		miTorneo.getPartido(1).agregarJugador(new Jugador("31308397", "Javier", "River", "DEL", 7));
		miTorneo.getPartido(1).agregarJugador(new Jugador("32308397", "Sebas", "River", "ARQ", 1));

		miTorneo.getPartido(1).agregarJugador(new Jugador("33308397", "Pedro",  "Boca", "DEF", 4));
		miTorneo.getPartido(1).agregarJugador(new Jugador("34308397", "Manuel", "Boca", "DEF", 2));
		miTorneo.getPartido(1).agregarJugador(new Jugador("35308397", "Homero", "Boca", "MED", 5));
		miTorneo.getPartido(1).agregarJugador(new Jugador("36308397", "Luke", "Boca", "MED", 6));
		miTorneo.getPartido(1).agregarJugador(new Jugador("37308397", "Pepito", "Boca", "DEL", 7));
		miTorneo.getPartido(1).agregarJugador(new Jugador("38308397", "Leia", "Boca", "ARQ", 1));
		

		miTorneo.getPartido(1).agregarGol(new Gol("River",4, 25));
		
		assertEquals((Integer) 1, miTorneo.getPartido(1).getCantidadGoles());
	}
	
	
	@Test
	public void  queSePuedanObtenerLosGolesOrdenadosPorMinuto() {
		
		Torneo miTorneo = new Torneo("Mi Bonito Torneo");
		
		miTorneo.crearPartido(1, "Boca", "River");
		
		miTorneo.getPartido(1).agregarJugador(new Jugador("27308397", "Dario", "River", "DEF", 4));
		miTorneo.getPartido(1).agregarJugador(new Jugador("2808397", "Juan", "River", "DEF", 2));
		miTorneo.getPartido(1).agregarJugador(new Jugador("29308397", "Claudio", "River", "MED", 5));
		miTorneo.getPartido(1).agregarJugador(new Jugador("30308397", "Javier", "River", "MED", 6));
		miTorneo.getPartido(1).agregarJugador(new Jugador("31308397", "Javier", "River", "DEL", 7));
		miTorneo.getPartido(1).agregarJugador(new Jugador("32308397", "Sebas", "River", "ARQ", 1));

		miTorneo.getPartido(1).agregarJugador(new Jugador("33308397", "Pedro",  "Boca", "DEF", 4));
		miTorneo.getPartido(1).agregarJugador(new Jugador("34308397", "Manuel", "Boca", "DEF", 2));
		miTorneo.getPartido(1).agregarJugador(new Jugador("35308397", "Homero", "Boca", "MED", 5));
		miTorneo.getPartido(1).agregarJugador(new Jugador("36308397", "Luke", "Boca", "MED", 6));
		miTorneo.getPartido(1).agregarJugador(new Jugador("37308397", "Pepito", "Boca", "DEL", 7));
		miTorneo.getPartido(1).agregarJugador(new Jugador("38308397", "Leia", "Boca", "ARQ", 1));
		

		miTorneo.getPartido(1).agregarGol(new Gol("River",4, 25));
		miTorneo.getPartido(1).agregarGol(new Gol("River",5, 15));
		miTorneo.getPartido(1).agregarGol(new Gol("River",5, 5));
		
		assertEquals((Integer) 5, miTorneo.getPartido(1).getGoles().first().getMinuto());
		assertEquals((Integer) 25, miTorneo.getPartido(1).getGoles().last().getMinuto());
			
		
	}
	
	
	@Test (expected = JugadorNoEncontradoException.class)
	public void  queseControleElError() throws JugadorNoEncontradoException{	
		Torneo miTorneo = new Torneo("Mi Bonito Torneo");
		
		miTorneo.crearPartido(1, "Boca", "River");
		
		miTorneo.agregarJugadorAPartido(1, new Jugador("27308397", "Dario", "River", "DEF", 4));
		miTorneo.agregarJugadorAPartido(1,new Jugador("2808397", "Juan", "River", "DEF", 2));
		miTorneo.agregarJugadorAPartido(1,new Jugador("29308397", "Claudio", "River", "MED", 5));
		miTorneo.agregarJugadorAPartido(1,new Jugador("30308397", "Javier", "River", "MED", 6));
		miTorneo.agregarJugadorAPartido(1,new Jugador("31308397", "Javier", "River", "DEL", 7));
		miTorneo.agregarJugadorAPartido(1,new Jugador("32308397", "Sebas", "River", "ARQ", 1));

		miTorneo.agregarJugadorAPartido(1,new Jugador("33308397", "Pedro",  "Boca", "DEF", 4));
		miTorneo.agregarJugadorAPartido(1,new Jugador("34308397", "Manuel", "Boca", "DEF", 2));
		miTorneo.agregarJugadorAPartido(1,new Jugador("35308397", "Homero", "Boca", "MED", 5));
		miTorneo.agregarJugadorAPartido(1,new Jugador("36308397", "Luke", "Boca", "MED", 6));
		miTorneo.agregarJugadorAPartido(1,new Jugador("37308397", "Pepito", "Boca", "DEL", 7));
		miTorneo.agregarJugadorAPartido(1,new Jugador("8888888", "Leia", "Boca", "ARQ", 1));
		
		
		assertEquals((Integer) 5, miTorneo.getPartido(1).getCantidadJugadoresDelEquipo("Boca"));	
	}
	}
