package br.org.sql.generator.enumeration;

/**
 * Representa os tipos de dados SQL.
 * 
 * @author thiago
 * @version v1.0.0 22/01/2017
 * @since v1.0.0
 */
public enum Type {
   BIT(java.sql.Types.BIT), 
   TINYINT(java.sql.Types.TINYINT), 
   SMALLINT(java.sql.Types.SMALLINT), 
   INTEGER(java.sql.Types.INTEGER), 
   BIGINT(java.sql.Types.BIGINT), 
   FLOAT(java.sql.Types.FLOAT), 
   REAL(java.sql.Types.REAL), 
   DOUBLE(java.sql.Types.DOUBLE), 
   NUMERIC(java.sql.Types.NUMERIC), 
   DECIMAL(java.sql.Types.DECIMAL), 
   CHAR(java.sql.Types.CHAR), 
   VARCHAR(java.sql.Types.VARCHAR), 
   LONGVARCHAR(java.sql.Types.LONGVARCHAR), 
   DATE(java.sql.Types.DATE), 
   TIME(java.sql.Types.TIME), 
   TIMESTAMP(java.sql.Types.TIMESTAMP), 
   BINARY(java.sql.Types.BINARY), 
   VARBINARY(java.sql.Types.VARBINARY), 
   LONGVARBINARY(java.sql.Types.LONGVARBINARY),  
   BLOB(java.sql.Types.BLOB), 
   CLOB(java.sql.Types.CLOB),  
   BOOLEAN(java.sql.Types.BOOLEAN);
   
   private final Integer typeValue;
   
   private Type(final Integer typeValue) {
      this.typeValue = typeValue;
   }
   
   public Integer getTypeValue() {
      return typeValue;
   }
}
