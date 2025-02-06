package Herencia;

public class consultor extends persona{
    int num_consultor;
    String nombre_consultora;

    public consultor() {
    }

    public consultor(int id, String dni, String nombre, String apellido, String domicilio, String telefono
            ,String nombre_consultora, int num_consultor,int edad) {

        super(id, dni, nombre, apellido, domicilio, telefono,edad);
        this.num_consultor = num_consultor;
        this.nombre_consultora = nombre_consultora;
    }

    public int getNum_consultor() {
        return num_consultor;
    }

    public void setNum_consultor(int num_consultor) {
        this.num_consultor = num_consultor;
    }

    public String getNombre_consultora() {
        return nombre_consultora;
    }

    public void setNombre_consultora(String nombre_consultora) {
        this.nombre_consultora = nombre_consultora;
    }
}
