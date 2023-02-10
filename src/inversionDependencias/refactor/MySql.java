package inversionDependencias.refactor;

import inversionDependencias.refactor.IPersistence;

public class MySql implements IPersistence {

    public void save(Object object){
        System.out.println("Save...ok --->Mysql");
    }
}
