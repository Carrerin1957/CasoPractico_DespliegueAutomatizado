/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package prueba.despliegue;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oscar
 */
public class PruebaDespliegueTest {
    
    public PruebaDespliegueTest() {
    }

    @Test
    public void testNumerosEntreOrdenNormal() {
        int numero1 = 1;
        int numero2 = 10;
        String expectedResult = "Los números pares entre 1 y 10 son:\n2\n4\n6\n8";
        assertEquals(expectedResult, obtenerNumerosEntre(numero1, numero2));
    }

    @Test
    public void testNumerosEntreOrdenInverso() {
        int numero1 = 20;
        int numero2 = 30;
        String expectedResult = "Los números pares entre 20 y 30 son:\n22\n24\n26\n28";
        assertEquals(expectedResult, obtenerNumerosEntre(numero1, numero2));
    }

    @Test
    public void testNumerosEntreNumerosIguales() {
        int numero1 = 5;
        int numero2 = 5;
        String expectedResult = "Los números pares entre 5 y 5 son:";
        assertEquals(expectedResult, obtenerNumerosEntre(numero1, numero2));
    }
    
    @Test
    public void testNumerosEntreNumerosNegativos() {
        int numero1 = -10;
        int numero2 = -6;
        String expectedResult = "Los números pares entre -10 y -6 son:\n-9\n-8\n-7";
        assertEquals(expectedResult, obtenerNumerosEntre(numero1, numero2));
    }

    private String obtenerNumerosEntre(int numero1, int numero2) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> numbers = new ArrayList<>();

        sb.append("Los números pares entre ").append(numero1).append(" y ").append(numero2).append(" son:\n");

        int menor = Math.min(numero1, numero2);
        int mayor = Math.max(numero1, numero2);

        for (int i = menor + 1; i < mayor; i++) {
            numbers.add(i);
        }
        
        for (int i = 0 ; i < numbers.size(); i++) {
         
            if (numbers.get(i)%2 == 0){
                sb.append(numbers.get(i)).append("\n");
            }
            
        }

        return sb.toString().trim();
    }
    
}
