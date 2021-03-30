package org.obrii.mit.dp2021.shmat.ShmatKateryna2021.services;

import org.obrii.mit.dp2021.shmat.ShmatKateryna2021.model.Users;
import org.obrii.mit.dp2021.shmat.ShmatKateryna2021.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository usersRepository;

    @Autowired
    public UserService(UserRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public void create(Users entity) {
        usersRepository.save(entity);
    }

    public Optional<Users> findById(Long id) {
        return usersRepository.findById(id);
    }

    public List<Users> findAll() {
        return usersRepository.findAll();
    }

    public void update(Users entity) {
        usersRepository.save(entity);
    }

    public void delete(Long id) {
        usersRepository.deleteById(id);
    }

    public List<Users> findUsersByName(String name){
        return usersRepository.findUsersByName(name);
    }
}