import com.metodoestaticoexemplo.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testDividir() { // Verifica se o método 'dividir' está funcionando corretamente
        // Testando divisão normal
        assertEquals(5.0, Main.dividir(10, 2)); // pede para dividir 10 por 2 e o resultado será 5.0

        // Testando divisão com número negativo
        assertEquals(-5.0, Main.dividir(-10, 2)); // pede para dividir -10 por 2 e o resultado será -5.0

        // Testando divisão por 1
        assertEquals(10.0, Main.dividir(10, 1)); // pede para dividir 10 por 1 e o resultado será 10.0

        // Testando divisão por 0
        assertEquals(10.0, Main.dividir(10, 0)); // pede para dividir 10 por 0 e o resultado será 10.0
    }
}
