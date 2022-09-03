package com.faculdade.servicos_web.cardapio.Model;

import com.faculdade.servicos_web.cardapio.Dto.CardapioDto;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Entity
public class CardapioModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private UUID id;

    private String nome;
    private String descricao;

    @ManyToMany
    @JoinColumn(name = "valor_id")
    private Valor valor;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    //Gets e Sets
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

    //Converter p DTO
    public static CardapioModel convert(CardapioDto cardapioDto) throws Exception {
        CardapioModel cardapioModel = new CardapioModel();

        cardapioModel.setDescricao(cardapioDto.getDescricao());
        cardapioModel.setId(cardapioDto.getId());
        cardapioModel.setNome(cardapioDto.getNome());
        cardapioModel.setValor(cardapioDto.getValor());
        cardapioModel.setCategoria(cardapioDto.getCategoria());

        return cardapioModel;
    }
}
