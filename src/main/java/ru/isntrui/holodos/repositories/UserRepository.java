package ru.isntrui.holodos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.isntrui.holodos.models.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByPhone(String phone);

    @Query("SELECT h.users FROM Holodos h WHERE h.id = :holodosId")
    List<User> findByHolodosId(@Param("holodosId") long holodosId);
}
