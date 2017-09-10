package br.org.sql.generator.exception;

/**
 * @author thiago
 * @version v1.0.0 29/01/2017
 * @since v1.0.0
 */
public class SQLGenException extends RuntimeException {
  
  private static final long serialVersionUID = 1L;
  
  public SQLGenException() {
    super();
  }
  
  public SQLGenException(String message, Throwable cause) {
    super(message, cause);
  }
  
  public SQLGenException(String message) {
    super(message);
  }
  
  public SQLGenException(Throwable cause) {
    super(cause);
  }
  
}
