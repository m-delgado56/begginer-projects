package Herencia;

public class Empleao extends persona{
/*metodos*/
    int num_legajo;
    String cargo;
    double sueldo;

    public Empleao() {

    }

    public void persona(){
    }
/*constructores*/

    public Empleao(int id, String dni, String nombre, String apellido, String domicilio,
                     String telefono,int num_legajo,String cargo, double sueldo,int edad) {
        super(id, dni, nombre, apellido, domicilio, telefono,edad);
        this.num_legajo=num_legajo;
        this.sueldo = sueldo;
        this.cargo= cargo;
    }
/*setters and getters*/
    public int getNum_legajo() {
        return num_legajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setNum_legajo(int num_legajo) {
        this.num_legajo = num_legajo;

    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}
