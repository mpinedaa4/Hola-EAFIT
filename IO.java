package paquete;
import java.util.Scanner;
public class IO{
  //metodos
  public static String leerTexto (String msg){
    Scanner teclado = new Scanner(System.in);
    System.out.print (msg + " ");
    String variable = teclado.nextLine();
    return variable;
  }
  public static int leerNumero(String msg){
    Scanner teclado = new Scanner(System.in);
    System.out.print(msg + " ");
    int variable = teclado.nextInt();
    return variable;
  }
  public static double leerFraccion(String msg){
    Scanner teclado = new Scanner(System.in);
    System.out.print(msg + " ");
    double variable = teclado.nextDouble();
    return variable;
  }
}