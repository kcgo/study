package br.com.korsistemas.introducao.modificadorestatico.classes;

public class Carro {
    //velocidade limie deve ser de 240km/h
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240;

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println("-----------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Maxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + velocidadeLimite);
    }

    public Carro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


}