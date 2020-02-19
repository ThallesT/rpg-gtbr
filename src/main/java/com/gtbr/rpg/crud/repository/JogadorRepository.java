package com.gtbr.rpg.crud.repository;

import com.gtbr.rpg.entity.Jogador;
import org.springframework.data.repository.CrudRepository;

public interface JogadorRepository extends CrudRepository<Jogador, Long> {
    Jogador findJogadorByEmail(String email);

    Jogador findJogadorByNome(String nome);

    Jogador findByIdJogador(Long idJogador);
}
