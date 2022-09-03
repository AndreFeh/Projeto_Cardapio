package com.faculdade.servicos_web.cardapio.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "tbl_valor")
public class Valor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private double valor;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    @JsonIgnore
    @JsonProperty(value = "valor_Valor")
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

