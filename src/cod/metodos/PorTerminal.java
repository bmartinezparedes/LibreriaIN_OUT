package cod.metodos;

import java.util.Scanner;

public class PorTerminal {

 Scanner sr=new Scanner(System.in);

 public  void visualiza(){
     System.out.println("Introducir mensaje");
     String elemento;
     elemento=sr.nextLine();
     System.out.println(elemento);
 }
}
