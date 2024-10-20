package ru.isntrui.holodos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.isntrui.holodos.models.Holodos;

import java.util.List;

public interface HolodosRepository extends JpaRepository<Holodos, Long> {
    List<Holodos> findByUsers_Id(Long userId);
}
