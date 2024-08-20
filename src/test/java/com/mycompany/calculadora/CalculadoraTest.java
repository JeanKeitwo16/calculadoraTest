/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculadora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author IFSul
 */
public class CalculadoraTest {
    private Calculadora c;
    
    public CalculadoraTest() {
        c = new Calculadora();
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        c = new Calculadora();
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void somarTest() {
        System.out.println("Somar");
        int somar = c.somar(10, 20);
        System.out.println("Soma: " + somar);;
        Assertions.assertEquals(30, somar);
    }

    /**
     * Test of subtrair method, of class Calculadora.
     */
    @Test
    public void subtrairTest() {
        System.out.println("Subtrair");
        int subtrair = c.subtrair(30, 20);
        System.out.println("Subtração: " + subtrair);
        Assertions.assertEquals(10, subtrair);
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @Test
    public void dividirTest() {
        System.out.println("Dividir");
        int dividir = c.dividir(40, 20);
        System.out.println("Divisão: " + dividir);
        Assertions.assertNotEquals(3, dividir);
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void multiplicarTest() {
        System.out.println("Multiplicar");
        int multiplicar = c.multiplicar(20, 10);
        System.out.println("Multiplicação: " + multiplicar);
        Assertions.assertEquals(200, multiplicar);
    }

    /**
     * Test of verificarSeEPar method, of class Calculadora.
     */
    @Test
    public void testVerificarSeEParTest() {
        System.out.println("Verificar se é par");
        boolean verificarSeEPar = c.verificarSeEPar(5);
        System.out.println("Par: " + verificarSeEPar);
        Assertions.assertFalse(verificarSeEPar);
    }
    
}
