package epicode.JAVASPRINGWEEK5DAY4.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import epicode.JAVASPRINGWEEK5DAY4.entities.pizzas.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, UUID> {

}
