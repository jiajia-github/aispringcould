package com.southwind.controller;

import com.southwind.Entity.Student;
import com.southwind.feign.FeginInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/hystrix")
public class HystrixHandler {

    @Autowired
    private FeginInterface feginInterface;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feginInterface.findAll();
    }

    @GetMapping("/index")
    public  String index(){
        return feginInterface.index();
    }
}
