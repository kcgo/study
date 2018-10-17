package br.com.korsistemas.introducao.javacore.introducaoClassesTeste.test;

import br.com.korsistemas.introducao.javacore.introducaoClasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "122.222.232-20";
        prof.matricula = " 11122";
        prof.nome = " katia";
        prof.rg = "122211-5";



        Professor prof2 = new Professor();
        prof2.cpf = "122.233.232-20";
        prof2.matricula = " 11122";
        prof2.nome = " Joana";
        prof2.rg = "12358-5";

        prof.imprime();
        prof2.imprime();

    }
}
