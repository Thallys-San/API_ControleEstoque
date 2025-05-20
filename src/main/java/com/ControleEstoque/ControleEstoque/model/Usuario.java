package com.ControleEstoque.ControleEstoque.model;

import jakarta.persistence.*;
import lombok.*;


@Entity

@Table(name = "usuarios")

@Getter
@Setter

@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario")
    private long id;

    @Column(nullable = false)
    private String nome;

    @Column()
    private int quantidade;

    @Column(nullable = false)
    private String stats;

}
