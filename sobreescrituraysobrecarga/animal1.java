package sobreescrituraysobrecarga;

public abstract class animal1 {
    public animal1() {

    }

    public static void main(String[] args) {

    }

    private int id_animal;
    private String descripcion;

    public int getId_animal() {
        return id_animal;
    }

    public void setId_animal(int id_animal) {
        this.id_animal = id_animal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public animal1(int id_animal, String descripcion) {
        this.id_animal = id_animal;
        this.descripcion= descripcion;
    }


    public abstract void hacerSonido();





}
