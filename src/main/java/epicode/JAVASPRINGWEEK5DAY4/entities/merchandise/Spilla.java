package epicode.JAVASPRINGWEEK5DAY4.entities.merchandise;

public class Spilla extends Gadget {

	public Spilla(String spilla) {
		super(spilla);
		setName("spilla");
		setPrice(3.00);

	}

	@Override
	public String toString() {
		return getName() + ", " + "prezzo: " + getPrice() + "€";
	}
}
