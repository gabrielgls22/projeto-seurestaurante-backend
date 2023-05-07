package com.seurestaurante.cliente.dataprovider.cardapio.buscaprodutos.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProdutosCategoriaCardapioEntity {

    private String nome;
    private Double valor;
    private String descricao;
    private String urlImagem;
}
