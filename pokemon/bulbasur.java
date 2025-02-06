package pokemon;

public class bulbasur extends pokemon implements planta {

    public bulbasur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("hola soy bulbasur y este ees mi ataque placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("hola soy bulbasur y este ees mi ataque arañazo");
    }

    @Override
    protected void atacarMordizco() {
        System.out.println("hola soy bulbasur y este ees mi ataque mordizco");
    }

    @Override
    public void atacar_parañizar() {
        System.out.println("hola soy bulbasur y este ees mi ataque paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("hola soy bulbasur y este ees mi ataque drenaje");
    }

    @Override
    public void atacarHohjaafilada() {
        System.out.println("hola soy bulbasur y este ees mi ataque hoja afilada");
    }

    @Override
    public void atacarLatigocepal() {
        System.out.println("hola soy bulbasur y este ees mi ataque latigo cepal");
    }
}
