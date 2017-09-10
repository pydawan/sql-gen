package br.org.sql.generator;

import static br.org.verify.Verify.isNotEmptyOrNull;
import static br.org.verify.Verify.isNotNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author thiago
 * @version v1.0.0 22/01/2017
 * @since v1.0.0
 */
public final class Tabela implements Serializable {
  
  private static final long serialVersionUID = 1L;
  private String name;
  private List<Coluna> columns;
  private StringBuffer sql;
  
  public Tabela() {
    name = "";
    columns = new ArrayList<>();
    sql = new StringBuffer();
  }
  
  public Tabela(String name) {
    this();
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public List<Coluna> getColumns() {
    return columns;
  }
  
  public List<Coluna> columns() {
    return columns;
  }
  
  public void setColumns(List<Coluna> columns) {
    this.columns = columns;
  }
  
  public void columns(List<Coluna> columns) {
    this.columns = columns;
  }
  
  public Tabela addColumn(Coluna column) {
    if (isNotNull(column)) {
      columns.add(column);
    }
    return this;
  }
  
  public Tabela column(Coluna column) {
    return addColumn(column);
  }
  
  public StringBuffer getSql() {
    return sql;
  }
  
  public StringBuffer sql() {
    return getSql();
  }
  
  public static Tabela createTable(String name) {
    Tabela table = new Tabela();
    if (isNotEmptyOrNull(name)) {
      table.setName(name);
      table.getSql().append("CREATE TABLE " + name);
      return table;
    }
    return table;
  }
  
  public static Tabela create(String name) {
    return createTable(name);
  }
  
  public String toString() {
    if (columns.size() > 0) {
      sql.append(" (");
      for (Coluna column : columns) {
        sql.append("\n    " + column + ",");
      }
      sql.deleteCharAt(sql.lastIndexOf(","));
      sql.append("\n);");
    }
    return sql.toString();
  }
  
}
