package com.ormi.springstudy.spring0708.실습;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {
    private final MyRepositoryInterface myRepository ;

    @Autowired
    public MyService(MyRepositoryInterface myRepository) {
        this.myRepository = myRepository;
    }

    public List<MyUser> findByName(String name) {
        return myRepository.findByName(name);
    }

    public void insertUser(MyUser myUser) {
        myRepository.save(myUser);
    }


}
