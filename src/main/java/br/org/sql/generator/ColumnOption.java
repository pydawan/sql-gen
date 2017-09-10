package br.org.sql.generator;

import br.org.sql.generator.schema.Column;

/**
 * @author thiago
 * @version v1.0.0 29/01/2017
 * @since v1.0.0
 * @param <T>
 */
public interface ColumnOption<T> {
   public void configure(Column column);
}
