package com.seurestaurante.cliente.dataprovider.cardapio.buscaprodutos.mapper;

import com.seurestaurante.cliente.dataprovider.cardapio.buscaprodutos.entity.BuscaCardapioResponseEntity;
import com.seurestaurante.cliente.usecase.cardapio.buscaprodutos.domain.BuscaCardapioResponseDomain;

import java.util.Optional;


public interface BuscaCardapioRepositoryMapper {

    BuscaCardapioResponseDomain toDomain(Optional<BuscaCardapioResponseEntity> responseEntity);
}
