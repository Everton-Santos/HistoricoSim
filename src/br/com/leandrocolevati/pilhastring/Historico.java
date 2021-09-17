package br.com.leandrocolevati.pilhastring;

public class Historico {
    public static void main(String[] args) {

        HistoricoController teste = new HistoricoController();

        String nomeSite;

        teste.inserirSite("pokemon");

        teste.consultarSite();
    }
}
