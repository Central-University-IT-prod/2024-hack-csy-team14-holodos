package ru.isntrui.holodos.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@Data
@Entity
@Table(name = "holodoses")
@EqualsAndHashCode(of = "id")
public class Holodos {
    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private String name;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "holodos_user", joinColumns = {@JoinColumn(name = "holodos_id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id")})
    private Set<User> users;

    @OneToMany(mappedBy = "holodos")
    private Set<Product> products;
}
