package andrevsc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

class PessoaTest {

    @Test
    void validarCalculoIdade() {
        Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2004, 4, 17));
        assertEquals(20, pessoa.getIdade());
    }
}
