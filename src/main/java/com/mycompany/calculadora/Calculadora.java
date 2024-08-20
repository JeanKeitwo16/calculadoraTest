/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculadora;

/**
 *
 * @author IFSul
 */
public class Calculadora {

    public int somar(int x, int y) {
        return x + y;
    }

    public int subtrair(int x, int y) {
        return x - y;
    }

    /**
     * Método responsável por efetuar a divisão do dividendo pelo divisor de
     * dois números inteiros
     *
     * @param x dividendo
     * @param y divisor
     * @return a divisão
     */
    public int dividir(int x, int y) {
        return x / y;
    }

    public int multiplicar(int x, int y) {
        return x * y;
    }

    public boolean verificarSeEPar(int x) {
        return x % 2 == 0;
    }
}
