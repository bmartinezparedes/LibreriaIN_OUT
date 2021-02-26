package cod.metodos;

import javax.swing.*;
import java.util.Scanner;

public class PorTerminal {
    private String msg;

    public PorTerminal(String msg) {
        this.msg = msg;
    }

    public  void visualiza(){
        System.out.println("Sale por terminal"+msg);
    }

}
