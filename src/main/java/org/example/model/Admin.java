package org.example.model;

public class Admin {
    private String adminId;
    private String name;
    private String password;
    private String role;

    public Admin() {
        this.adminId = "";
        this.name = "";
        this.password = "";
        this.role = "";
    }

    public Admin(String adminId, String name, String password, String role) {
        this.adminId = adminId;
        this.name = name;
        this.password = password;
        this.role = role;
    }
    public String getAdminId(){
        return adminId;
    }
    // Setter for adminId
    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }
    public String getname(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String toString() {
        return "Admin ID: " + adminId +
                "\nName: " + name +
                "\nRole: " + role;
    }
}
