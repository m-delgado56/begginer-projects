package LOGICA;

public class Alumno {
    int id;
    String nombre;
    String apellido;

    public Alumno(int id,String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Alumno() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void mostrarNombre(){
        System.out.println("hola soy alumno y digo mi nombre");
    }
public void saberAprobao(double calificacion){
        if (calificacion >6 ) {
            System.out.println("si aprobe");
        }

}






}

