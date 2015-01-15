package it.spassador.Alberi;

/**
 * Created by stefanopassador on 12/01/15.
 */
public class Albero<T extends Comparable<T>> {
    NodoAlbero<T> radice;

    public Albero() {
        this.radice = null;
    }

    public Albero(NodoAlbero<T> x) {
        this.radice = x;
    }

    public NodoAlbero<T> trovaInserisci(T x) {
        NodoAlbero<T> trovato = ricerca(x);
        if (trovato == null) {
            inserisci(x);
            return null;
        } else {
            return trovato;
        }
    }

    private void inserisci(T x) {
        radice = inserisci(new NodoAlbero<T>(x), radice);
    }
    private NodoAlbero<T> inserisci(NodoAlbero<T> x, NodoAlbero radice) {
        if (radice == null) {
            return x;
        } else {
            if (x.getDato().compareTo((T) radice.getDato()) > 0) {
                // x > radice
                radice.setNodoDx(inserisci(x, radice.getNodoDx()));
            } else if (x.getDato().compareTo((T) radice.getDato()) < 0) {
                // x < radice
                radice.setNodoSx(inserisci(x, radice.getNodoSx()));
            }
            return radice;
        }
    }

    private NodoAlbero<T> ricerca(T x)
    {
        return ricerca(radice, x);
    }
    private NodoAlbero<T> ricerca(NodoAlbero<T> nodo, T x) {
        if (nodo == null)
            return null;
        else
        if (x.compareTo(nodo.getDato()) == 0)
            return nodo;
        else
        if (x.compareTo(nodo.getDato()) < 0)
            return ricerca(nodo.getNodoSx(), x);
        else
            return ricerca(nodo.getNodoDx(), x);
    }

    public void ribalta() {
        ribalta(radice);
    }
    private void ribalta(NodoAlbero<T> nodo) {
        if (nodo != null) {
            NodoAlbero<T> temporaneo = nodo.getNodoDx();
            nodo.setNodoDx(nodo.getNodoSx());
            nodo.setNodoSx(temporaneo);
            ribalta(nodo.getNodoDx());
            ribalta(nodo.getNodoSx());
        }
    }

    public String toString(String separatore) {
        if (radice != null) {
            Albero<String> tmp;
            tmp = new Albero(radice.getNodoSx());
            String sinistra = tmp.toString(separatore);
            String centro = radice.getDato().toString() + separatore;
            tmp = new Albero(radice.getNodoDx());
            String destra = tmp.toString(separatore);
            return sinistra + centro + destra;
        } else
            return "";
    }
}



/*
- un metodo toString(String separatore) in grado di stampare i dati secondo l'ordinamento dato dall'albero, interponendo
il separatore tra stampe di dati adiacenti.
 */