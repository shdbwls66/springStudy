package com.ormi.springstudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepositoryInterface userRepository;

    @Autowired // 의존성 주입
    public UserService(UserRepositoryInterface userRepository2) {
        this.userRepository = userRepository2;
    }

    public void createUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }
}
