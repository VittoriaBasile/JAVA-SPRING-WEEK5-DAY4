package epicode.JAVASPRINGWEEK5DAY4.entities;

//import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

//@MappedSuperclass
public abstract class Product {
	protected double price;
	protected String name;
}
