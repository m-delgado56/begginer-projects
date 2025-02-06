

import java.util.Scanner;

import static java.lang.System.in;

class asa {
        public static void main(String[] args) {

                class wenas {

                        Scanner scanner =new Scanner(in);

                        String action = scanner.toString().toLowerCase();

                        {switch (action) {
                                case "calculadora":
                                        System.out.println("esta es una calculadora");
                                        System.out.println("ingresa el primer valor:");
                                        Scanner scanner1 = new Scanner(in);
                                        int valorA = scanner1.nextInt();
                                        System.out.println("ingrese el segundo valor:");
                                        int valorB = scanner1.nextInt();
                                        System.out.println("resultado:");
                                        System.out.println(valorA + valorB);


                                case "hackear la nasa:":
                                        System.out.println("hackeando la nasa" +
                                                "#####" +
                                                "###" +
                                                "#" +
                                                "hackeaste la nasa");
                                case "salir":
                                        break;



















                         }
                        }
                }
        }
}