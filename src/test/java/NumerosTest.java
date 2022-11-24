import org.example.Numeros;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumerosTest {

    Numeros numero;

    @BeforeEach
    public void setup(){
        numero = new Numeros();
    }

    @DisplayName("Teste primo")
    @ParameterizedTest
    @ValueSource(ints = {3,23,311,487,653,947})
    public void testprimo(int number){
        assertTrue(numero.isPrime(number));
    }

    @DisplayName("Teste par")
    @ParameterizedTest
    @ValueSource(ints = {32,64,2,20,30,26})
    public void testpar(int number){
        assertTrue(numero.isEven(number));
    }

    @DisplayName("Teste Multiplo")
    @ParameterizedTest
    @CsvSource(value = {"23,23", "46,23", "115,23", "184,23","207,23","230,23"})
    public void testmultiplo(int number, int divisor){
        assertTrue(numero.isMultiple(number,divisor));
    }

}
