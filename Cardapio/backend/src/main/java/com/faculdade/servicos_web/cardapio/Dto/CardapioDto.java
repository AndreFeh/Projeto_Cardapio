package com.faculdade.servicos_web.cardapio.Dto;

import com.faculdade.servicos_web.cardapio.Model.CardapioModel;
import com.faculdade.servicos_web.cardapio.Model.Categoria;
import com.faculdade.servicos_web.cardapio.Model.Valor;

import java.util.UUID;

public class CardapioDto {

    private UUID id;
    private String nome;
    private String descricao;
    private static Valor valor;
    private static Categoria categoria;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    //Converter p Model
    public static CardapioDto convert(CardapioModel cardapioModel) throws Exception{
        CardapioDto cardapioDto = new CardapioDto();

        cardapioDto.setId(cardapioModel.getId());
        cardapioDto.setDescricao(cardapioModel.getDescricao());
        cardapioDto.setNome(cardapioModel.getNome());
        cardapioDto.setCategoria(cardapioModel.getCategoria());
        cardapioDto.setValor(cardapioModel.getValor());

        return cardapioDto;
    }
}
