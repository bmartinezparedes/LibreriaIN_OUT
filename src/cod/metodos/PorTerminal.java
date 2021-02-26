package cod.metodos;

import javax.swing.*;
import java.util.Scanner;

public class PorTerminal implements InterfacesMetodosComunes {
    private String msg;

    public PorTerminal(String msg) {
        this.msg = msg;
    }


    @Override
    public void visualiza() {
        System.out.println("Sale por terminal"+msg);
    }
}
