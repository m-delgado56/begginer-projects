package sobreescrituraysobrecarga;

public  class lol extends  animal1 {
    public static void main(String[] args){

      gato gato = new gato("feo","sapa",32);
      gato gato1 = new gato();
      gato1.setRaza("belong");
      gato1.setEdad(23);
gato1.setDescripcion("pendejo");
gato1.setNombre("sapaputa");
        System.out.println(gato.getEdad());
        System.out.println(gato1.getEdad());
        System.out.println(gato1.getRaza());
        System.out.println(gato1.getNombre());


    }

    @Override
    public void hacerSonido() {

    }


}
