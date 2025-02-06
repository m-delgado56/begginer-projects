import java.util.Scanner;
/*
 * 1. Ejercicio sobre número par o impar
 *   Descripción: Haz un programa que te pida un número y te retorne un mensaje de si es un número par o un número impar.
 *   La revisión de si es par o impar se hace a través de un if y un else.
 */
import static java.lang.System.in;
import static java.lang.System.setOut;
class number1 {
    public static void main(String[] args) {
        Scanner scanner0 = new Scanner(in);

          System.out.println(" de estos numeros (del 1 al 40 ) que numeros son pares o Impares? ");

              int numero =scanner0.nextInt();{
                if (numero % 2 == 0) {
                   System.out.println ("Es par");
                 } else System.out.println("es impar");
                if (numero % 3 == 0 && numero % 4== 0) {
                    System.out.println("es divisible por 3 y por 4");
                } else if (numero % 4 == 0 ) {
                    System.out.println("es divisible por 4");
                }else if (numero % 3 == 0){
                    System.out.println(" es divisible por 3");;
                }















            }

        }

}