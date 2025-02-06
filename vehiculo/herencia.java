package vehiculo;

public class herencia {
    public static void main(String[] args) {

        moto moto0= new moto(20000,"bwm",203);
        moto moto1= new moto();
        moto1.setCilindraje(1000);
        System.out.println(moto1.getCilindraje());
        bus bus= new bus(5000,"volvo",2000);

        carro carro =new carro(40000,"mazda",2010);
        System.out.println(bus.getModelo());




















    }

}
