package cod.metodos;

public class FactoriaDeSalidas {

    public static final int TERMINAL=1;
    public static final int VENTANA=2;

    public static InterfacesMetodosComunes getProducto(int type,String msg){
        switch(type){
            case TERMINAL:
                return new PorTerminal(msg);
            case VENTANA:
                return new PorVentana(msg);
            default:
                return null;
        }
    }
}
