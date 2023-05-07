package com.seurestaurante.cliente.entrypoint.cardapio.adicionaproduto;

import com.seurestaurante.cliente.entrypoint.cardapio.adicionaproduto.dto.AdicionaProdutoCardapioRequestDto;
import com.seurestaurante.cliente.entrypoint.cardapio.adicionaproduto.dto.AdicionaProdutoCardapioResponseDto;
import com.seurestaurante.cliente.entrypoint.cardapio.adicionaproduto.mapper.AdicionaProdutoCardapioEntrypointMapper;
import com.seurestaurante.cliente.usecase.cardapio.adicionaproduto.AdicionaProdutoCardapioUseCase;
import com.seurestaurante.cliente.usecase.cardapio.adicionaproduto.domain.AdicionaProdutoCardapioRequestDomain;
import com.seurestaurante.cliente.usecase.cardapio.adicionaproduto.domain.AdicionaProdutoCardapioResponseDomain;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/cardapio")
public class AdicionaProdutoCardapioController {


    private final AdicionaProdutoCardapioEntrypointMapper adicionaProdutoCardapioEntrypointMapper;

    private final AdicionaProdutoCardapioUseCase adicionaProdutoCardapioUsecase;

    @PostMapping("/adiciona-produto")
    @ResponseStatus(HttpStatus.CREATED)
    private ResponseEntity<Void> criar(
            @RequestBody @NonNull final AdicionaProdutoCardapioRequestDto requestDto){

        final AdicionaProdutoCardapioRequestDomain requestDomain =
                adicionaProdutoCardapioEntrypointMapper.toDomain(requestDto);

        adicionaProdutoCardapioUsecase.executar(requestDomain);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
