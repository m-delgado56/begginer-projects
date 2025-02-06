package vehiculo;

public class moto extends vehiculo {
    int cilindraje;

public moto(){

}

    public moto(int km, String marca, int modelo) {
        super(km, marca, modelo);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;


    }
}