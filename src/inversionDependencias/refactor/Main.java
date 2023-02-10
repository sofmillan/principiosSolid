package inversionDependencias.refactor;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        MySql mysql = new MySql();
        mysql.save(person);
        Oracle oracle = new Oracle();
        oracle.save(person);
    }
}
