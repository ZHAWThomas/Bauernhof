package aufgabe.bauernhof;

public class Kuh implements Tier{
	
	private String name;
	private int gewicht;
	
	public Kuh(String name, int gewicht){
		this.name = name;
		this.gewicht = gewicht;
	}
	
	public String getName() {
		return name;
	}
	
	public int getGewicht() {
		return gewicht;
	}

	@Override
	public void gibLaut() {
		System.out.println("muuhh");

	}
	
}
