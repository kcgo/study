package br.com.korsistemas.introducao.modificadorestatico.classes;


public class Cliente {
    //1- cbloco de inicalizaçao  estatico é executado quando a JVM carreage a classe( é executado apenas uma vez).
    //2- Alocado espaço na memoria para o objeto que será criado
    //3- Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    //4- Bloco de inicializacao é executado
    //5- o construtor é executado
    private static int[] parcelas;

   static {
        parcelas = new int[100];
        System.out.println("Dento do bloco de inicialização");
        for (int i = 1; i <= 100; i++) {
            parcelas[i - 1] = i;
        }
    }

    public Cliente() {

    }

    public static int[] getParcelas() {
        return parcelas;
    }


}
