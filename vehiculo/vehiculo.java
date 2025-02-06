package vehiculo;

public abstract class vehiculo {
   private int km ;
  private  String marca;
    private int modelo;

    public vehiculo() {
    }

    public vehiculo(int km,String marca,int modelo) {
        this.km = km;
        this.marca=marca;
        this.modelo=modelo;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }


    public String getMarca() {
        return marca;
    }

    public void acelerar (){

    }

}
