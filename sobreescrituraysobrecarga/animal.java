package sobreescrituraysobrecarga;

public class animal {



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

    public animal(int id_animal, String descripcion) {
        this.id_animal = id_animal;
        this.descripcion=descripcion;
    }
    public void hacersonido(){
        System.out.println("el animal hace un sonido");
    }
public void hacersonido(String nombreanimal){
    System.out.println("el animal "+ nombreanimal+ "hace un sonido" );
}
public void  hacersonido (String nombreanimal, String tiposonio){
    System.out.println("el animal "+ nombreanimal + " hace un sonido de tipo "+ tiposonio);
}








}
