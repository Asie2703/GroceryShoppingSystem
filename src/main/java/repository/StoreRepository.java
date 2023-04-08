
/**
 * StoreRepository.java
 * This is a repository class for Store entity
 * @author Asive Sibeko 219475296
 * 08 April 2023
 */
package repository;

import domain.Store;

import java.util.HashSet;
import java.util.Set;

public class StoreRepository implements IStoreRepository{

    private static StoreRepository repository = null;
    private Set<Store> storeDB = null;

    private StoreRepository(){
        storeDB = new HashSet<Store>();
    }
    public static StoreRepository getRepository(){
        if (repository == null){
            repository = new StoreRepository();
        }
        return repository;
    }
    @Override
    public Store create(Store store) {
        boolean success = storeDB.add(store);
        if (!success)
            return null;
        return store;

    }

    @Override
    public Store read(String storeId) {
        Store store = storeDB.stream()
                .filter(s -> s.getStoreId().equals(storeId))
                .findAny()
                .orElse(null);
        return store;
    }

    @Override
    public Store update(Store store) {

        Store oldStore = read(store.getStoreId());
        if (oldStore != null){
            storeDB.remove(oldStore);
            storeDB.add(store);
            return store;
        }
        return null;

    }

    @Override
    public boolean delete(String storeId) {
        Store storeToDelete = read(storeId);
        if (storeToDelete == null)
            return false;
        storeDB.remove(storeToDelete);
                return true;
    }

    @Override
    public Set<Store> getAll() {

        return storeDB;
    }
}
