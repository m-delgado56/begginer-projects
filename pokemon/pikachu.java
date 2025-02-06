package pokemon;

public class pikachu extends pokemon implements electrico {

    public pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("hola soy pikachu y este ees mi ataque placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("hola soy pikachu y este ees mi ataque Arañazo");
    }

    @Override
    protected void atacarMordizco() {
        System.out.println("hola soy pikachu y este ees mi ataque Mordizco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("hola soy pikachu y este ees mi ataque impactrueno");
    }

    @Override
    public void atacarPuñotrueno() {
        System.out.println("hola soy pikachu y este ees mi ataque puño de trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("hola soy pikachu y este ees mi ataque rayo");
    }

    @Override
    public void ataqueRayocarga() {
        System.out.println("hola soy pikachu y este ees mi ataque rayo de carga");
    }
}
