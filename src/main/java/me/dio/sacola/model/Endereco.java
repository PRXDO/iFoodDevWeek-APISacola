package me.dio.sacola.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor
@Builder
@Data
@Embeddable
/*Diz que a classe não sera uma tabela, e faz com que os dados do endereço(CEP e Endereço) sejam passados para as classes
que chamam a endereço(Restaurante e Cliente)
*/
@NoArgsConstructor
public class Endereco {
    private String cep;
    private String complemento;
}