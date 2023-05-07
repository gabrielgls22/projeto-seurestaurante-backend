package com.seurestaurante.cliente.utils;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.client.RestClientException;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum CodigosEmpresasEnum {

    OSTEARIA_COSTELLO(
            "osteria-costello",
            1),
    MAGICA_PIZZA(
            "magica-pizza",
            2);

    private final String nomeEmpresa;
    private final Integer codigoEmpresa;

    public static Integer retornarCodigoEmpresa(String nomeEmpresa){
        CodigosEmpresasEnum codigoEmpresasEnum = Arrays.stream(CodigosEmpresasEnum.values())
                .filter(valor -> nomeEmpresa.contains(valor.getNomeEmpresa())).findFirst()
                .orElseThrow(() -> new RestClientException("Codigo Empresa informado não existe no banco de dados"));

        return codigoEmpresasEnum.getCodigoEmpresa();
    }
}
