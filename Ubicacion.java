//librerias
import paquete.IO;

public class Ubicacion{
//atributos
String destino;

//metodos
public Ubicacion(String destino){
  this.destino = destino;
}
  
public void go(){
  if (this.destino.equals("1")||this.destino.equalsIgnoreCase("idiomas")){
    System.out.println("Desde la portería de las Vegas, camina en línea recta 80 metros (105 pasos) hasta llegar a la plazoleta del estudiante, luego voltea a la derecha y camina 90 metros (118 pasos) hasta llegar a la biblioteca; voltea nuevamente a la derecha y camina 45 metros (60 pasos) hasta llegar a la esquina del bloque de la biblioteca. Gira a la izquierda y camina 80 metros (105 pasos) en línea recta. Verás que a tu derecha está el parqueadero y la rampa para subir al bloque de idiomas. Camina hasta la rampa, atraviesa el puente que se encuentra sobre la Avenidas Las Vegas y habrás llegado al bloque 1 o de Idiomas.");
  }
  else if (this.destino.equals("38")){
    System.out.println("Desde la portería de las Vegas, camina en línea recta 80 metros (105 pasos) hasta llegar a la plazoleta del estudiante, luego voltea a la derecha y camina 90 metros (118 pasos) hasta llegar a la biblioteca; voltea nuevamente a la derecha y camina 45 metros (60 pasos) hasta llegar a la esquina del bloque de la biblioteca. Gira a la izquierda y camina 60 metros (79 pasos) en línea recta donde encontrarás el café Converso. Aquí debes girar a la izquierda, caminar otros 40 metros (52 pasos) en línea recta y a tu mano izquierda encontrarás la entrada del bloque 38.");
  }
  else if (this.destino.equals("32")||this.destino.equalsIgnoreCase("biblioteca")){
    System.out.println("Desde la portería de las Vegas, camina en línea recta 80 metros (105 pasos) hasta llegar a la plazoleta del estudiante, luego voltea a la derecha y camina 90 metros (118 pasos) hasta llegar a la entrada de la biblioteca (bloque 32).");
  }
  else if (this.destino.equals("33")){
    System.out.println("Desde la portería de las Vegas, camina en línea recta 80 metros (105 pasos) hasta llegar a la plazoleta del estudiante, luego voltea a la derecha y camina 90 metros (118 pasos) hasta llegar a la biblioteca. Aquí debes voltear a mano izquierda y caminar 40 metros (52 pasos) en línea recta. Has llegado a la entrada del bloque 33.");
  }
  else if (this.destino.equals("34")){
    System.out.println("Desde la portería de las Vegas, camina en línea recta 80 metros (105 pasos) hasta llegar a la plazoleta del estudiante, luego voltea a la derecha y camina 90 metros (118 pasos) hasta llegar a la biblioteca. Aquí debes voltear a mano izquierda y caminar 40 metros (52 pasos) en línea recta. Voltea nuevamente a mano derecha y camina 25 metros (33 pasos) y a mano izquierda verás la entrada del bloque 34.");
  }
  else if (this.destino.equals("35")){
    System.out.println("Desde la portería de las Vegas, camina en línea recta 80 metros (105 pasos) hasta llegar a la plazoleta del estudiante, luego voltea a la derecha y camina 90 metros (118 pasos) hasta llegar a la biblioteca. Aquí debes voltear a mano izquierda y caminar 40 metros (52 pasos) en línea recta. Voltea nuevamente a mano derecha y camina 45 metros (59 pasos) y a mano izquierda verás la entrada del bloque 35.");
  }
  else if (this.destino.equals("29")||this.destino.equalsIgnoreCase("admisiones")){
    System.out.println("Desde la portería de las Vegas, camina en línea recta 115 metros (150 pasos). Voltea a la derecha y camina 10 metros (13 pasos) y habrás llegado al bloque 29 (Admisiones y Registros).");
  }
  else if (this.destino.equals("28")||this.destino.equalsIgnoreCase("auditorio fundadores")){
    System.out.println("Desde la portería de las Vegas, camina en línea recta 140 metros (184 pasos). Voltea a la derecha y camina 10 metros (13 pasos) y habrás llegado al bloque 28 (Auditorio Fundadores).");
  }
  else if (this.destino.equals("27")||this.destino.equalsIgnoreCase("auditorio fundadores")){
    System.out.println("Desde la portería de las Vegas, camina en línea recta 165 metros (216 pasos). Voltea a la derecha y camina 10 metros (13 pasos) y habrás llegado al bloque 27.");
  }
  else if (this.destino.equals("26")||this.destino.equalsIgnoreCase("auditorio fundadores")){
   System.out.println("Desde la portería de las Vegas, camina en línea recta 130 metros (170 pasos). Voltea a la izquierda y camina 30 metros (39 pasos), voltea nuevamente a mano derecha y camina 15 metros más (19 pasos) y estarás al frente de la entrada del bloque 26.");
  }
  else if (this.destino.equals("3")){
    System.out.println("Desde la portería de las Vegas, camina en línea recta 100 metros (131 pasos). A mano izquierda verás la entrada del bloque 3 (deportes).");
  }
  else if (this.destino.equals("18")){
    System.out.println("Desde la portería de las Vegas, camina en línea recta 135 metros (177 pasos), luego voltea a la izquierda y camina otros 45 metros (59 pasos) y estarás en el bloque 18.");
  }
  else if (this.destino.equalsIgnoreCase("cafeteria")||this.destino.equalsIgnoreCase("cafetería")){
    System.out.println("Desde la portería de las Vegas, camina en línea recta 110 metros (144 pasos), luego voltea a la izquierda y camina 80 metros (105 pasos). A mano izquierda verás la cafetería.");
  }
  else if (this.destino.equals("17")){
    System.out.println("Desde la portería de las Vegas, camina en línea recta 110 metros (144 pasos), luego voltea a la izquierda y camina 95 metros (125 pasos). Voltea a mano derecha y camina otros 15 metros (20 pasos) y a mano izquierda verás la entrada del bloque 17.");
  }
  else if (this.destino.equals("16")){
    System.out.println("Desde la portería de las Vegas, camina en línea recta 110 metros (144 pasos), luego voltea a la izquierda y camina 130 metros (170 pasos). A mano derecha verás la entrada del bloque 16.");
  }
  else if (this.destino.equals("15")){
    System.out.println("Desde la portería de las Vegas, camina en línea recta 110 metros (144 pasos), luego voltea a la izquierda y camina 155 metros (203 pasos). A mano derecha verás la entrada del bloque 15.");
  }
  else if (this.destino.equals("14")){
    System.out.println("Desde la portería de las Vegas, camina en línea recta 110 metros (144 pasos), luego voltea a la izquierda y camina 175 metros (230 pasos). A mano derecha verás la entrada del bloque 14.");
  }
  else if (this.destino.equals("13")){
    System.out.println("Desde la portería de las Vegas, camina en línea recta 110 metros (144 pasos), luego voltea a la izquierda y camina 195 metros (255 pasos). A mano derecha verás la entrada del bloque 13.");
  }
  else if (this.destino.equals("19")||this.destino.equalsIgnoreCase("bloque de ingenieria")||this.destino.equalsIgnoreCase("bloque de ingeniería")){
    System.out.println("Desde la portería de las Vegas, camina en línea recta 110 metros (275 pasos). Habrás llegado a un parqueadero y debes voltear a la derecha (verás que hay una caseta de Subway) y caminar 90 metros (118 pasos). Al llegar, estarás al frente de la entrada del bloque 19 o Bloque de Ingeniería.");
  }
  else if (this.destino.equals("21")){
    System.out.println("Desde la portería de las Vegas, camina en línea recta 110 metros (275 pasos). Habrás llegado a un parqueadero y debes voltear a la derecha (verás que hay una caseta de Subway) y caminar 90 metros (118 pasos). Al llegar, estarás al frente de la entrada del bloque 19. Aquí debes voltea nuevamente a mano derecha y camina 35 metros (45 pasos) y a mano izquierda verás la entrada del bloque 21.");
  }
  else if (this.destino.equals("12")){
    System.out.println("Desde la portería de las Vegas, camina en línea recta 110 metros (275 pasos). Habrás llegado a un parqueadero y debes voltear a la derecha (verás que hay una caseta de Subway). Camina 45 metros (59 pasos) hasta pasar Subway y luego debes voltear a mano izquierda y caminar otros 70 metros (92 pasos), cruzando el parqueadero. Al llegar te encontrarás frente a la entrada del bloque 12.");
  }
  else{
    System.out.println("Disculpa, no has ingresado un número de bloque válido. Inténtalo nuevamente.");
  }
}
}