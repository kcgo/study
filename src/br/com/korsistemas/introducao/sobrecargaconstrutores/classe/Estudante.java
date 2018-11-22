package br.com.korsistemas.introducao.sobrecargaconstrutores.classe;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;


    public Estudante(String matricula, String nome, double[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
        this(matricula, nome, notas);
        this.dataMatricula = dataMatricula;

    }

    public Estudante() {

    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.matricula + "\n");
        System.out.println(this.dataMatricula);
        for (double nota : notas) {
            System.out.println(nota + "\n");

        }


    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }


}


