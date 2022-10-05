package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.sacola.enumeration.FormaPagamento;

import javax.persistence.*;
import java.util.List;


@AllArgsConstructor //Substitui a declaração dos metodos construtores
@Builder //Traz o componente builder, que possibilita criar um objeto de forma simples@Builder
@Data //Substitui a declaração dos getters e setters
@Entity //Faz com que a classe a seguir seja convertida para uma tabela no BD
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) //Ignora erros do hibernate com atributos lazy
@NoArgsConstructor //Substitui a declaração do metodo construtor vazio para o hibernate
public class Sacola {
    @Id     //Id serve para tornar cada objeto unico
    @GeneratedValue(strategy = GenerationType.AUTO)     //GenerationValue serve para gerar esses valores unicos
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false) //  Estabelece o relacionamente de um para muitos entre cliente e sacola( 1 cliente pode ter varias sacolas)
    @JsonIgnore
    private Cliente cliente;
    @OneToMany(cascade = CascadeType.ALL) //  Estabelece o relacionamento de muitos para um entre sacola e itens( 1 sacola pode ter varios itens
    private List<Item> itens;
    private Double valorTotal;
    @Enumerated
    private FormaPagamento FormaPagamento;
    private boolean fechada;

}