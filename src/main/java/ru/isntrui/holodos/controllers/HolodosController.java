package ru.isntrui.holodos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.isntrui.holodos.models.Holodos;
import ru.isntrui.holodos.models.Product;
import ru.isntrui.holodos.models.User;
import ru.isntrui.holodos.repositories.HolodosRepository;
import ru.isntrui.holodos.repositories.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/api/holodos/")
public class HolodosController {
    @Autowired
    private HolodosRepository holodosRepository;

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public ResponseEntity<Holodos> createHolodos(@RequestBody Holodos holodos) {
        var h = holodosRepository.save(holodos);
        h.setProducts(Set.of());
        h.setUsers(Set.of());
        return ResponseEntity.ok(h);
    }

    @GetMapping("{id}")
    public ResponseEntity<Holodos> getHolodos(@PathVariable("id") long id) {
        var holodos = holodosRepository.findById(id);
        if (holodos.isEmpty()) return ResponseEntity.notFound().build();
        holodos.get().setUsers(Set.of());
        holodos.get().setProducts(Set.of());
        return ResponseEntity.ok(holodos.get());
    }

    @GetMapping("userId")
    public ResponseEntity<List<Holodos>> getHolodosByUserId(@RequestParam("userId") long userId) {
        return ResponseEntity.ok(holodosRepository.findByUsers_Id(userId).stream().peek(h -> {
            h.setUsers(Set.of());
            h.setProducts(Set.of());
        }).toList());
    }

    @GetMapping("{id}/users")
    public ResponseEntity<List<User>> getUsers(@PathVariable("id") long holodosId) {
        return ResponseEntity.ok(userRepository.findByHolodosId(holodosId).stream().peek(u -> u.setHolodoses(Set.of())).toList());
    }

    @GetMapping("{id}/products")
    public ResponseEntity<List<Product>> getProducts(@PathVariable("id") long holodosId) {
        Optional<Holodos> holodos = holodosRepository.findById(holodosId);
        return holodos.map(v -> ResponseEntity.ok(v.getProducts().stream().peek(p -> {
            p.setHolodos(null);
            p.getSku().setProducts(Set.of());
            p.getOwner().setHolodoses(Set.of());
        }).toList())).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("{id}/users")
    public ResponseEntity<Holodos> addUser(@PathVariable("id") long holodosId, @RequestParam("userId") Long userId) {
        Holodos holodos = holodosRepository.getReferenceById(holodosId);
        Optional<User> user = userRepository.findById(userId);
        if (user.isEmpty()) return ResponseEntity.notFound().build();

        holodos.getUsers().add(user.get());
        var h = holodosRepository.save(holodos);
        h.setProducts(Set.of());
        h.setProducts(Set.of());
        return ResponseEntity.ok(h);
    }
}
