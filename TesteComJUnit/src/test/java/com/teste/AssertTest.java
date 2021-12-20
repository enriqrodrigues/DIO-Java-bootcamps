package com.teste;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertTest {

    @Test
    public void testAssertArrayEquals() {
        byte[] esperado = "teste".getBytes();
        byte[] atual = "teste".getBytes();
        assertArrayEquals(esperado, atual);
    }   //Comparamos dois Arrays de bytes

    @Test
    public void testAssertEquals() {
        assertEquals("text", "text");
    }   //Comparamos duas Strings

    @Test
    public void testAssertFalse() {
        assertFalse(false);
    }   //Teste se um objeto qualquer é verdadeiro ou falso

    @Test
    public void testAssertNotNull(){
        assertNotNull(new Object());
    }   //Valida se um Objeto está carregando um valor não nulo

    @Test
    public void testAssertNotSame(){
        assertNotSame(new Object(), new Object());
    }   //Verifica se os Objetos não são os mesmos

    @Test
    public void testAssertNull(){
        assertNull(null);
    }   //Verifica se o Objeto está null

    @Test
    public void testAssertSame(){
        Integer aNumber = Integer.valueOf(769);
        assertSame(aNumber, aNumber);
    }   //Verifica se um Objeto é o mesmo.

}
