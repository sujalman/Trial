package com.kuebiko.hello.controller;

import com.kuebiko.hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/myapp")
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping
    @RequestMapping("/get")
    public String get(@RequestParam("id") Long id){
        return helloService.get(id);
    }

    //POST -> adds new data
    @PostMapping
    @RequestMapping("/save")
    public String save(@RequestBody String data) {
        String response = helloService.save(data);
        return response;
    }


    //PUT -> update existing data


    //DELETE -> delete data


}
