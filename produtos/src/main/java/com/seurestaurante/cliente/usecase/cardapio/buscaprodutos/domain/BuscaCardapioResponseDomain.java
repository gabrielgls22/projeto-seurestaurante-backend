package com.seurestaurante.cliente.usecase.cardapio.buscaprodutos.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BuscaCardapioResponseDomain {

    private ObjectId id;

    private Integer codigoEmpresa;
    private String nomeEmpresa;
    private String urlLogoEmpresa;
    private List<CardapioResponseDomain> cardapio;
}
