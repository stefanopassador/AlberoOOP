package it.spassador;

import it.spassador.Alberi.Albero;
import it.spassador.Alberi.NodoAlbero;

public class Main {

    public static void main(String[] args) {

        Albero<String> albero = null;
        albero = new Albero<String>();

        NodoAlbero<String> tmp;
        tmp = albero.trovaInserisci("B");
        tmp = albero.trovaInserisci("A");
        tmp = albero.trovaInserisci("C");
        tmp = albero.trovaInserisci("D");



        System.out.println(albero.toString(" | "));

        albero.ribalta();

        System.out.println(albero.toString(" # "));
    }
}
