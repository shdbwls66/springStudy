package com.ormi.springstudy.spring0708.실습;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface MyRepositoryInterface {
    List<MyUser> findByName(String name);
}