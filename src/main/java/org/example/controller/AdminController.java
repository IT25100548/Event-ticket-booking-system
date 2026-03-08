package org.example.controller;

import org.example.model.Admin;
import org.example.service.AdminService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private final AdminService service = new AdminService();

    // CREATE
    @PostMapping("/add")
    public String addAdmin(@RequestBody Admin admin) {
        return service.addAdmin(admin);
    }

    // READ
    @GetMapping("/all")
    public List<Admin> getAllAdmins() {
        return service.getAllAdmins();
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public String updateAdmin(@PathVariable String id, @RequestParam String name) {
        return service.updateAdmin(id, name);
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public String deleteAdmin(@PathVariable String id) {
        return service.deleteAdmin(id);
    }
}