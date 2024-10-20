package ru.isntrui.holodos.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@Data
@Entity
@Table(name = "sku")
@EqualsAndHashCode(of = "id")
public class Sku {
    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private String name;

    @Nullable
    private String pictureUrl;

    @Nullable
    private Integer bestBeforeDays;

    @OneToMany(mappedBy = "sku")
    private Set<Product> products;
}
