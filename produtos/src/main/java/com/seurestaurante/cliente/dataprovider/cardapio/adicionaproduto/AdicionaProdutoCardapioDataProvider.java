package com.seurestaurante.cliente.dataprovider.cardapio.adicionaproduto;

import com.seurestaurante.cliente.dataprovider.cardapio.adicionaproduto.entity.AdicionaProdutoCardapioRequestEntity;
import com.seurestaurante.cliente.dataprovider.cardapio.adicionaproduto.mapper.AdicionaProdutoCardapioRepositoryMapper;
import com.seurestaurante.cliente.dataprovider.cardapio.adicionaproduto.repository.AdicionaProdutoCardapioRepository;
import com.seurestaurante.cliente.dataprovider.cardapio.buscaprodutos.entity.BuscaCardapioResponseEntity;
import com.seurestaurante.cliente.usecase.cardapio.adicionaproduto.domain.AdicionaProdutoCardapioRequestDomain;
import com.seurestaurante.cliente.usecase.cardapio.adicionaproduto.domain.AdicionaProdutoCardapioResponseDomain;
import com.seurestaurante.cliente.usecase.cardapio.adicionaproduto.gateway.AdicionaProdutoCardapioGateway;
import com.seurestaurante.cliente.utils.CodigosEmpresasEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AdicionaProdutoCardapioDataProvider implements AdicionaProdutoCardapioGateway {

    private final AdicionaProdutoCardapioRepositoryMapper adicionaProdutoCardapioRepositoryMapper;
    private final AdicionaProdutoCardapioRepository adicionaProdutoCardapioRepository;

    private final MongoTemplate mongoTemplate;

    @Override
    public void executar(AdicionaProdutoCardapioRequestDomain requestDomain) {

        final AdicionaProdutoCardapioRequestEntity requestEntity =
                adicionaProdutoCardapioRepositoryMapper.toEntity(requestDomain);

        adicionarProdutoCardapio(requestEntity);
    }

    private Query retornarFiltroPesquisa(AdicionaProdutoCardapioRequestEntity requestEntity){
        Query filtroPesquisa = new Query();

        filtroPesquisa.addCriteria(Criteria.where("codigoEmpresa")
                .is(CodigosEmpresasEnum.retornarCodigoEmpresa(requestEntity.getNomeEmpresa())));
        filtroPesquisa.addCriteria(Criteria.where("cardapio.tituloCategoria").is(requestEntity.getTituloCategoria()));

        return filtroPesquisa;
    }

    private void adicionarProdutoCardapio(AdicionaProdutoCardapioRequestEntity requestEntity){

        requestEntity.getProdutos().forEach(produto -> {
            mongoTemplate.update(BuscaCardapioResponseEntity.class)
                    .matching(retornarFiltroPesquisa(requestEntity))
                    .apply(new Update().push("cardapio.$.produtos").value(produto))
                    .first();
        });
    }

}
