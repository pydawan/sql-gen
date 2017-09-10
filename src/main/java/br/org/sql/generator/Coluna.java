package br.org.sql.generator;

import static br.org.verify.Verify.isNotEmptyOrNull;
import static br.org.verify.Verify.isNotNull;

import java.io.Serializable;

import br.org.sql.generator.enumeration.Null;
import br.org.sql.generator.enumeration.Type;

/**
 * @author thiago
 * @version v1.0.0 22/01/2017
 * @since v1.0.0
 */
public final class Coluna implements Serializable {
  
  private static final long serialVersionUID = 1L;
  private String name;
  private StringBuffer sql;
  
  public Coluna() {
    sql = new StringBuffer();
  }
  
  public Coluna(String name, Type type, Null nullable) {
    this();
    this.name = name;
    if (isNotEmptyOrNull(name) && isNotNull(type)) {
      this.setName(name);
      this.sql.append(String.format("%s %s %s", name, type, nullable));
    }
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public static Coluna getColumn(String name) {
    Coluna column = new Coluna();
    return column;
  }
  
  public static Coluna column(String name) {
    return getColumn(name);
  }
  
  public String toString() {
    return sql.toString();
  }
}
