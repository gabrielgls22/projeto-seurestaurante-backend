package com.seurestaurante.cliente.dataprovider.cardapio.adicionaproduto.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProdutosCategoriaEntity {

    private String nome;
    private Double valor;
    private String descricao;
    private String urlImagem;
}
