package br.com.korsistemas.introducao.associacao.classe;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor() {
    }

    public void print() {
        System.out.println("--------------Relatorio de Professor----------------");
        System.out.println("Nome do Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (seminarios != null && seminarios.length != 0) {
            System.out.println("----------------Seminarios Participantes-------------");
            for (Seminario sem : seminarios) {
                System.out.print(sem.getTitulo() + " ");

            }
            return;
        }
    System.out.println("Professor não vinculado a nenhum seminario");

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminario() {
        return seminarios;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminarios = seminario;
    }
}
