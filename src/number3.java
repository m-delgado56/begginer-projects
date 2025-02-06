import java.awt.im.InputContext;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * 3. Ejercicio sobre un menú sencillo
 *   Hacer un menú sencillo que muestre dos opciones. La primera es para saludar y la segunda para despedirse.
 *   Hacer un scanner que te permita ingresar un número y luego tener un if / y un else if para verificar que opción ingresaste.
 *   Si ingresaste la opción de saludar,
 *   imprime un saludo. Si ingresaste la otra opción, imprime una despedida. Adicionalmente puedes crear una
 *   tercera opción que sea un else (que no esté en el menú),
 */

public class number3 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int despedirse = 2;
        int opcion;
        {
            System.out.println("1. saludar");
            System.out.println("2. despedirse");


            System.out.println("Escribe una de las opciones");
             opcion = numero.nextInt();

             switch (opcion) {
                    case 1:
                        System.out.println("saludar");
                        break;

                    case 2:
                        System.out.println("despedirse");
                }
            }

            }
        }















