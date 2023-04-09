/**
 * IAdminRepository.java
 * This is a Repository interface for Admin entity
 *
 * @author Anathi Mhlom 220006695
 * 08 April 2023
 */
package repository;

import domain.Admin;

import java.util.Set;

public interface IAdminRepository extends IRepository<Admin, String>{
    public Set<Admin> getAll();
}
