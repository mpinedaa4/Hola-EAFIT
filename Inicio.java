//librerias
import paquete.IO;

class Inicio{
  //atributos
  String respuesta;

  //metodos
  public void saludo(){
    System.out.println("¡Bienvenido a Hola EAFIT!");
    this.respuesta = IO.leerTexto("¿Es tu primera vez usando la aplicación?");
    Usuario nuevoUsuario = new Usuario();
    if (this.respuesta.equalsIgnoreCase("si")){
      nuevoUsuario.crearUsuario();
      Menu menu = new Menu ();
      menu.menuPrincipal(nuevoUsuario.usuario);
    }
    else if (this.respuesta.equalsIgnoreCase("no")){
      if (nuevoUsuario.verificarContrasena()){
        System.out.println ("¡Bienvenido!");
        Menu menu = new Menu();
        menu.menuPrincipal(nuevoUsuario.usuario);
      }
    else{
        System.out.println("Usuario y/o contraseña incorrecto(s).");
        saludo();
      }
    }
    else{
      System.out.println("Disculpa, no he entendido tu respuesta.");
      saludo();
    }
  }
}