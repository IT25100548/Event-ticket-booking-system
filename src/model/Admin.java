package model;

public class Admin {
    private String adminId;
    private String name;
    private String password;

    public Admin(String adminId,String name,String password){
        this.adminId=adminId;
        this.name=name;
        this.password=password;
    }
    public String getadminId(){
        return adminId;
    }
    public String getname(){
        return name;
    }
    public String getPassword(){
        return password;
    }
}
