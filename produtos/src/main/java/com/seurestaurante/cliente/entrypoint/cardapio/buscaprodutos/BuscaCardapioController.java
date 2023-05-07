package com.seurestaurante.cliente.entrypoint.cardapio.buscaprodutos;

import com.seurestaurante.cliente.entrypoint.cardapio.buscaprodutos.dto.BuscaCardapioResponseDto;
import com.seurestaurante.cliente.entrypoint.cardapio.buscaprodutos.mapper.BuscaCardapioEntrypointMapper;
import com.seurestaurante.cliente.usecase.cardapio.buscaprodutos.BuscaCardapioUsecase;
import com.seurestaurante.cliente.usecase.cardapio.buscaprodutos.domain.BuscaCardapioResponseDomain;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequiredArgsConstructor
@RequestMapping("/cardapio")
public class BuscaCardapioController {


    private final BuscaCardapioEntrypointMapper buscaCardapioEntrypointMapper;

    private final BuscaCardapioUsecase buscaCardapioUsecase;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    private ResponseEntity<BuscaCardapioResponseDto> buscar(
            @RequestParam @NonNull final String nomeEmpresa){

        final BuscaCardapioResponseDomain responseDomain = buscaCardapioUsecase.executar(nomeEmpresa);

        return ResponseEntity.ok(buscaCardapioEntrypointMapper.toDto(responseDomain));
    }
}
