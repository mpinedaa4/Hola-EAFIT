//librerias
import java.util.Random;

public class Clima{
  //atributos
  int clima;
  int lluvia;

  //metodos
  public void verClima(){
    Random random = new Random();
    this.clima = random.nextInt(35-20)+20;
    this.lluvia = random.nextInt(100);
    System.out.println("El clima en la universidad actualmente es de " + clima + "°C");
    System.out.println("La probabilidad de lluvia es de " + lluvia + "%");
  }
}