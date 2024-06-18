public class Main {
    public static void main(String[] args) {
      
        ListasCirculares lista = new ListasCirculares();

        
        ArbolAVI arbol = new ArbolAVI(10);


        lista.insertar();

        arbol.equilibrar();
    }
}
