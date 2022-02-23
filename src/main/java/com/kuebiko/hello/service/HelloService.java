package com.kuebiko.hello.service;

import com.kuebiko.hello.dao.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @Autowired
    HelloDao helloDao;

    public String save (String data){
         String temp = reverse(data);
         helloDao.saveMessage(temp);
        return temp;
    }

    public String reverse (String data){
        String reverseString = new StringBuilder(data).reverse().toString();
        return reverseString;
    }

    public String get (Long id){

        return helloDao.getFromRepo(id);
    }
}
