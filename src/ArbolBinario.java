public class ArbolBinario extends Acciones {

    public ArbolBinario(int ValorNodo) {
        super(ValorNodo);
    }

    protected int NumeroDeNodos;
    protected String nodoRaiz;
    public int operaciones(){
        return 0;
    }

    protected int getNumeroDeNodos() {
        return NumeroDeNodos;
    }
    protected void setNumeroDeNodos(int numeroDeNodos) {
        NumeroDeNodos = numeroDeNodos;
    }
    protected String getNodoRaiz() {
        return nodoRaiz;
    }
    protected void setNodoRaiz(String nodoRaiz) {
        this.nodoRaiz = nodoRaiz;
    }


    @Override
    public void eleiminar() {

    }

    @Override
    public void insertar() {

    }

    @Override
    public void buscar() {

    }

    @Override
    public void inOrden() {

    }

    @Override
    public void preOrden() {

    }

    @Override
    public void postOrden() {

    }
}
