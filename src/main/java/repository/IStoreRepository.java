/**
 * StoreRepository.java
 * This is a repository interface for Store entity
 * @author Asive Sibeko 219475296
 * 08 April 2023
 */

package repository;

import domain.Store;

import java.util.Set;

public interface IStoreRepository extends IRepository<Store, String>{

    public Set<Store> getAll();


}
