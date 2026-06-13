package com.viniciuslima.workshopmongo.services;

import com.viniciuslima.workshopmongo.domain.User;
import com.viniciuslima.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository Repo;

    public List<User> findAll() {
        return Repo.findAll();
    }
}
