package ru.isntrui.holodos.controllers;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.isntrui.holodos.models.User;
import ru.isntrui.holodos.repositories.UserRepository;

import java.util.Set;

@RestController
@RequestMapping("/api/user/")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok(userRepository.save(user));
    }

    @GetMapping("{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") Long id) {
        var user = userRepository.findById(id);
        if (user.isEmpty()) return ResponseEntity.notFound().build();

        user.get().setHolodoses(Set.of());
        return ResponseEntity.ok(user.get());
    }

    @GetMapping("/phone")
    public ResponseEntity<User> getUser(@RequestParam("phone") String phone) {
        var user = userRepository.findByPhone(phone);
        if (user.isEmpty()) return ResponseEntity.notFound().build();

        user.get().setHolodoses(Set.of());
        return ResponseEntity.ok(user.get());
    }

    @Transactional
    @PutMapping
    public ResponseEntity<Void> updateUser(@RequestBody User user) {
        try {
            User ref = userRepository.getReferenceById(user.getId());

            ref.setFirstName(user.getFirstName());
            ref.setLastName(user.getLastName());
            ref.setRole(user.getRole());
            ref.setAvatarIndex(user.getAvatarIndex());
            ref.setPhone(user.getPhone());

            userRepository.save(ref);
            return ResponseEntity.ok().build();
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PatchMapping("{id}/changeAvatar")
    public ResponseEntity<Void> changeAvatar(@PathVariable("id") Long id, @RequestParam("avatar") int avatar) {
        User user = userRepository.getReferenceById(id);
        user.setAvatarIndex(avatar);
        userRepository.save(user);
        return ResponseEntity.ok().build();
    }
}
