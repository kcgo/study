package br.com.korsistemas.introducao.associacao.classe;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;


    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void print() {
        System.out.println("\n------------------Relatorio de Seminarios----------------");
        System.out.println("Titulo: " + this.titulo);
        if (this.professor != null)
            System.out.println("Professor Palestrante: " + this.professor.getNome());
        else
        System.out.println("Nenhum Professor Cadastrado");
        if (this.local != null)
            System.out.println("Local: " + this.local.getRua() + ",Bairro" + this.local.getBairro());
        else
            System.out.println("Nenhum local cadastrado");
        if (alunos != null && alunos.length != 0) {
            System.out.println("-----------Alunos Participantes-------------- ");
            for (Aluno aluno : alunos) {
                System.out.print(aluno.getNome());
            }
            return;

        }
        System.out.println("Nenhum aluno cadastrado");

    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }


    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
