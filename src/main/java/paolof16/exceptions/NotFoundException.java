package paolof16.exceptions;

import java.util.UUID;

public class NotFoundException extends RuntimeException {
    public NotFoundException(UUID id) {
        super("I can't find this item id (" + id + "). Try again");
    }
}
