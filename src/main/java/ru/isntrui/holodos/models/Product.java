package ru.isntrui.holodos.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@Entity
@Table(name = "products")
@EqualsAndHashCode(of = "id")
public class Product {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @NotNull
    private Sku sku;

    @ManyToOne
    @NotNull
    private Holodos holodos;

    @NotNull
    private int quantity;

    @Nullable
    private Date dateMade;

    @ManyToOne
    @NotNull
    private User owner;
}
