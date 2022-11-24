import org.example.UC;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UCTest {

    UC uc;

    @BeforeEach
    public void setup(){
        uc = new UC("qs",20);
    }

    @ParameterizedTest
    @CsvSource(value = {"1,20","2,15","3,16"})
    public void inserir(int numAluno,double nota){
        assertTrue(uc.insereNotaUC(numAluno,nota));
    }

    @ParameterizedTest
    @CsvSource(value = {"1,20"})
    public void pesquisa(int numAluno,double nota){
        uc.insereNotaUC(numAluno,nota);
        assertEquals(uc.pesquisaAluno(numAluno),20);
    }

    @ParameterizedTest
    @CsvSource(value = {"0,20,15,5"})
    public void media(int n1, int n2, int n3, int n4){
        uc.insereNotaUC(1,n1);
        uc.insereNotaUC(2,n2);
        uc.insereNotaUC(3,n3);
        uc.insereNotaUC(3,n4);
        assertEquals(uc.media(),10);
    }

    @ParameterizedTest
    @CsvSource(value = {"1,10,true","2,5,false","3,15,true"})
    public void aprovado(int numAluno,double nota, boolean aprovado){
        uc.insereNotaUC(numAluno,nota);
        assertEquals(uc.aprovado(numAluno),aprovado);
    }
}
