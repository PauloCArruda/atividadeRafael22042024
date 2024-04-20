import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class ClassificadorIdadeTest {

        @ParameterizedTest
        @CsvFileSource(resources = "/idades.csv", numLinesToSkip = 1)
        void testClassificarIdade(int idade, String categoriaEsperada) {
            ClassificadorIdade classificador = new ClassificadorIdade();
            String categoriaObtida = classificador.classificarIdade(idade);
            assertEquals(categoriaEsperada, categoriaObtida);
        }
    }

