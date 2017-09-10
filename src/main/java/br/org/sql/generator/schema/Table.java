package br.org.sql.generator.schema;

import java.io.Serializable;

import br.org.sql.generator.Validator;

/**
 * @author thiago
 * @version v1.0.0 29/01/2017
 * @since v1.0.0
 */
public class Table  implements Serializable {
   
   private static final long serialVersionUID = 1L;
   private String name;
   private Column[] columns;
   
   public Table(String name, Column[] columns) {
      Validator.notNull(name, "String tableName cannot be null");
      Validator.notNull(columns, "Columns can not be null");
      Validator.isTrue(columns.length > 0, "Must include at least one column");
      this.name = name;
      this.columns = columns;
   }
   
   public String getName() {
      return name;
   }
   
   public Column[] getColumns() {
      return columns;
   }
   
}
