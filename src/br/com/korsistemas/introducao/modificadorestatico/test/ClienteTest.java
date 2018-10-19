package br.com.korsistemas.introducao.modificadorestatico.test;


import br.com.korsistemas.introducao.modificadorestatico.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        System.out.println("Exibindo quantidade de parcelas possiveis");
        for (int parcela : c.getParcelas()) {
            System.out.print(parcela + " ");

        }
    }
}
