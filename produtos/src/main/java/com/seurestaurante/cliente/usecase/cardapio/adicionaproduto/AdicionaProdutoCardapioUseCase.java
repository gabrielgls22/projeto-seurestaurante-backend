package com.seurestaurante.cliente.usecase.cardapio.adicionaproduto;

import com.seurestaurante.cliente.usecase.cardapio.adicionaproduto.domain.AdicionaProdutoCardapioRequestDomain;
import com.seurestaurante.cliente.usecase.cardapio.adicionaproduto.gateway.AdicionaProdutoCardapioGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdicionaProdutoCardapioUseCase {

    private final AdicionaProdutoCardapioGateway adicionaProdutoCardapioGateway;

    public void executar(final AdicionaProdutoCardapioRequestDomain requestDomain){

        adicionaProdutoCardapioGateway.executar(requestDomain);

    }
}
