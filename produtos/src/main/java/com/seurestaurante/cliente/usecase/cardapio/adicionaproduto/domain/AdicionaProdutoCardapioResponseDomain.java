package com.seurestaurante.cliente.usecase.cardapio.adicionaproduto.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdicionaProdutoCardapioResponseDomain {

    private String descricaoResposta;
}
