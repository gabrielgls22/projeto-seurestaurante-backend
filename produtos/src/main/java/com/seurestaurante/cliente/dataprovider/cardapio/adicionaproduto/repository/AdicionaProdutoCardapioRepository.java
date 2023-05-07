package com.seurestaurante.cliente.dataprovider.cardapio.adicionaproduto.repository;

import com.mongodb.client.model.Filters;
import com.seurestaurante.cliente.dataprovider.cardapio.adicionaproduto.entity.AdicionaProdutoCardapioRequestEntity;
import com.seurestaurante.cliente.dataprovider.cardapio.adicionaproduto.entity.AdicionaProdutoCardapioResponseEntity;
import com.seurestaurante.cliente.dataprovider.cardapio.buscaprodutos.entity.BuscaCardapioResponseEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdicionaProdutoCardapioRepository extends MongoRepository<AdicionaProdutoCardapioRequestEntity, ObjectId> {
}

