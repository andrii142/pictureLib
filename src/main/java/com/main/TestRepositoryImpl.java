package com.main;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class TestRepositoryImpl implements TestRepository {

    List<User> list = new ArrayList<>();

    //connection to DB

    @Override
    public User save(User user) {

        //sql can be here

        return null;
    }

    @Override
    public User delete(User user) {
        return null;
    }


    @Override
    public User findById(long id) {
        return null;
    }


    @Override
    public List<User> getAll() {
        return list;
    }

    @Override
    public void init() {
        User user = new User(1001, 100, new Date(), "Kyiv");
        list.add(user);
    }

}
