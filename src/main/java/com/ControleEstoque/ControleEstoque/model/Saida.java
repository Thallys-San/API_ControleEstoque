package com.ControleEstoque.ControleEstoque.model;
import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.*;

@Entity

@Table(name = "saida")

@Getter
@Setter

@NoArgsConstructor
public class Saida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSaida")
    private long id;

    @Column(nullable = false)
    private LocalDate dataSaida;

    @ManyToOne
    @JoinColumn(name = "id_Produto", referencedColumnName = "idProduto")
    private Produto produto; // referência à entidade

    @ManyToOne
    @JoinColumn(name = "id_Usuario", referencedColumnName = "idUsuario")
    private Usuario usuario; // referência à entidade

    @Column(nullable = false)
    private int quantidade_saida;
}
