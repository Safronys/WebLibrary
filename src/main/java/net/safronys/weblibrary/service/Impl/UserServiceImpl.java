package net.safronys.weblibrary.service.Impl;

import net.safronys.weblibrary.model.User;
import net.safronys.weblibrary.repository.UserRepository;
import net.safronys.weblibrary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getToId(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public List<User> getAll() {
        List<User> users = userRepository.findAll();
        return users;
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void add(User user) {
        userRepository.save(user);
    }
}
