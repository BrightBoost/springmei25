package com.example.demo.onetoone.service;

import com.example.demo.onetoone.model.User;
import com.example.demo.onetoone.model.UserProfile;
import com.example.demo.onetoone.repository.UserProfileRepository;
import com.example.demo.onetoone.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;
    private UserProfileRepository userProfileRepository;

    public UserService(UserRepository userRepository, UserProfileRepository userProfileRepository) {
        this.userRepository = userRepository;
        this.userProfileRepository = userProfileRepository;
    }

    // get all
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // get one by id
    public Optional<User> getUserById(long id) {
        return userRepository.findById(id);
    }

    // add new
    public User addNewUser(User user) {
        User savedUser = userRepository.save(user);
        UserProfile userProfile =  savedUser.getUserProfile();
        userProfile.setUser(savedUser);
        userProfileRepository.save(userProfile);
        return savedUser;
    }

    // delete
    public void deleteById(long id) {
        Optional<User> user = getUserById(id);
        if(user.isPresent()) {
            userRepository.deleteById(user.get().getId());
        }
    }
}
