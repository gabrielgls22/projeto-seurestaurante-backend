package com.seurestaurante.cliente.dataprovider.cardapio.adicionaproduto.entity;

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
public class AdicionaProdutoCardapioRequestEntity {

    @Id
    private ObjectId id;

    private String nomeEmpresa;
    private String tituloCategoria;
    private List<ProdutosCategoriaEntity> produtos;
}
