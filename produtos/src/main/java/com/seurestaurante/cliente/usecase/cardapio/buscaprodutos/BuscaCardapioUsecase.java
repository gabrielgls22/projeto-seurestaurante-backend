package com.seurestaurante.cliente.usecase.cardapio.buscaprodutos;

import com.seurestaurante.cliente.usecase.cardapio.buscaprodutos.domain.BuscaCardapioResponseDomain;
import com.seurestaurante.cliente.usecase.cardapio.buscaprodutos.gateway.BuscaCardapioGateway;
import com.seurestaurante.cliente.utils.CodigosEmpresasEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BuscaCardapioUsecase {


    private final BuscaCardapioGateway buscaCardapioGateway;

    public BuscaCardapioResponseDomain executar(final String nomeEmpresa){

        return buscaCardapioGateway.executar(CodigosEmpresasEnum.retornarCodigoEmpresa(nomeEmpresa));
    }
}
