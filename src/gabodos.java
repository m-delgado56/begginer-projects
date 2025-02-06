import java.util.Scanner;

import static java.lang.System.in;

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int input = -1;
    String nombre = "";
    int edad = 0 ;
    while (input != 6) {
        System.out.println("Ingresa el número de una opción:");
        System.out.println("1. Calculadora");
        System.out.println("2. saludo perrsonalizado ");
        System.out.println("3. contador numeros pares");
        System.out.println("4 crear usuario");
        System.out.println("5 cambiar nombre de usuario");
        System.out.println("6 salir ");

        Scanner scanner1 = new Scanner(System. in);
        input = in.nextInt();

        switch (input) {
            case 1:
                while (input != 0) {
                    System.out.println("1 suma");
                    System.out.println("2 resta");
                    System.out.println("3 multiplicacion");

                    input = in.nextInt();

                    switch (input) {
                        case 1:

                            System.out.println("suma");
                            System.out.println("ingresa el primer valor:");
                            int valorA = scanner1.nextInt();
                            System.out.println("ingrese el segundo valor:");
                            int valorB = scanner1.nextInt();
                            System.out.println("resultado:");
                            System.out.println(valorA + valorB);
                            break;
                        case 2:

                            System.out.println("resta");
                            System.out.println("ingresa el primer valor:");
                            int valorc = scanner1.nextInt();
                            System.out.println("ingrese el segundo valor:");
                            int valord = scanner1.nextInt();
                            System.out.println("resultado:");
                            System.out.println(valorc - valord);
                            break;
                        case 3:

                            System.out.println("multiplicacion");
                            System.out.println("ingresa el primer valor:");
                            int valore = scanner1.nextInt();
                            System.out.println("ingrese el segundo valor:");
                            int valorf = scanner1.nextInt();
                            System.out.println("resultado:");
                            System.out.println(valore * valorf);
                            break;
                    }
                }

                break;
            case 2:
                System.out.println("hola  "+ nombre +"  tienes "+edad+
                        " años "+"signica que has vivido "
                        + edad*365+ " dias" );
                break;
            case 3:
                System.out.println("escribe un numero");
                Scanner scanner = new Scanner(System.in);
                int numero = scanner.nextInt();
                if (numero % 2 == 0) {
                    System.out.println("Es par");
                } else System.out.println("es impar");
                if (numero % 3 == 0 && numero % 4 == 0) {
                    System.out.println("es divisible por 3 y por 4");
                } else if (numero % 4 == 0) {
                    System.out.println("es divisible por 4");
                } else if (numero % 3 == 0) {
                    System.out.println(" es divisible por 3");

                }

                break;
            case 4:
                System.out.println(" hola usuario");
                System.out.println("ingresa tu nombre ");
                nombre = scanner1.nextLine();
                System.out.println("ahora edad");
                edad= scanner1.nextInt();
                break;

            case 5:
                System.out.println("hola " + nombre);
                System.out.println("cual sera tu nuevo nombre");
                System.out.println("ingresa nuevo nombre:");
                nombre = scanner1.next();

            case 6:
            default:
                System.out.println("Hijo de puta, esa opción no existe.");
                break;

        }

    }
}

