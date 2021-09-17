package br.com.leandrocolevati.pilhastring;

import java.net.URL;
import java.util.ArrayList;

public class HistoricoController {

    ArrayList<String> siteAtual = new ArrayList<String>();

    public void inserirSite(String nomeSite) {
        siteAtual.add(nomeSite);
    }

    public void removerSite(Metodos url) {
        siteAtual.remove(url);
    }

    public void consultarSite() {
        System.out.println(siteAtual);
    }
}
