import java.util.Scanner;
/**
 *
 * @author jesus
 */
public class NumeroAleatorio {

   public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);

 int a = (int) ((Math.random() * 100)+1); 
 int b; 
 int i; 

 System.out.println("Elabore un programa en cualquier lenguaje que elija un número aleatorio n entre 1 y 100. "
         + "El programa dará al usuario 5 oportunidades para adivinar el número: en cada oportunidad, el usuario "
         + "ingresará su respuesta y el programa indicará si la respuesta es menor, mayor, igual a n (en cuyo caso "
         + "el usuario habrá ganado). Después de 5 intentos el usuario no ha adivinado, entonces habrá perdido el juego.");

 System.out.print("Tienes solo 5 intentos por favor adivine el numero n entre el 1 y 100: ");
 b = sc.nextInt();

 for (i=0; i<=4; i++) { 

    
    if (a == b) {  
      System.out.println("Correcto"); 
      break; } 
     
    else if (i == 4) { 
      System.out.println("Sin intentos, el numero es aleatorio es: " + a); 
      break; } 
    
    else if (a > b) 
      System.out.println("El número n es mayor ");
    else if (a < b)
      System.out.println("El número n es menor ");    
    if (i <=1) { 
     System.out.print("Siguente intento: "); 
     b = sc.nextInt(); } 
    else if (i ==2) { 
    int x = (int) (a/10);
    System.out.print("Inténtalo de nuevo: ");
    b = sc.nextInt(); } 
   else if (i >= 3) {
   System.out.print("Este es su utimo intento escoja con cuidado: ");
   b = sc.nextInt(); }
    }
  }
    
}
