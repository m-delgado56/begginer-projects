


import java.util.Scanner;

import static java.lang.System.in;

public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int input = -1;

    while (input != 0) {
        System.out.println("Ingresa el número de una opción:");
        System.out.println("1. Calculadora");
        System.out.println("2. Hackear");
        System.out.println("0. Salir");

        input = in.nextInt();

        switch (input) {
            case 1:
                System.out.println("Calculadora");
                System.out.println("esta es una calculadora");
                System.out.println("ingresa el primer valor:");
                Scanner scanner1 = new Scanner(System.in);
                int valorA = scanner1.nextInt();
                System.out.println("ingrese el segundo valor:");
                int valorB = scanner1.nextInt();
                System.out.println("resultado:");
                System.out.println(valorA + valorB);

                break;
            case 2:
                System.out.println("Hackeando");
                break;
            case 0:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Hijo de puta, esa opción no existe.");
                break;
        }
    }
    mimetodo(" sunga ",20);
    mimetodo(" perra " ,14);


}




static void mimetodo(String nombre, int edad){
    System.out.println(" hola " + nombre+" tu edad es "+edad);



int resultado = suma(12,35, 32);
int resultado2= suma(12,1);
System.out.println(resultado);
String texto= suma();
    System.out.println(texto);
}


static int suma (int a, int b){
    return a + b;
}

static int suma (int a ,int b ,int c){
    return a+b+c;
}

static String suma (){
    return "hola sungas";
}






























































