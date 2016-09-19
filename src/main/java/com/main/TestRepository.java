package com.main;

import java.util.List;

public interface TestRepository {

    void init();

    User save(User user);

    User delete(User user);

    User findById(long id);

    List<User> getAll();

}
