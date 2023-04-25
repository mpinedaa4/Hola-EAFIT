//librerias
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import paquete.IO;

public class Planeador {
  //atributos
  private String nombreUsuario;
  private String informacion;

  //constructor
  public Planeador(String nombreUsuario) {
    this.nombreUsuario = nombreUsuario;
  }

  //metodos
  public void ingresarActividad() {
    this.informacion = IO.leerTexto("Ingresa una actividad al planeador: ");
    guardarActividad();
    repetir();
  }

  public void guardarActividad() {
    try {
      File archivo = new File("informacion.txt");
      FileWriter escritor = new FileWriter(archivo, true);
      BufferedWriter buffer = new BufferedWriter(escritor);
      buffer.write(this.nombreUsuario + "," + this.informacion + "\n");
      buffer.close();
    } catch (IOException e) {
      System.out.println("Error al guardar la información: " + e.getMessage());
    }
  }

  public void repetir(){
    String respuesta = IO.leerTexto("¿Deseas ingresar otra actividad?");
    if (respuesta.equalsIgnoreCase("si")){
      ingresarActividad();
    }
    else if (respuesta.equalsIgnoreCase("no")){
      Menu menu = new Menu();
      menu.menuPrincipal(nombreUsuario);
    }
    else{
      System.out.println("Disculpa, no has ingresado una respuesta válida.");
      repetir();
    }
  }

  public static String extraerInformacion(String nombreUsuario) {
    String informacionUsuario = "";
    try {
      File archivo = new File("informacion.txt");
      if (!archivo.exists()) {
        return informacionUsuario;
      }
      FileReader lector = new FileReader(archivo);
      BufferedReader buffer = new BufferedReader(lector);
      String linea;
      while ((linea = buffer.readLine()) != null) {
        String[] partes = linea.split(",");
        if (partes[0].equals(nombreUsuario)) {
          informacionUsuario += partes[1] + "\n";
        }
      }
      buffer.close();
      lector.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return informacionUsuario;
  }
}