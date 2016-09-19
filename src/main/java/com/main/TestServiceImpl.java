package com.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestRepository testRepository;


    List<User> users;


    @Override
    public void init() {
        testRepository.init();
    }

    @Override
    public User save(User user) {
        //log, console - user saved example
        return testRepository.save(user);
    }

    @Override
    public User delete(User user) {
        return testRepository.delete(user);
    }

    @Override
    public User findById(long id) {
        return testRepository.findById(id);
    }

    @Override
    public List<User> getAll() {
        //users = new ArrayList<>();
        //if(users.isEmpty()) {
            //users = testRepository.getAll();
        //}

        //return users;
        return  testRepository.getAll();
    }

    @Override
    public List<User> getUsersWithPrice(int price) {
        List<User> userList = testRepository.getAll();

        List<User> resList = new ArrayList<>();
        for(User user : userList) {
            if(user.getPrice() > price) resList.add(user);
        }

        return resList;
    }

    @Override
    public List<User> getUsersWithCity(String city) {
        return null;


    }
}
