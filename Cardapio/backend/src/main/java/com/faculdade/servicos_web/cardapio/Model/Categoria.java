package com.faculdade.servicos_web.cardapio.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "tbl_categoria")
public class Categoria{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(unique = true)
    private String nomeCateg;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    @JsonIgnore
    @JsonProperty(value = "nome_Categoria")
    public String getNomeCateg() {
        return nomeCateg;
    }

    public void setNomeCateg(String nomeCateg) {
        this.nomeCateg = nomeCateg;
    }
}
