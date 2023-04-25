//librerias
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Usuario {
  // atributos
  public String usuario;
  public String contrasena;

  // metodos
  public String getUsuario() {
    return usuario;
  }

  public String getContrasena() {
    return contrasena;
  }

  public void crearUsuario() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa un nombre de usuario: ");
    String usuario = scanner.nextLine();
    if (verificarUsuario(usuario)) {
      System.out.println("El usuario ya existe, por favor ingresar un usuario diferente.");
      crearUsuario();
    } else {
      System.out.print("Ingresa una contraseña: ");
      String contrasena = scanner.nextLine();
      this.usuario = usuario;
      this.contrasena = contrasena;
      guardarUsuario(usuario, contrasena);
    }
  }

  public static void guardarUsuario(String usuario, String contrasena) {
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter("UsuariosRegistrados.txt", true));
      writer.write(usuario + "," + contrasena + "\n");
      writer.close();
    } catch (IOException e) {
      System.out.println("Error al crear el usuario: " + e.getMessage());
    }
  }

  public static boolean verificarUsuario(String nombreUsuario) {
    try {
      BufferedReader reader = new BufferedReader(new FileReader("UsuariosRegistrados.txt"));
      String linea = reader.readLine();
      while (linea != null) {
        String[] partes = linea.split(",");
        if (partes[0].equals(nombreUsuario)) {
          return true;
        }
        linea = reader.readLine();
      }
      reader.close();
    } catch (IOException e) {
      System.out.println("Error al leer el archivo: " + e.getMessage());
    }
    return false;
  }

  public boolean verificarContrasena() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa tu nombre de usuario: ");
    String usuario = scanner.nextLine();
    System.out.print("Ingresa tu contraseña: ");
    String contrasena = scanner.nextLine();
    try {
      BufferedReader reader = new BufferedReader(new FileReader("UsuariosRegistrados.txt"));
      String linea = reader.readLine();
      while (linea != null) {
        String[] partes = linea.split(",");
        if (partes[0].equals(usuario) && partes[1].equals(contrasena)) {
          this.usuario = usuario;
          this.contrasena = contrasena;
          return true;
        }
        linea = reader.readLine();
      }
      reader.close();
    } catch (IOException e) {
      System.out.println("Error al leer el archivo: " + e.getMessage());
    }
    return false;
  }
}