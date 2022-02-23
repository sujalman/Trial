package com.kuebiko.hello.dao;

import com.kuebiko.hello.dto.HelloDto;
import com.kuebiko.hello.repo.HelloRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloDao {

    @Autowired
    HelloRepo helloRepo;

    public String saveMessage(String input) {
        HelloDto helloDto = new HelloDto();
        helloDto.setMessage(input);
        helloRepo.save(helloDto);
        return helloDto.getMessage();
    }

    public String getFromRepo(Long id){
        HelloDto helloDto = helloRepo.getById(id);
        return helloDto.getMessage();
    }
}
