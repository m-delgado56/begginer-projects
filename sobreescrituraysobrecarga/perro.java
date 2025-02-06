package sobreescrituraysobrecarga;

public class  perro extends animal1 {

    private String nombrePerro;
    private double peso;
    private String raza;
    private String sexo;


    public perro(int id_animal, String descripcion,String nombrePerro, double peso,String raza, String sexo) {
        super(id_animal, descripcion);
        this.nombrePerro=nombrePerro;
        this.peso=peso;
        this.raza=raza;
        this.sexo=sexo;
    }

    @Override
    public void hacerSonido() {
        System.out.println("soy un perro y hago ");

    }
}
