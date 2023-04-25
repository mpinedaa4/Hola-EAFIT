//librerias
import paquete.IO;

public class Menu{
  //metodos
  public void menuPrincipal(String usuario){
    System.out.println("¿Qué deseas hacer el día de hoy, " + usuario + "?");
    System.out.println("1. ¿Cómo llegar a un bloque?");
    System.out.println("2. ¿Cómo está el clima en la universidad?");
    System.out.println("3. Ingresar actividades al planeador");
    System.out.println("4. Ver mi planeador");
    System.out.println("5. No necesito nada por ahora");
    int respuesta = IO.leerNumero("Ingrese el número de su respuesta: ");
    if (respuesta==1){
    String destino = IO.leerTexto("Ingresa el bloque al cual deseas dirigirte: ");
      Ubicacion ubi = new Ubicacion(destino);
      ubi.go();
      volver(usuario);
    }
    if (respuesta==2){
      Clima clima = new Clima();
      clima.verClima();
      volver(usuario);
    }
    if (respuesta==3){
      Planeador plan = new Planeador(usuario);
      plan.ingresarActividad();
    }
    if (respuesta==4){
      Planeador plan = new Planeador(usuario);
      String actividades = plan.extraerInformacion(usuario);
      System.out.println("Tus actividades pendientes son:\n" + actividades);
      volver(usuario);
    }
    if (respuesta == 5){
      System.out.println("Hasta luego.");
      System.exit(0);
    }
  }

  public void volver(String usuario){
    String volver = IO.leerTexto("¿Deseas volver al menú principal?");
    if(volver.equalsIgnoreCase("si")){
      menuPrincipal(usuario);
    }
    else if (volver.equalsIgnoreCase("no")){
      System.out.println("Hasta luego.");
      System.exit(0);
    }
    else{
      System.out.println("No ingresaste una respuesta válida.");
      volver(usuario);
    }
  }
}