import java.util.Scanner;
/**
 *  4. Ejercicio sobre divisibilidad
 *   Ingresa un número a través de la consola y ten listo 9 condicionales if para verificar si es divisible entre 1,
 *   entre 2, entre 3, entre 4. Puedes hacerlo con if's separados para verificar todos los casos de divisibilidad
 */


import static java.lang.System.in;

class numberr {
    public static void main(String[] args) {

        Scanner scanner0 = new Scanner(in);


        for (int i = 0; i < 20; i++) {

            System.out.println();

            int numero1 = scanner0.nextInt();
            if (numero1 % 1 == 0) {
                System.out.println("si es");break;
            } else System.out.println("no es");

            if (numero1 % 2 == 0) {
                System.out.println("si es");break;
            } else System.out.println("no es");

            if (numero1 % 3 == 0) {
                System.out.println("si es");
            } else System.out.println("no es");

            if (numero1 % 4 == 0) {
                System.out.println("si es");break;
            } else System.out.println("no es");

        }


    }




}
