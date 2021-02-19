package cod;

import java.util.Scanner;

public class PorTerminal {

 Scanner sr=new Scanner(System.in);

 public  void scanner(){
     System.out.println("Introducir mensaje");
     String elemento;
     elemento=sr.nextLine();
     System.out.println(elemento);
 }
}
