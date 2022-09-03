package com.faculdade.servicos_web.cardapio.Repository;

import com.faculdade.servicos_web.cardapio.Model.CardapioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardapioRepository extends JpaRepository<CardapioModel, String> {
}
