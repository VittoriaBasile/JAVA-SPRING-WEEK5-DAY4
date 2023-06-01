package epicode.JAVASPRINGWEEK5DAY4.entities.toppings;

import epicode.JAVASPRINGWEEK5DAY4.entities.Consummation;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class HamTopping extends ToppingDecorator {
	public HamTopping() {
		super();
		this.name = "Prosciutto";
		this.price = 2.00;
		this.calories = 200;
	}

	public HamTopping(Consummation c) {
		super(c);
		this.name = "Prosciutto";
		this.price = 2.00;
		this.calories = 200;
	}
}
