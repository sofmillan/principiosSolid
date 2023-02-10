package sustitucionLiskov;

public class Persona {
    private String dni;
    private String nombre;

    private String apellidos;

    private String tarjeta;

    public Persona(String dni, String nombre, String apellidos, String tarjeta) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tarjeta = tarjeta;
    }

    public void pagar(){
        System.out.println("La persona está pagando");
    }
}
