public class ListasEnlazada implements EvaluarNodo {

    protected boolean rrecorridoSecuancial;

    protected boolean getRrecorridoSecuancial() {
        return rrecorridoSecuancial;
    }

    protected void setRrecorridoSecuancial(boolean rrecorridoSecuancial) {
        this.rrecorridoSecuancial = rrecorridoSecuancial;
    }

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
    public void insertar() {

    }

    @Override
    public void eliminar() {

    }

    @Override
    public void rrecorrido() {

    }
}
