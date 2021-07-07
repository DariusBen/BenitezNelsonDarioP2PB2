package ar.edu.unlam.BenitezNelsonDarioP2PB2;

import java.util.Comparator;

public class OrdenarPorMinuto implements Comparator<Gol> {

	@Override
	public int compare(Gol o1, Gol o2) {
		// TODO Auto-generated method stub
		return o1.getMinuto().compareTo(o2.getMinuto());
	}

}
