package paolof16.exceptions;

import java.util.UUID;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String id) {
        super("I can't find this customer fidelity card: (" + id + "). Try again");
    }
}
