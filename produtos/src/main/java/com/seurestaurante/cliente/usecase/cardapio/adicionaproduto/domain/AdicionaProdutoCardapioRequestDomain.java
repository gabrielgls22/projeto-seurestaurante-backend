package com.seurestaurante.cliente.usecase.cardapio.adicionaproduto.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdicionaProdutoCardapioRequestDomain {

    private String nomeEmpresa;
    private String tituloCategoria;
    private List<ProdutosCategoriaDomain> produtos;
}
