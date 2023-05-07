package com.seurestaurante.cliente.usecase.cardapio.adicionaproduto.gateway;

import com.seurestaurante.cliente.usecase.cardapio.adicionaproduto.domain.AdicionaProdutoCardapioRequestDomain;

public interface AdicionaProdutoCardapioGateway {

    void executar(AdicionaProdutoCardapioRequestDomain requestDomain);
}
