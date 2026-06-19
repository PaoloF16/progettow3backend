package paolof16.exceptions;

import java.util.UUID;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String isbn) {
        super("I can't find this item id (" + isbn + "). Try again");
    }
}
