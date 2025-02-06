import com.sun.security.jgss.GSSUtil;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class Main {
    public static void main(String[] args) {
        Scanner scanner3 = new Scanner(in);
        System.out.println("ve ya son las 8? ");
        System.out.println("noc peramee veo");
        int hora = scanner3.nextInt();
        if (hora == 8) {
            System.out.println("si ve si son las 8");
            ;
        } else System.out.println("nonas no son las 8");


//tipos primitivos
        int numeroGrande = 10000;
        float age = 16.5f;
        boolean isactive = true;
        String text = "hola mundo";
//variables primitivas
        System.out.println(isactive);
        System.out.println(numeroGrande);
        System.out.println(age);
        int largo = text.length();
        System.out.println(largo);
        String texto = text.replace("hola", "Chao");
        System.out.println(texto);
        System.out.println(texto.endsWith("undo"));
        System.out.println(texto.startsWith("Ch"));
        System.out.println(texto.contains("und"));
        System.out.println(texto.indexOf("mund"));
//caracteres de escape
        System.out.println(text.toLowerCase(Locale.ROOT));
        System.out.println(text.toUpperCase(Locale.ROOT));
        String malo = "    chanchito feliz    ";
        System.out.println(malo.trim());
        System.out.println(malo);

        String melo = "hola \"Mundo\"";
        System.out.println(melo);
        String singa = "\\hola \"Mundo\"";
        System.out.println(singa);
        String lol = "hola \nMundo";
        System.out.println(lol);
        String q = "hola \tMundo";
        System.out.println(q);
//arrays
        int[] numeros = new int[5];
        numeros[0] = 5;
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(numeros));
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        int[] Numeros = {0, 1, 2, 3, 4};
        System.out.println(Arrays.toString(Numeros));

//multiples dimeensiones
        int[][][] que = new int[3][2][2];
        que[0][0][0] = 5;
        System.out.println(Arrays.deepToString(que));
//constantes
        final String empresa = "hola mundo limited";

        /**
         * sapetinpapilinsumnama
         */
//operadores aritmeticos
        int a = 2 + 2;
        int b = 2 - 2;
        int c = 3 * 3;
        int m = 4 % 3;
        float d = 10f / 3f;
        int x = 5;
        x += 5;
        System.out.println(d);

/**
 * PEMDAS
 */
        int se = (5 + 3) * 2;
        System.out.println(se);
//conversion implicita
        byte l = 1;
        int p = 15;
        int t = l + p;
/**
 * no se puede hacer la operacion con double o float
 */
//conversion de tipos
        System.out.println(t);
        //conversion explicita
        int j = 15;
        double v = 15.015;
        //  int z = j+v; (no se puede ejecutar)
        int r = (int) (j + v);
        System.out.println(r);

        String f = "1.1";
        double e = 5;
        double er = Double.parseDouble(f) + e;
        //Byte.parseByte(integer)(short)(long)(float)
        System.out.println(er);
//clase math
        System.out.println(Math.abs(-15));
        System.out.println(Math.ceil(10.0000003));
        System.out.println(Math.floor(10.999999));
        System.out.println(Math.max(16, 48));
        System.out.println(Math.min(16, 49));
        System.out.println(Math.round(15.5));
        double ramdon = Math.random();
//        System.out.println(ramdon);
        //   System.out.println(ramdon*100);
        System.out.println((int) (ramdon * 100));
//formato de numeros
        Locale locale = Locale.forLanguageTag("es.CO");
        //   NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String result = numberFormat.format(1099.90);
        System.out.println(result);

        NumberFormat porcentaje = NumberFormat.getPercentInstance();
        System.out.println(porcentaje.format(0.15));

        //clase scanner
        //Scanner scanner= new Scanner(System.in);
        //  String valor = scanner.next();
        // String valor = scanner.nextLine();
        // System.out.println("ingresa tu edad:");
        // byte valor = scanner.nextByte();

        // System.out.println("tu edad es:");
        // System.out.println(valor);
/**
 * crearuna calculador que reciba 2 numero y que luego
 * imprima el resultado de la suma
 * de estos dos numeros
 */
        System.out.println("esta es una calculadora");
        System.out.println("ingresa el primer valor:");
        Scanner scanner1 = new Scanner(in);
        int valorA = scanner1.nextInt();
        System.out.println("ingrese el segundo valor:");
        int valorB = scanner1.nextInt();
        System.out.println("resultado:");
        System.out.println(valorA + valorB);

        /**
         * operadores logicos =PPPP
         */
        boolean aa = true;
        boolean bb = false;

        boolean cc = aa && bb;
        boolean xx = !aa;
        System.out.println(cc);
        ;
        System.out.println(xx);

        /**
         * operadores ternarios
         */
        int edad = 17;
        String mensaje = edad > 17 ? "puede votar" : "no puede votar";
        System.out.println(mensaje);


//switch
        String action = "naa";

        switch (action) {
            case "agregar":
                System.out.println("sape");
                break;
            case "eliminar:":
                System.out.println("supa");
            default:
                System.out.println("sapeeeeee");
        }


//aplicacion terminal
        String inpunt = "";
        while (!inpunt.equals("salir")) {
            System.out.println("ingresa palabra");
            inpunt = scanner1.next().toLowerCase();
            System.out.println(inpunt);
        }
        System.out.println("saliendo sapaSS");

//do while
        int ii = 2;
        do {
            System.out.println(ii);
            ii++;
        } while (ii > 5);


        String lala = "";
        while (true) {
            System.out.println("ingresarr comando");
            lala = scanner1.next().toLowerCase();
            if (lala.equals("salir")) {

            }
            if (lala.equals("continuar")) {

            }
            System.out.println("esta linea no se ejecuta");
        }}}











