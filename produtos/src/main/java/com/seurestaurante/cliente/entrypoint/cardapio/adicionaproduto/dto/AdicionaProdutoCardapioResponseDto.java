package com.seurestaurante.cliente.entrypoint.cardapio.adicionaproduto.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdicionaProdutoCardapioResponseDto {

    private String descricaoResposta;
}
