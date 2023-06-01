package epicode.JAVASPRINGWEEK5DAY4.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import epicode.JAVASPRINGWEEK5DAY4.entities.toppings.ToppingDecorator;

@Service
public class ToppingsService {
	@Autowired
	private ToppingRepository toppingRepo;

	public void create(ToppingDecorator d) {
		toppingRepo.save(d);

	}

}
