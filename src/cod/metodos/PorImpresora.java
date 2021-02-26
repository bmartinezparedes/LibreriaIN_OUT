package cod.metodos;

public class PorImpresora implements InterfacesMetodosComunes{
    private String msg;

    public PorImpresora(String msg) {
        this.msg = msg;
    }

    @Override
    public void visualiza() {
        System.out.println("Sale por terminal "+msg);
    }
}
