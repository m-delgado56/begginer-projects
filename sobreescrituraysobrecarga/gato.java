package sobreescrituraysobrecarga;

public  class gato extends animal1 {

    String raza;
    int edad;
    String nombre;

public gato() {
}

    @Override
    public void hacerSonido() {

    }

    public gato(String raza,String nombre,int edad) {
        this.raza = raza;
        this.edad=edad;
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
