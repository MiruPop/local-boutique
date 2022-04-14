package com.miru.localboutique.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @NotNull(message = "Le nom du produit ne peut pas être null/vide.")
    @Basic(optional = false)
    @Column
    private String name;

    @Column
    private Double price;

    @Column
    private String pictureUrl;

}
