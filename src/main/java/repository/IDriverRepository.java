package repository;

/**
 * IDriverRepository.java
 * @author: Gilberto Silva (218239300)
 * Date: 08 April 2023
 */

import domain.Driver;
import java.util.Set;

public interface IDriverRepository extends IRepository <Driver, String>{
    public Set<Driver> getAll();

}
