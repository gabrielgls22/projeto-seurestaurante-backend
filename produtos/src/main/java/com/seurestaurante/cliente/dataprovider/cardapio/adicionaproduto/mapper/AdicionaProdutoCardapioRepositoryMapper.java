package com.seurestaurante.cliente.dataprovider.cardapio.adicionaproduto.mapper;

import com.seurestaurante.cliente.dataprovider.cardapio.adicionaproduto.entity.AdicionaProdutoCardapioRequestEntity;
import com.seurestaurante.cliente.dataprovider.cardapio.adicionaproduto.entity.AdicionaProdutoCardapioResponseEntity;
import com.seurestaurante.cliente.usecase.cardapio.adicionaproduto.domain.AdicionaProdutoCardapioRequestDomain;
import com.seurestaurante.cliente.usecase.cardapio.adicionaproduto.domain.AdicionaProdutoCardapioResponseDomain;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AdicionaProdutoCardapioRepositoryMapper {

    AdicionaProdutoCardapioRequestEntity toEntity(AdicionaProdutoCardapioRequestDomain requestDomain);

}
