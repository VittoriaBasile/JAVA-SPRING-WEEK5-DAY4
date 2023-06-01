package epicode.JAVASPRINGWEEK5DAY4.entities.merchandise;

import epicode.JAVASPRINGWEEK5DAY4.entities.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Gadget extends Product {
	String type;
}
