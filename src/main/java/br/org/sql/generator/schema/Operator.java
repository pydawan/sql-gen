package br.org.sql.generator.schema;

/**
 * @author thiago
 * @version v1.0.0 29/01/2017
 * @since v1.0.0
 */
public class Operator {
   public static final String IN(String condition) {
      return String.format("IN (%s)", condition);
   }
   public static final String NOT_IN(String condition) {
      return String.format("NOT IN (%s)", condition);
   }
}
