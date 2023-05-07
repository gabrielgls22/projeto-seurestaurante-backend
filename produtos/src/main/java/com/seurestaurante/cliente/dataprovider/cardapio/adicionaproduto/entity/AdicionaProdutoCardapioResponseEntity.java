package com.seurestaurante.cliente.dataprovider.cardapio.adicionaproduto.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdicionaProdutoCardapioResponseEntity {

    private String descricaoResposta;
}
