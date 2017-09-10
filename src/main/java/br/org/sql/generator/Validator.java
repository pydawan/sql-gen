package br.org.sql.generator;

import java.util.logging.Logger;

import br.org.sql.generator.exception.SQLGenException;

/**
 * @author thiago
 * @version v1.0.0 29/01/2017
 * @since v1.0.0
 */
public class Validator {
  
  public static void notNull(Object object, String message) {
    notNull(object, message, null);
  }
  
  public static void notNull(Object object, String message, Logger logger) {
    if (object == null) {
      throwException(message, logger);
    }
  }
  
  public static void isTrue(boolean trueExpression, String message) {
    isTrue(trueExpression, message, null);
  }
  
  public static void isTrue(boolean trueExpression, String message, Logger logger) {
    if (!trueExpression) {
      throwException(message, logger);
    }
  }
  
  private static void throwException(String message, Logger logger) {
    SQLGenException exception = new SQLGenException(message);
    if (logger != null) {
      logger.severe("Required object was null" + exception);
    }
    throw exception;
  }
  
}
