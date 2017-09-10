package sql.generator.test;

import org.junit.Test;

import br.org.sql.generator.Coluna;
import br.org.sql.generator.SqlGen;
import br.org.sql.generator.Tabela;
import br.org.sql.generator.enumeration.Null;
import br.org.sql.generator.enumeration.Type;
import br.org.sql.generator.schema.Constraint;
import br.org.sql.generator.schema.Operator;

/**
 * Testa as funcionalidades providas pelo
 * gerador de código SQL.
 * 
 * @author thiago
 * @version v1.0.0 22/01/2017
 * @since v1.0.0
 */
public class SqlTest {
   @Test
   public void testCreateTable() {
      System.out.println(SqlGen.createTable("produtos"));
      System.out.println(SqlGen.table.create("produtos"));
      Tabela tbFuncionarios = SqlGen.createTable("funcionarios");
      tbFuncionarios
         .addColumn(new Coluna("id", Type.INTEGER, Null.NO))
         .addColumn(new Coluna("nome", Type.VARCHAR, Null.NO))
         .addColumn(new Coluna("preco", Type.DECIMAL, Null.YES));
      System.out.println(tbFuncionarios);
      System.out.println(Constraint.NOT_NULL);
      System.out.println(Constraint.UNIQUE);
      System.out.println(Constraint.CHECK("IDADE > 18"));
      System.out.println(Constraint.PRIMARY_KEY("id"));
      System.out.println(Constraint.REFERENCES("produto", "id"));
      System.out.println(Operator.IN("SELECT id FROM cidade"));
      // select(col1, col2, col3).from().where();
      // SQL.insert();
      // SQL.select().from().as().where().limit().orderBy().offset().groupBy().having();
   }
}
