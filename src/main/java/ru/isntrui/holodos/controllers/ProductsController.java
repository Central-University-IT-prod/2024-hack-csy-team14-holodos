package ru.isntrui.holodos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.isntrui.holodos.models.Holodos;
import ru.isntrui.holodos.models.Product;
import ru.isntrui.holodos.models.User;
import ru.isntrui.holodos.repositories.HolodosRepository;
import ru.isntrui.holodos.repositories.ProductRepository;
import ru.isntrui.holodos.repositories.SkuRepository;
import ru.isntrui.holodos.repositories.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/api/products/")
public class ProductsController {
    @Autowired
    private HolodosRepository holodosRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private SkuRepository skuRepository;

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product,
                                                 @RequestParam("holodosId") long holodosId) {
        Optional<User> user = userRepository.findById(product.getOwner().getId());
        if (user.isEmpty()) return ResponseEntity.notFound().build();

        Optional<Holodos> holodos = holodosRepository.findById(holodosId);
        if (holodos.isEmpty()) return ResponseEntity.notFound().build();

        product.setOwner(user.get());
        product.setHolodos(holodos.get());

        var skus = skuRepository.findByNameLike(product.getSku().getName());
        if (skus.isEmpty()) {
            product.setSku(skuRepository.save(product.getSku()));
        } else {
            product.setSku(skus.getFirst());
        }

        product.getSku().setProducts(Set.of());
        product.getOwner().setHolodoses(Set.of());
        product.getHolodos().setProducts(Set.of());
        product.getHolodos().setUsers(Set.of());

        return ResponseEntity.ok(productRepository.save(product));
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteProduct(@RequestParam("id") long id) {
        productRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProductsInHolodos(@RequestParam("holodosId") long holodosId, @RequestParam("userId") long userId) {
        Optional<Holodos> holodos = holodosRepository.findById(holodosId);

        if (holodos.isEmpty()) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(holodos.get().getProducts().stream().peek(p -> {
            p.setHolodos(null);
            p.getSku().setProducts(Set.of());
            p.getOwner().setHolodoses(Set.of());
        }).toList());
    }
}
