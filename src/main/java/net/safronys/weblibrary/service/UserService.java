package net.safronys.weblibrary.service;

import net.safronys.weblibrary.model.User;

import java.util.List;

public interface UserService {
    User getToId(Long id);

    List<User> getAll();

    void delete(Long id);

    void add(User user);

}
