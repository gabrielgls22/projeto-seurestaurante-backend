package com.seurestaurante.cliente.entrypoint.cardapio.adicionaproduto.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProdutosCategoriaDto {

    private String nome;
    private Double valor;
    private String descricao;
    private String urlImagem;
}
