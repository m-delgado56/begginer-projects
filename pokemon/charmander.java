package pokemon;

public class charmander extends pokemon implements fuego  {

    public charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("hola soy charmander y este ees mi ataque placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("hola soy charmander y este ees mi ataque arañazo");
    }

    @Override
    protected void atacarMordizco() {
        System.out.println("hola soy charmander y este ees mi ataque mordizco");
    }

    @Override
    public void atacarPuñofuego() {
        System.out.println("hola soy charmander y este ees mi ataque puño de fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("hola soy charmander y este ees mi ataque ascuas");
    }

    @Override
    public void atacarrLanzallamas() {
        System.out.println("hola soy charmander y este ees mi ataque lanzallamas");
    }
}
