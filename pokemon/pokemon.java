package pokemon;

public abstract class pokemon {
    protected int num_pokemon;

    protected String nombre_pokemon;

    protected int peso_pokemon;

    protected String sexo_pokemon;

    protected int temporada;

    protected String tipo;


    protected abstract void atacarPlacaje() ;


    protected abstract void atacarArañazo() ;


    protected abstract void atacarMordizco() ;

        public String getTipo() {

        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public String getSexo_pokemon() {
        return sexo_pokemon;
    }

    public void setSexo_pokemon(String sexo_pokemon) {
        this.sexo_pokemon = sexo_pokemon;
    }

    public int getPeso_pokemon() {
        return peso_pokemon;
    }

    public void setPeso_pokemon(int peso_pokemon) {
        this.peso_pokemon = peso_pokemon;
    }

    public int getNum_pokemon() {
        return num_pokemon;
    }

    public void setNum_pokemon(int num_pokemon) {
        this.num_pokemon = num_pokemon;
    }

    public String getNombre_pokemon() {
        return nombre_pokemon;
    }

    public void setNombre_pokemon(String nombre_pokemon) {
        this.nombre_pokemon = nombre_pokemon;
    }
}



