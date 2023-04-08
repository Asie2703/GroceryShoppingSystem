/**
 * ProductRepository.java
 * This is a repository class for Product entity
 * @author Asive Sibeko 219475296
 * 08 April 2023
 */

package repository;

import domain.Product;
import domain.Store;

import java.util.HashSet;
import java.util.Set;

public class ProductRepository implements IProductRepository{
    private static ProductRepository repository = null;
    private Set<Product> productDB = null;

    private ProductRepository(){
        productDB = new HashSet<Product>();
    }
    public static ProductRepository getRepository(){
        if (repository == null){
            repository = new ProductRepository();
        }
        return repository;
    }
    @Override
    public Product create(Product product) {
        boolean success = productDB.add(product);
        if (!success)
            return null;
        return product;

    }

    @Override
    public Product read(String productId) {
        Product product = productDB.stream()
                .filter(s -> s.getProductId().equals(productId))
                .findAny()
                .orElse(null);
        return product;
    }

    @Override
    public Product update(Product product) {

        Product oldProduct = read(product.getProductId());
        if (oldProduct != null){
            productDB.remove(oldProduct);
            productDB.add(product);
            return product;
        }
        return null;

    }

    @Override
    public boolean delete(String productId) {
        Product productToDelete = read(productId);
        if (productToDelete == null)
            return false;
        productDB.remove(productToDelete);
        return true;
    }

    @Override
    public Set<Product> getAll() {

        return productDB;
    }
}
