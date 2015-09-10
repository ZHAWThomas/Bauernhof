package aufgabe.bauernhof;

public class BauernhofHuber {

	public static void main(String[] args) {
		Tier katze2 = new Katze();
		Tier kuh = new Kuh("Elsa", 750);
		
		Bauernhof b = new Bauernhof();

		b.addKuh(new Kuh("Elsa", 700));
		b.addKuh(new Kuh("Elsa", 750));
		b.addKuh(new Kuh("Lisa", 750));
		b.addKuh(new Kuh("Anneliese", 800));

		b.kuhAusgeben();

		b.addTier(new Katze());
		b.addTier(kuh);
		b.addTier(new Hund());
		b.addTier(katze2);

		b.lautgeben();
	}
}