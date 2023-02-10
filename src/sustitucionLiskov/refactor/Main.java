package sustitucionLiskov.refactor;

public class Main {
    public static void main(String[] args) {
        Adulto adulto = new Adulto("Camila","Torres","123456","123-45-56");
        Nino nino = new Nino("Juan","Gomez", adulto);

        nino.getAdulto().pagar();
    }
}
