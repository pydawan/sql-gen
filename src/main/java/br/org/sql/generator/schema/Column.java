package br.org.sql.generator.schema;

import java.io.Serializable;

/**
 * @author thiago
 * @version v1.0.0 29/01/2017
 * @since v1.0.0
 */
public class Column implements Serializable {
   
   private static final long serialVersionUID = 1L;
   private String name;
   private int type;
   private int length;
   private boolean isNullable;
   private Object defaultValue;
   private boolean isPrimaryKey;
   private boolean isAutoIncrement;
   private boolean isUnicode;
   
   public Column(String name, int type, int length, boolean isNullable, Object defaultValue,
      boolean isPrimaryKey, boolean isAutoIncrement, boolean isUnicode) {
      this.name = name;
      this.type = type;
      this.length = length;
      this.isNullable = isNullable;
      this.defaultValue = defaultValue;
      this.isPrimaryKey = isPrimaryKey;
      this.isAutoIncrement = isAutoIncrement;
      this.isUnicode = isUnicode;
   }
   
   public Column(String name, int type, int length, boolean isNullable, Object defaultValue,
      boolean isPrimaryKey, boolean isAutoIncrement) {
      this(name, type, length, isNullable, defaultValue, isPrimaryKey, isAutoIncrement, false);
   }
   
   public Column(String name, int type) {
      this(name, type, -1, true, null, false, false);
   }
   
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public int getType() {
      return type;
   }
   
   public void setType(int type) {
      this.type = type;
   }
   
   public int getLength() {
      return length;
   }
   
   public void setLength(int length) {
      this.length = length;
   }
   
   public boolean isNullable() {
      return isNullable;
   }
   
   public void setNullable(boolean isNullable) {
      this.isNullable = isNullable;
   }
   
   public Object getDefaultValue() {
      return defaultValue;
   }
   
   public void setDefaultValue(Object defaultValue) {
      this.defaultValue = defaultValue;
   }
   
   public boolean isPrimaryKey() {
      return isPrimaryKey;
   }
   
   public void setPrimaryKey(boolean isPrimaryKey) {
      this.isPrimaryKey = isPrimaryKey;
   }
   
   public boolean isAutoIncrement() {
      return isAutoIncrement;
   }
   
   public void setAutoIncrement(boolean isAutoIncrement) {
      this.isAutoIncrement = isAutoIncrement;
   }
   
   public boolean isUnicode() {
      return isUnicode;
   }
   
   public void setUnicode(boolean isUnicode) {
      this.isUnicode = isUnicode;
   }
   
}
