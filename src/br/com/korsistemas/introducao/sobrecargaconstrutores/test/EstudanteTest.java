package br.com.korsistemas.introducao.sobrecargaconstrutores.test;


import br.com.korsistemas.introducao.sobrecargaconstrutores.classe.Estudante;

public class EstudanteTest{
    public static void main(String[] args) {
        Estudante estudante = new Estudante("1234","katia", new double[]{5,7,9}, "15/01/2018");

        estudante.imprime();

    }
}
