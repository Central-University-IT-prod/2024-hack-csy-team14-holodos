package ru.isntrui.holodos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.isntrui.holodos.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
//    List<Product> findAllByHolodos_Id(Long holodosId);
//    void addProductsToHolodos(@Param("product") Product product);
//    boolean updateProductInHolodos(@Param("productId") Long productId, @Param("quantity") int quantity);
}
