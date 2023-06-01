package epicode.JAVASPRINGWEEK5DAY4.exception;

import java.util.UUID;

public class ItemNotFoundException extends RuntimeException {
	public ItemNotFoundException() {
		super("Item not found");
	}

	public ItemNotFoundException(UUID id) {
		super("Item with id " + id + " not found");
	}

}
