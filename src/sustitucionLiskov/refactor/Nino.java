package sustitucionLiskov.refactor;

public class Nino extends Persona{

    private Adulto adulto;

    public Nino(String nombre, String apellidos, Adulto adulto) {
        super(nombre, apellidos);
        this.adulto = adulto;
    }

    public Adulto getAdulto() {
        return adulto;
    }
}
