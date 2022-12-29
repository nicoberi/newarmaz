package exceptions.common;

import constants.FailMessages;

/**
 * Exception for invalid length .
 */
public class InvalidLengthException extends Exception {
  public InvalidLengthException() {
    System.out.println(FailMessages.MESSAGE_INVALID_TEXT_LENGTH);
  }
}
