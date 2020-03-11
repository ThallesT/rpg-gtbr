package com.gtbr.rpg.crud;

import com.gtbr.rpg.crud.repository.JogadorRepository;
import com.gtbr.rpg.dto.JogadorDTO;
import com.gtbr.rpg.dto.composite.DtoComposite;
import com.gtbr.rpg.entity.Jogador;
import com.gtbr.rpg.service.GeneralServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Component
public class JogadorServicoCrud {

    @Autowired
    private JogadorRepository jogadorRepository;
    @PersistenceContext
    private EntityManager entityManager;


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

    @Transactional
    public void alteraFoto(Long idJogador, Byte[] byteArray){
        Jogador jogador = jogadorRepository.findByIdJogador(idJogador);
        jogador.setFotoJogador(byteArray);

        entityManager.persist(jogador);
    }

    public Jogador insertJogador(String username, String senha, String email) {
        Jogador jogador = new Jogador();
        jogador.setEmail(email);
        jogador.setNome(username);
        jogador.setSenha(senha);

        return jogadorRepository.save(jogador);
    }

    public JogadorDTO getJogadorDTO(Long idJogador){
        Jogador jogador = getJogadorById(idJogador);
        JogadorDTO jogadorDTO = new DtoComposite<JogadorDTO, Jogador>().compose(jogador, JogadorDTO.class);
        if( jogador.getFotoJogador() != null) jogadorDTO.setFotoDePerfil(GeneralServices.decodificaImagem(jogador.getFotoJogador()));

        return jogadorDTO;
    }

    public Jogador getJogadorById(Long idUsuario) {
        return jogadorRepository.findByIdJogador(idUsuario);
    }

    public List<Jogador> getListaJogadorByIdMesa(Long idMesa) {
        return  (List<Jogador>) entityManager.createQuery("select j from Jogador j " +
                "join MesaJogador mj on j.idJogador = mj.idJogador where mj.idMesa = :idMesa")
                .setParameter("idMesa", idMesa).getResultList();
    }

    public List<JogadorDTO> getListaJogadorDTOByIdMesa(Long idMesa) {
        List<JogadorDTO> listaJogadorDTO = new ArrayList<>();
        List<Jogador> listaJogador = getListaJogadorByIdMesa(idMesa);
        listaJogador.forEach(jogador -> {
            JogadorDTO jogadorDTO = new DtoComposite<JogadorDTO, Jogador>().compose(jogador, JogadorDTO.class);
            if( jogador.getFotoJogador() != null) jogadorDTO.setFotoDePerfil(GeneralServices.decodificaImagem(jogador.getFotoJogador()));

            listaJogadorDTO.add(jogadorDTO);
        });
        return listaJogadorDTO;
    }
}