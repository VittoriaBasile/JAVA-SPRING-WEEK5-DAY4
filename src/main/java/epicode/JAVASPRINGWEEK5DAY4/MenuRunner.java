package epicode.JAVASPRINGWEEK5DAY4;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import epicode.JAVASPRINGWEEK5DAY4.dao.PizzeService;
import epicode.JAVASPRINGWEEK5DAY4.dao.ToppingsService;
import epicode.JAVASPRINGWEEK5DAY4.entities.pizzas.Pizza;
import epicode.JAVASPRINGWEEK5DAY4.entities.toppings.HamTopping;
import epicode.JAVASPRINGWEEK5DAY4.exception.ItemNotFoundException;

@Component
public class MenuRunner implements CommandLineRunner {
	@Autowired
	PizzeService pizzaService;
	@Autowired
	ToppingsService toppingService;

	@Override
	public void run(String... args) throws Exception {
		Pizza pizza1 = new Pizza();

		pizzaService.create(pizza1);

		try {
			System.out.println(pizzaService.findById(UUID.fromString("4dda26ef-1a85-4c70-9e52-4d5b7472eba9")));

		} catch (ItemNotFoundException e) {
			System.out.println(e);
		}
		HamTopping decorazione1 = new HamTopping(pizza1);
		toppingService.create(decorazione1);
		System.out.println(decorazione1.getName());
		pizzaService.saveDecoratedPizza(decorazione1);

	}

}
