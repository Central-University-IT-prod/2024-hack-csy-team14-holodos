package ru.isntrui.holodos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.isntrui.holodos.models.Sku;

import java.util.List;

public interface SkuRepository extends JpaRepository<Sku, Long> {
    List<Sku> findByNameLike(String name);
}
