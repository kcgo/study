package br.com.korsistemas.introducao.blocodeinicializacao.classes;


public class Cliente {

    //1- Alocado espaço na memoria para o objeto que será criado
    //2- Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    //3- Bloco de inicializacao é executado
    //4- o construtor é executado
    private static int[] parcelas;

    {
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
