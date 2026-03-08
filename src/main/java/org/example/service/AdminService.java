package org.example.service;

import org.example.model.Admin;

import java.util.ArrayList;
import java.util.List;

public class AdminService {

    private List<Admin> adminList = new ArrayList<>();

    // CREATE
    public String addAdmin(Admin admin) {
        adminList.add(admin);
        return "Admin added successfully";
    }

    // READ
    public List<Admin> getAllAdmins() {
        return adminList;
    }

    // UPDATE
    public String updateAdmin(String adminId, String newName) {
        for (Admin admin : adminList) {
            if (admin.getAdminId().equals(adminId)) {
                admin.setName(newName);
                return "Admin updated successfully";
            }
        }
        return "Admin not found";
    }

    // DELETE
    public String deleteAdmin(String adminId) {
        for (Admin admin : adminList) {
            if (admin.getAdminId().equals(adminId)) {
                adminList.remove(admin);
                return "Admin deleted successfully";
            }
        }
        return "Admin not found";
    }
}