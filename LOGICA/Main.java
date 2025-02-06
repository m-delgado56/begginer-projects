package LOGICA;

public class Main {
    public static void main(String[] args) {


Alumno alumno = new Alumno();
Alumno alumno1 = new Alumno(5 ,"sunga","castillo");
        System.out.println("la id del alumno 1 es " + alumno1.getId());
        System.out.println("nombre del alumno 1 es" + alumno1.getNombre());
        System.out.println("apellido del alumno 1 es " + alumno1.getApellido());

        alumno.setId(23);
        alumno.setNombre("migue");
        alumno.setApellido("wasa");
        System.out.println("----------------------------------------");

        System.out.println("la id del alumno  es " + alumno.getId());
        System.out.println("nombre del alumno  es " + alumno.getNombre());
        System.out.println("apellido del alumno  es " + alumno.getApellido());

        alumno1.setId(83492928);
        System.out.println("----------------------------------------");
        System.out.println("la id del alumno 1 es " + alumno1.getId());
        System.out.println("nombre del alumno 1 es" + alumno1.getNombre());
        System.out.println("apellido del alumno 1 es " + alumno1.getApellido());














    }








}