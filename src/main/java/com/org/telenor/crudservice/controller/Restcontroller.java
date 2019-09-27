package com.org.telenor.crudservice.controller;


import com.org.telenor.crudservice.mapper.CrudMapper;
import com.org.telenor.crudservice.model.Employee;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;

@RestController
public class Restcontroller {
    @Resource
    CrudMapper crudMapper;


    private String instance;

    @GetMapping("/")
    public String message(){
        return "Hello from ";
    }

    @RequestMapping("/msg1")
    public String print(){

        return "Hello world";

    }
    @GetMapping("/getAll")
    public ArrayList<Employee> getAllEmp(){
        return crudMapper.getAll();
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public int getAllEmp(@RequestBody Employee employee){
        return crudMapper.insert(employee);
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public int update(@RequestBody Employee employee){
        return crudMapper.update(employee);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public int delete(@RequestBody Employee employee){
        return crudMapper.delete(employee);
    }

//    @GetMapping("/insert")
//    public int insert(){
//
//        return crudMapper.insert()
//    }
}
