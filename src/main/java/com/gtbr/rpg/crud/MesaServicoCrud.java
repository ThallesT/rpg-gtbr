package com.gtbr.rpg.crud;

import com.gtbr.rpg.crud.repository.MesaRepository;
import com.gtbr.rpg.dto.MesaDTO;
import com.gtbr.rpg.entity.Jogador;
import com.gtbr.rpg.entity.Mesa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Component
public class MesaServicoCrud {

    @Autowired
    private MesaRepository mesaRepository;
    @PersistenceContext
    private EntityManager entityManager;


    public List<Mesa> getListaMesasByUsuario(Long idJogador) {
        return (List<Mesa>) entityManager.createQuery("SELECT m FROM Mesa m join MesaJogador mj on mj.idJogador = :idJogador")
                .setParameter("idJogador", idJogador).getResultList();

    }

    public List<MesaDTO> getListaMesaDTO(Long idJogador){
        List<MesaDTO> listaMesaDTO = new ArrayList<>();
        List<Mesa> listaMesa = getListaMesasByUsuario(idJogador);
        listaMesa.forEach(mesa -> {
            MesaDTO mesaDTO = new MesaDTO();
            mesaDTO.setMesa(mesa);
            List<Jogador> listaJogador = (List<Jogador>) entityManager.createQuery("select j from Jogador j " +
                    "join MesaJogador mj on j.idJogador = mj.idJogador where mj.idMesa = :idMesa")
                    .setParameter("idMesa", mesa.getIdMesa()).getResultList();
            mesaDTO.setListaJogador(listaJogador);
            listaMesaDTO.add(mesaDTO);
        });
        return listaMesaDTO;
    }
}
