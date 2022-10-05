package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Builder
@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne //  Estabelece o relacionamento de um para um entre produto e item( 1 produto só pode ter um item))

    private Produto produto;
    private int quantidade;
    @ManyToOne //  Estabelece o relacionamente de um para muitos entre sacola e itens( 1 sacola pode ter varias itens)

    @JsonIgnore
    private Sacola sacola;
}
