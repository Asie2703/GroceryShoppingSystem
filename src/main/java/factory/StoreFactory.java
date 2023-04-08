/**
 * StoreFactory.java
 * This is a factory class for store entity
 * @author Asive Sibeko 219475296
 * 03 April 2023
 */

package factory;

import domain.Store;
import util.Helper;

public class StoreFactory {

    public static Store createStore(String storeName, String storeAddress, String storeDescription) {

        if (Helper.isNullorEmpty(storeName) || Helper.isNullorEmpty(storeAddress))
            return null;
        ;
        String storeId = Helper.generateId();
        Store store = new Store.Builder().setStoreId(storeId)
                .setStoreName(storeName)
                .setStoreAddress(storeAddress)
                .setStoreDescription(storeDescription)
                .build();
        return store;
    }
}