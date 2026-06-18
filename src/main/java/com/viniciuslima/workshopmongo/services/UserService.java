package com.viniciuslima.workshopmongo.services;

import com.viniciuslima.workshopmongo.domain.User;
import com.viniciuslima.workshopmongo.dto.UserDTO;
import com.viniciuslima.workshopmongo.repository.UserRepository;
import com.viniciuslima.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository Repo;

    public List<User> findAll() {
        return Repo.findAll();
    }

    public User findById(String id) {
        Optional<User> user = Repo.findById(id);
        if (user.isEmpty()) {
            throw new ObjectNotFoundException("User with id not found");
        }
        return user.orElse(null);
    }

    public User insert(User obj) {
        return Repo.insert(obj);
    }

    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }

}
