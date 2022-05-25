package br.com.confidencecambio.javabasico.service;


import br.com.confidencecambio.javabasico.model.Cliente;
import org.junit.Before;
import org.junit.Test;

import javax.validation.ConstraintViolationException;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HelloServiceTest {

    private HelloService service;

    @Before
    public void init(){
         service= new HelloService();
    }


    @Test
    public void quandoPassarUmNomeQueroEleDeResposta(){
        var nome = "Meu Nome";
        String valorValido = service.retornaValorValido(nome);
        assertEquals(nome,valorValido);
    }

    @Test
    public void quandoPassarNuloQueroOPadrao(){

        String valorValido = service.retornaValorValido(null);
        assertEquals("Mundo",valorValido);
    }



}