package br.com.korsistemas.introducao.javacore.introducaoClassesTeste.test;

import br.com.korsistemas.introducao.javacore.introducaoClasses.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisBNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(5,5);
        double result = calc.dividDoisNumeros(20,0);
        System.out.println(result);
        System.out.println("IMPRIMINDO DOIS NUMEROS DIVIDIDOS");
        calc.imprimeDoisNumerosDivididos(20,5);
        System.out.println("CONTINUA A EXE.");

        int[] numeros = {1,2,3,4,5};
        calc.somaArray(numeros);
    }
}
