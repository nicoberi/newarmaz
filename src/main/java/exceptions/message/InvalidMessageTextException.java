package exceptions.message;

import constants.FailMessages;

/**
 * Exception for Invalid Message Text Exception.
 */
public class InvalidMessageTextException extends Exception {

  public InvalidMessageTextException() {
    super(String.format(FailMessages.MESSAGE_INVALID_TEXT_LENGTH));
  }
}