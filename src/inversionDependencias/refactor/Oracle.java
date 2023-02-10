package inversionDependencias.refactor;

import inversionDependencias.refactor.IPersistence;

public class Oracle implements IPersistence {
    public void save(Object object){
        System.out.println("Save...ok");
    }
}
