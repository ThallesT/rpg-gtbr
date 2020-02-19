package com.gtbr.rpg.crud;

import com.gtbr.rpg.crud.repository.JogadorRepository;
import com.gtbr.rpg.entity.Jogador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JogadorServicoCrud {

    @Autowired
    private JogadorRepository jogadorRepository;


    public Jogador getJogadorByEmail(String email) {
        return jogadorRepository.findJogadorByEmail(email);
    }

    public Jogador getJogadorByUsername(String name){
        return jogadorRepository.findJogadorByNome(name);
    }

    public boolean hasAccount(String email) {
        Jogador jogador = jogadorRepository.findJogadorByEmail(email);
        if(jogador == null) return false;

        return true;


    }

    public Jogador insertJogador(String username, String senha, String email) {
        Jogador jogador = new Jogador();
        jogador.setEmail(email);
        jogador.setNome(username);
        jogador.setSenha(senha);

        return jogadorRepository.save(jogador);
    }

    public Jogador getJogadorById(Long idUsuario) {
        return jogadorRepository.findByIdJogador(idUsuario);
    }
}
