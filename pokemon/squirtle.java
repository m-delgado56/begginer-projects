package pokemon;

public class squirtle extends pokemon implements agua {

    public squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("hola soy squirtle y este ees mi ataque placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("hola soy squirtle y este ees mi ataque Arañazo");
    }

    @Override
    protected void atacarMordizco() {
        System.out.println("hola soy squirtle y este ees mi ataque Mordizco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("hola soy squirtle y este ees mi ataque hidrobomba");
    }

    @Override
    public void atacarPistoladeagua() {
        System.out.println("hola soy squirtle y este ees mi ataque pistola de agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("hola soy squirtle y este ees mi ataque burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("hola soy squirtle y este ees mi ataque hidropulso");
    }
}
