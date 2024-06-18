public abstract class Acciones extends NodoDelArbol implements EvaluarNodo  {


    public Acciones (int ValorNodo){
        super(ValorNodo);
    }
    public abstract void eleiminar();
    public abstract void buscar();
    public abstract void inOrden();
    public abstract void preOrden();
    public abstract void postOrden();

    @Override
    public boolean esmayor() {
        return false;
    }
    @Override
    public boolean esmenor() {
        return false;
    }
    @Override
    public void mostrar() {
    }
    @Override
    public void rrecorrido() {
    }
   @Override
    public void eliminar() {
    }
    @Override
    public void insertar() {
    }


}
