public class NodoDelArbol {
    protected NodoDelArbol nodoIzquierdo;
    protected NodoDelArbol nodoDerecho;
    protected int pocicion;
    protected int valorNodo;

    public NodoDelArbol(int valorNodo) {
        this.valorNodo = valorNodo;
        this.nodoIzquierdo = null;
        this.nodoDerecho = null;
    }

    public NodoDelArbol getNodoIzquierdo() {
        return nodoIzquierdo;
    }

    public void setNodoIzquierdo(NodoDelArbol nodoIzquierdo) {
        this.nodoIzquierdo = nodoIzquierdo;
    }

    public NodoDelArbol getNodoDerecho() {
        return nodoDerecho;
    }

    public void setNodoDerecho(NodoDelArbol nodoDerecho) {
        this.nodoDerecho = nodoDerecho;
    }

    public int getPocicion() {
        return pocicion;
    }

    public void setPocicion(int pocicion) {
        this.pocicion = pocicion;
    }

    public int getValorNodo() {
        return valorNodo;
    }

    public void setValorNodo(int valorNodo) {
        this.valorNodo = valorNodo;
    }
}