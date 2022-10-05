package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@Builder
@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor
public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @OneToMany(cascade = CascadeType.ALL)
/*  Estabele o relacionamente de 1 para muitos entre Restaurante e Produtos( 1 restaurante pode ter varios produtos)
    Cascade faz com que caso um restaurante seja excluido ou alterado, isso resulta em excusão ou alteração dos intens do mesmo
*/
    private List<Produto> cardapio;
    @Embedded
    private Endereco endereco;
}