package inversionDependencias.refactor;

import inversionDependencias.refactor.IPersistence;
import inversionDependencias.refactor.Person;

public class ServicePerson {
    private IPersistence persistence;
    public ServicePerson(){}

    public ServicePerson(IPersistence persistence) {
        this.persistence = persistence;
    }

    public void savePerson( Person person){
        persistence.save(person);
    }
}
