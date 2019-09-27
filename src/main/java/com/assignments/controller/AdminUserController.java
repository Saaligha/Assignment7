package com.assignments.controller;
import com.assignments.domain.AdminUser;
import com.assignments.service.impl.AdminUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/adminUser")
public class AdminUserController {
    @Autowired
    @Qualifier("AdminUserServiceImpl")

    private AdminUserServiceImpl service;


    @PostMapping("/new")
    public AdminUser create(@RequestBody AdminUser AdminUserController){

        return service.create(AdminUserController);
    }

    @GetMapping(path = "/find/{id}")
    public AdminUser findById(@PathVariable String id){

        AdminUser AdminUserController = service.read(id);

        return AdminUserController;
    }

    @PutMapping("/update")
    public void update(@RequestBody AdminUser AdminUserController){

        service.update(AdminUserController);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getall")
    public Set<AdminUser> getAll(){
        return service.getAll();
    }



}
