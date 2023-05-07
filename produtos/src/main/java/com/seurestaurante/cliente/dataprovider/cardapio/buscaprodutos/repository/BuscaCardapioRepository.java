package com.seurestaurante.cliente.dataprovider.cardapio.buscaprodutos.repository;

import com.seurestaurante.cliente.dataprovider.cardapio.buscaprodutos.entity.BuscaCardapioResponseEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BuscaCardapioRepository extends MongoRepository<BuscaCardapioResponseEntity, ObjectId> {
    Optional<BuscaCardapioResponseEntity> findCardapioByCodigoEmpresa(Integer codigoEmpresa);
}
