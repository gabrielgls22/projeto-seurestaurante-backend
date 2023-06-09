package com.seurestaurante.cliente.dataprovider.cardapio.buscaprodutos.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "cardapio")
public class BuscaCardapioResponseEntity {

    @Id
    private ObjectId id;

    private Integer codigoEmpresa;
    private String nomeEmpresa;
    private String urlLogoEmpresa;
    private List<CardapioResponseEntity> cardapio;
}
