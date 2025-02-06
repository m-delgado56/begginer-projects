package vehiculo;

public class bus extends vehiculo{
    int capacidad;




    public bus(int km, String marca, int modelo) {
        super(km, marca, modelo);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
