package br.com.korsistemas.introducao.javacore.introducaoClassesTeste.test;

import br.com.korsistemas.introducao.javacore.introducaoClasses.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.setNome("Katia Costa");
        estudante.setIdade(-1);
        estudante.setNotas( new double[]{9.5, 2, 2});
        estudante.imprime();
        estudante.mediaNota();
        System.out.println(estudante.getNome());
        System.out.println("Aprovado? " + estudante.isAprovado());
    }


}