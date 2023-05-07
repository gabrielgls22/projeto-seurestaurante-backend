package com.seurestaurante.cliente.dataprovider.cardapio.buscaprodutos.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CardapioResponseEntity {

    private String tituloCategoria;
    private List<ProdutosCategoriaCardapioEntity> produtos;
}
