package com.seurestaurante.cliente.dataprovider.cardapio.buscaprodutos.mapper;

import com.seurestaurante.cliente.dataprovider.cardapio.buscaprodutos.entity.BuscaCardapioResponseEntity;
import com.seurestaurante.cliente.dataprovider.cardapio.buscaprodutos.entity.CardapioResponseEntity;
import com.seurestaurante.cliente.dataprovider.cardapio.buscaprodutos.entity.ProdutosCategoriaCardapioEntity;
import com.seurestaurante.cliente.usecase.cardapio.buscaprodutos.domain.BuscaCardapioResponseDomain;
import com.seurestaurante.cliente.usecase.cardapio.buscaprodutos.domain.CardapioResponseDomain;
import com.seurestaurante.cliente.usecase.cardapio.buscaprodutos.domain.ProdutosCategoriaCardapioDomain;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class BuscaCardapioRepositoryMapperImpl implements BuscaCardapioRepositoryMapper{
    @Override
    public BuscaCardapioResponseDomain toDomain(Optional<BuscaCardapioResponseEntity> responseEntity) {
        BuscaCardapioResponseDomain.BuscaCardapioResponseDomainBuilder buscaCardapioResponseDomainBuilder =
                BuscaCardapioResponseDomain.builder();

        if(!responseEntity.isPresent()){
            throw new RestClientException("Código empresa informado não consta no banco de dados");
        }

        return buscaCardapioResponseDomainBuilder
                .codigoEmpresa(responseEntity.get().getCodigoEmpresa())
                .nomeEmpresa(responseEntity.get().getNomeEmpresa())
                .cardapio(retornarCardapioResponseDomain(responseEntity.get().getCardapio()))
                .build();
    }

    protected List<CardapioResponseDomain> retornarCardapioResponseDomain(
            List<CardapioResponseEntity> cardapioResponseEntity){
        List<CardapioResponseDomain> listaCardapioDomain = new ArrayList<>();

        cardapioResponseEntity.forEach(item -> {
            CardapioResponseDomain responseDomain =
                    CardapioResponseDomain.builder()
                            .tituloCategoria(item.getTituloCategoria())
                            .produtos(retornarProdutosCardapioDomain(item.getProdutos()))
                            .build();

            listaCardapioDomain.add(responseDomain);
        });

        return listaCardapioDomain;
    }

    protected List<ProdutosCategoriaCardapioDomain> retornarProdutosCardapioDomain(
            List<ProdutosCategoriaCardapioEntity> produtosCategoriaCardapioEntity){

        List<ProdutosCategoriaCardapioDomain> listaProdutosCardapioDomain = new ArrayList<>();

        produtosCategoriaCardapioEntity.forEach(produto -> {
            ProdutosCategoriaCardapioDomain responseDomain =
                    ProdutosCategoriaCardapioDomain.builder()
                            .nome(produto.getNome())
                            .valor(produto.getValor())
                            .descricao(produto.getDescricao())
                            .urlImagem(produto.getUrlImagem())
                            .build();

            listaProdutosCardapioDomain.add(responseDomain);
        });

        return listaProdutosCardapioDomain;

    }
}
