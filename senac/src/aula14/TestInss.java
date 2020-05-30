package aula14;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestInss {
  // 1 teste para cada if -> Classe de equivalência

   @Test
   public void testeFaixa1() 
   {
     Inss inss = new Inss(1000.0);
     double imposto = inss.calcularDesconto();

     // Arrange
     // Act
     // Assert
     // 1 - Experado
     // 2 - Resultado
     assertEquals(80.0, imposto, 0.001);
   }
}
