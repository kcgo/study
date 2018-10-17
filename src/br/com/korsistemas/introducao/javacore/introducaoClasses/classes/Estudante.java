package br.com.korsistemas.introducao.javacore.introducaoClasses.classes;

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    public void imprime() {
        System.out.println(" Idade : " + this.getIdade());
//        System.out.println(" Nome : " + this.getNome());
        if (this.getNotas() != null) {
            for (double nota : this.getNotas())
                System.out.print(nota + " ");
        }
    }

    public void mediaNota() {
        double media = 0;
        if (this.getNotas() == null) {
            System.out.println("Este aluno não possui notas");
            return;
        }
        for (double nota : this.getNotas()) {
            media += nota;

        }
        media = media / this.getNotas().length;
        if (media >= 6) {
            this.aprovado= true;
            System.out.println("\n A média é: " + media + " situação: aprovasdo");
        } else {
            this.aprovado= false;
            System.out.println("A média é: " + media + " situação: Reprovado");
        }

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        System.out.println("Você não pode fazer isso ");
        return;
    }


    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public boolean isAprovado() {
        return this.aprovado;
    }



}

