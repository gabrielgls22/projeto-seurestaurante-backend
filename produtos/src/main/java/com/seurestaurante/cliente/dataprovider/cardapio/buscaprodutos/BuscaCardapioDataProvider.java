package com.seurestaurante.cliente.dataprovider.cardapio.buscaprodutos;

import com.seurestaurante.cliente.dataprovider.cardapio.buscaprodutos.entity.BuscaCardapioResponseEntity;
import com.seurestaurante.cliente.dataprovider.cardapio.buscaprodutos.mapper.BuscaCardapioRepositoryMapper;
import com.seurestaurante.cliente.dataprovider.cardapio.buscaprodutos.repository.BuscaCardapioRepository;
import com.seurestaurante.cliente.usecase.cardapio.buscaprodutos.domain.BuscaCardapioResponseDomain;
import com.seurestaurante.cliente.usecase.cardapio.buscaprodutos.gateway.BuscaCardapioGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class BuscaCardapioDataProvider implements BuscaCardapioGateway {

    private final BuscaCardapioRepositoryMapper buscaCardapioRepositoryMapper;
    private final BuscaCardapioRepository buscaCardapioRepository;

    @Override
    public BuscaCardapioResponseDomain executar(Integer codigoEmpresa) {

        final Optional<BuscaCardapioResponseEntity> responseEntity =
                buscaCardapioRepository.findCardapioByCodigoEmpresa(codigoEmpresa);

        return buscaCardapioRepositoryMapper.toDomain(responseEntity);
    }
}
