package inversionDependencias.refactor;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        MySql mysql = new MySql();
        Oracle oracle = new Oracle();
        ServicePerson servicePersonMysql = new ServicePerson(mysql);
        servicePersonMysql.savePerson(person);

        ServicePerson servicePersonOracle = new ServicePerson(oracle);
        servicePersonOracle.savePerson(person);
    }
}
