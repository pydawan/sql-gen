package br.org.sql.generator.enumeration;

/**
 * @author thiago
 * @version v1.0.0 22/01/2017
 * @since v1.0.0
 */
public enum Null {
   YES(""), 
   NO("NOT NULL");
      
   private final String value;
   
   private Null(final String value) {
      this.value = value;
   }
   
   public String getValue() {
      return value;
   }
   
   public String toString() {
      return this.value;
   }
}
