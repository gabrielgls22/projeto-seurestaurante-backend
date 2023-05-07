package com.seurestaurante.cliente.entrypoint.cardapio.buscaprodutos.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProdutosCategoriaCardapioDto {

    private String nome;
    private Double valor;
    private String descricao;
    private String urlImagem;
}
