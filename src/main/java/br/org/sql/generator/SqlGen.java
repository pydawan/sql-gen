package br.org.sql.generator;

import java.io.Serializable;

/**
 * Gerador de código SQL.
 * 
 * @author thiago
 * @version v1.0.0 22/01/2017
 * @since v1.0.0
 */
public final class SqlGen implements Serializable {
  
  private static final long serialVersionUID = 1L;
  
  public static Tabela createTable(String name) {
    return Tabela.createTable(name);
  }
  
  public static final class table {
    public static Tabela create(String name) {
      return Tabela.create(name);
    }
  }
}
