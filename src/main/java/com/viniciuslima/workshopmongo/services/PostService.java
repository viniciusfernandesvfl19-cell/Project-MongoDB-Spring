package com.viniciuslima.workshopmongo.services;

import com.viniciuslima.workshopmongo.domain.Post;
import com.viniciuslima.workshopmongo.repository.PostRepository;
import com.viniciuslima.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository Repo;

    public Post findById(String id) {
        Optional<Post> post = Repo.findById(id);

        return post.orElseThrow(() -> new ObjectNotFoundException("Post not found"));
    }

}
