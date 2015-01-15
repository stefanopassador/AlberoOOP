package it.spassador.Alberi;

import java.util.Comparator;

/**
 * Created by stefanopassador on 12/01/15.
 */
public class NodoAlbero<E extends Comparable<E>> {
    private E dato;
    private NodoAlbero nodoSx;
    private NodoAlbero nodoDx;

    public NodoAlbero(E dato, NodoAlbero nodoSx, NodoAlbero nodoDx) {
        this.dato = dato;
        this.nodoSx = nodoSx;
        this.nodoDx = nodoDx;
    }

    public NodoAlbero(E dato) {
        this.dato = dato;
        nodoSx = null;
        nodoDx = null;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public NodoAlbero getNodoSx() {
        return nodoSx;
    }

    public void setNodoSx(NodoAlbero nodoSx) {
        this.nodoSx = nodoSx;
    }

    public NodoAlbero getNodoDx() {
        return nodoDx;
    }

    public void setNodoDx(NodoAlbero nodoDx) {
        this.nodoDx = nodoDx;
    }
}
