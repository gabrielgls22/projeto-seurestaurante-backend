package com.seurestaurante.cliente.usecase.cardapio.buscaprodutos.gateway;

import com.seurestaurante.cliente.usecase.cardapio.buscaprodutos.domain.BuscaCardapioResponseDomain;

public interface BuscaCardapioGateway {

    BuscaCardapioResponseDomain executar(Integer codigoEmpresa);
}
