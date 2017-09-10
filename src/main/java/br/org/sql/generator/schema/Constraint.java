package br.org.sql.generator.schema;

/**
 * @author thiago
 * @version v1.0.0 29/01/2017
 * @since v1.0.0
 */
public class Constraint {
   public static final String NOT_NULL = "NOT NULL";
   public static final String UNIQUE = "UNIQUE";
   public static final String PRIMARY_KEY(String column) {
      return String.format("PRIMARY KEY(%s)", column);
   }
   public static final String CHECK(String condition) {
      return String.format("CHECK (%s)", condition);
   }
   public static final String REFERENCES(String table, String column) {
      return String.format("REFERENCES %s(%s)", table, column);
   }
}
