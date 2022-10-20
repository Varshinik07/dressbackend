package com.nestdigital.dressbackendapp.controller;

import com.nestdigital.dressbackendapp.dao.DressDao;
import com.nestdigital.dressbackendapp.model.DressModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DressController {
    @Autowired
    private DressDao dao;
    @CrossOrigin("*")
    @PostMapping(path="/adddress",consumes = "application/json",produces = "application/json")
    public String dress(@RequestBody DressModel dress){
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewdress")
    public List<DressModel> viewdress(){
        return (List<DressModel>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/searchdress")
    public List<DressModel> searchdress (@RequestBody DressModel dress){
        return (List<DressModel>) dao.searchdress(dress.getDressname());
    }
}
