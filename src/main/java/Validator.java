
import constants.Variables;
import exceptions.common.InvalidLengthException;
import exceptions.message.InvalidMessageTextException;

public class Validator {
    public static void validateStringLength(Message message, int minLength, int maxLength)
            throws InvalidLengthException {
        if (message.getMessage().length() < minLength
                || message.getMessage().length() > maxLength) {
            throw new InvalidLengthException();
        }
    }
    public static void validateMessage(Message message) throws InvalidMessageTextException {
        try {
            validateStringLength(message, Variables.MIN_MESSAGE_TEXT_LENGTH, Variables.MAX_MESSAGE_TEXT_LENGTH);
        } catch (InvalidLengthException e) {
            throw new InvalidMessageTextException();
        }
    }

}
