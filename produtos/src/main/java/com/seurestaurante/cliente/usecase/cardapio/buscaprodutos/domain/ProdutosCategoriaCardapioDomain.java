package com.seurestaurante.cliente.usecase.cardapio.buscaprodutos.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProdutosCategoriaCardapioDomain {

    private String nome;
    private Double valor;
    private String descricao;
    private String urlImagem;
}
