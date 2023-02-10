package sustitucionLiskov;

public class Nino extends Persona{
    public Nino( String nombre, String apellidos) {
        super(null, nombre, apellidos, null);
    }

    @Override
    public void pagar(){
        throw new RuntimeException("Un niño no puede pagar");
    }


}
