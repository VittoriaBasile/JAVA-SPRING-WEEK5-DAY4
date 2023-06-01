package epicode.JAVASPRINGWEEK5DAY4.dao;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import epicode.JAVASPRINGWEEK5DAY4.entities.pizzas.Pizza;
import epicode.JAVASPRINGWEEK5DAY4.entities.toppings.ToppingDecorator;
import epicode.JAVASPRINGWEEK5DAY4.exception.ItemNotFoundException;

@Service
public class PizzeService {
	@Autowired
	private PizzaRepository pizzaRepo;

	public void create(Pizza p) {
		pizzaRepo.save(p);

	}

	public Pizza findById(UUID id) throws ItemNotFoundException {
		return pizzaRepo.findById(id).orElseThrow(() -> new ItemNotFoundException(id));

	}

	public void saveDecoratedPizza(ToppingDecorator d) {
		Pizza decoratedPizza = new Pizza();
		decoratedPizza.setName(d.getName());
		decoratedPizza.setCalories(d.getCalories());
		decoratedPizza.setIngredientsList(d.getName());
		;
		decoratedPizza.setPrice(d.getPrice());
		this.create(decoratedPizza);
	}

}
