package com.main;

import java.util.List;

public interface TestService {

    void init();

    User save(User user);

    User delete(User user);

    User findById(long id);

    List<User> getAll();

    List<User> getUsersWithPrice(int price);

    List<User> getUsersWithCity(String city);

}
