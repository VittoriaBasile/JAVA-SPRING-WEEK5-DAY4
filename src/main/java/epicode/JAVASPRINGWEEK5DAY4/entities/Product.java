package epicode.JAVASPRINGWEEK5DAY4.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Product {
	protected double price;
	protected String name;
}
