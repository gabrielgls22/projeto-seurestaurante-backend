package com.seurestaurante.cliente.entrypoint.cardapio.buscaprodutos.mapper;

import com.seurestaurante.cliente.entrypoint.cardapio.buscaprodutos.dto.BuscaCardapioResponseDto;
import com.seurestaurante.cliente.usecase.cardapio.buscaprodutos.domain.BuscaCardapioResponseDomain;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BuscaCardapioEntrypointMapper {

    BuscaCardapioResponseDto toDto(BuscaCardapioResponseDomain responseDomain);
}
