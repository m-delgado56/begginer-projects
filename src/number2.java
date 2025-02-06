import java.util.Scanner;
import java.util.SortedMap;
///2. Ejercicio sobre año bisiesto (hacerlo sin ver lo que ya realizamos)
    //     Descripción: Este ya sabes cómo es B)
import static java.lang.System.in;
import static java.lang.System.setOut;
class number2 {
    public static void main(String[] args) {
        Scanner scanner0 = new Scanner(in);
        System.out.println("Ve gabo sabes que año es ??");

        String respuesta = scanner0.next();

        System.out.println("Sabes si este año es bisiesto");



int año= scanner0.nextInt();
        if (año % 4==0  ){
            System.out.println("si es");
            if (año % 100==0){
                System.out.println("si es");
                if (año % 400== 0){System.out.println("si es");




                } else {
                    System.out.println("no es");
                }
            } else {
                System.out.println("no es");

            }
        } else {
            System.out.println("no es");

        }









    }
}
