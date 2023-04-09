/**
 * AdminRepository.java
 * This is a Repository class for Admin entity
 *
 * @author Anathi Mhlom 220006695
 * 08 April 2023
 */
package repository;

import domain.Admin;

import java.util.HashSet;
import java.util.Set;

public class AdminRepository implements IAdminRepository{
    private static AdminRepository adminRepo = null;
    private Set<Admin> adminSet = null;
    private AdminRepository() {
        adminSet = new HashSet<Admin>();
    }

    public static AdminRepository getAdminRepo() {
        if (adminRepo == null) {
            adminRepo = new AdminRepository();
        }
        return adminRepo;
    }

    @Override
    public Admin create(Admin admin) {
        boolean success = adminSet.add(admin);
        if (!success)
            return null;
        return admin;
    }

    @Override
    public Admin read(String adminId) {
        Admin admin = adminSet.stream()
                .filter(a -> a.getAdminId().equals(adminId))
                .findAny()
                .orElse(null);
        return admin;
    }

    @Override
    public Admin update(Admin admin) {
        Admin oldAdmin = read(admin.getAdminId());
        if (oldAdmin != null) {
            adminSet.remove(oldAdmin);
            adminSet.add(admin);
            return admin;
        }
        return null;
    }

    @Override
    public boolean delete(String adminId) {
        Admin adminDelete = read(adminId);
        if (adminDelete == null)
            return false;
        adminSet.remove(adminDelete);
        return true;
    }

    @Override
    public Set<Admin> getAll() {
        return adminSet;
    }
}
