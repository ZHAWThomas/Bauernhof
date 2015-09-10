package aufgabe.bauernhof;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import aufgabe.bauernhof.KuhComparator.KuhSort;

public class Bauernhof {

	private Set<Tier> stall = new HashSet<Tier>();
	private List<Kuh> kuhstall = new ArrayList<Kuh>();

	public void kuhAusgeben() {
		Collections.sort(kuhstall, new KuhComparator(KuhSort.NAME));
		Collections.sort(kuhstall, new KuhComparator(KuhSort.GEWICHT));
		for (Kuh k : kuhstall) {
			System.out.println(k.getName() + " " + k.getGewicht());
		}
	}

	public void addKuh(Kuh k){
		kuhstall.add(k);
	}
	
	public void addTier(Tier t) {
		stall.add(t);
	}

	public void lautgeben() {
		for (Tier t : stall) {
			t.gibLaut();
		}
	}

}
