package com.elrincon.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EjemploTest {

    @Test
    void pruebaSuma() {
        int resultado = 2 + 3;
        assertEquals(5, resultado);
    }
}