package ru.isntrui.holodos.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@Data
@Entity
@Table(name = "users")
@EqualsAndHashCode(of = "id")
public class User {
    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private int avatarIndex = 1;

    @Column(unique = true)
    @NotNull
    private String phone;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "users")
    private Set<Holodos> holodoses;

    @Enumerated(EnumType.STRING)
    @NotNull
    private Role role;
}
