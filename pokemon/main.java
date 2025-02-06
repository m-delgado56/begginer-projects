package pokemon;

public class main {
    public static void main(String[] args) {

squirtle squirtle= new squirtle();
pikachu pikachu = new pikachu();
charmander charmander= new charmander();
bulbasur bulbasur= new bulbasur();

squirtle.atacarArañazo();
squirtle.atacarPistoladeagua();
pikachu.atacarMordizco();
pikachu.atacarPuñotrueno();

pikachu.setNombre_pokemon("pikachu");
        System.out.println(pikachu.getNombre_pokemon());
    }
}
