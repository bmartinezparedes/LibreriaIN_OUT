package cod.metodos;

import javax.swing.*;

public class PorVentana {
    private String msg;

    public PorVentana(String msg) {
        this.msg = msg;
    }

    public  void visualiza(){
        JOptionPane.showMessageDialog(null,"Sale por la ventana"+ msg);
    }
}
