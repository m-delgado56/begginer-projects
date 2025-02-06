package vehiculo;

public class carro extends vehiculo{
    int motor;
    public carro(){

    }

    public carro (int km, String marca, int modelo) {
        super(km, marca, modelo);
        this.motor = motor;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }
}
