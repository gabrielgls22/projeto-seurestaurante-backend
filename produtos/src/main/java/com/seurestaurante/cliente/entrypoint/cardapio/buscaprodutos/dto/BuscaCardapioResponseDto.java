package com.seurestaurante.cliente.entrypoint.cardapio.buscaprodutos.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BuscaCardapioResponseDto {

    private String nomeEmpresa;
    private String urlLogoEmpresa;
    private List<CardapioResponseDto> cardapio;
}
