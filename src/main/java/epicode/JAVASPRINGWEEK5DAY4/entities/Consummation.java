package epicode.JAVASPRINGWEEK5DAY4.entities;

//import jakarta.persistence.MappedSuperclass;
//import jakarta.persistence.MappedSuperclass;
//import lombok.AllArgsConstructor;
import lombok.Getter;
//import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@MappedSuperclass
public abstract class Consummation extends Product {

	protected long calories;

}
