package epicode.JAVASPRINGWEEK5DAY4.entities.toppings;

import epicode.JAVASPRINGWEEK5DAY4.entities.Consummation;
import jakarta.persistence.Entity;

@Entity
public class OnionTopping extends ToppingDecorator {
	public OnionTopping() {
		super();
		this.name = "Cipolla";
		this.price = 1.00;
		this.calories = 100;
	}

	public OnionTopping(Consummation c) {
		super(c);
		this.name = "Cipolla";
		this.price = 1.00;
		this.calories = 100;
	}
}
