package com.seurestaurante.cliente.entrypoint.cardapio.adicionaproduto.mapper;

import com.seurestaurante.cliente.entrypoint.cardapio.adicionaproduto.dto.AdicionaProdutoCardapioRequestDto;
import com.seurestaurante.cliente.entrypoint.cardapio.adicionaproduto.dto.AdicionaProdutoCardapioResponseDto;
import com.seurestaurante.cliente.usecase.cardapio.adicionaproduto.domain.AdicionaProdutoCardapioRequestDomain;
import com.seurestaurante.cliente.usecase.cardapio.adicionaproduto.domain.AdicionaProdutoCardapioResponseDomain;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AdicionaProdutoCardapioEntrypointMapper {

    AdicionaProdutoCardapioRequestDomain toDomain(AdicionaProdutoCardapioRequestDto requestDto);

    AdicionaProdutoCardapioResponseDto toDto(AdicionaProdutoCardapioResponseDomain responseDomain);
}
