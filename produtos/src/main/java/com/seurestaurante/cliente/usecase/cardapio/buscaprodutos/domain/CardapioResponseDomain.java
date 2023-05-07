package com.seurestaurante.cliente.usecase.cardapio.buscaprodutos.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CardapioResponseDomain {

    private String tituloCategoria;
    private List<ProdutosCategoriaCardapioDomain> produtos;
}
