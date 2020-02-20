package com.gtbr.rpg.crud;

import com.gtbr.rpg.crud.repository.MesaJogadorRepository;
import com.gtbr.rpg.entity.MesaJogador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class MesaJogadorServicoCrud {

    @Autowired
    private MesaJogadorRepository mesaJogadorRepository;
    @PersistenceContext
    private EntityManager entityManager;

    public List<MesaJogador> getListaMesaJogadorByIdJogador(Long idJogador) {
        return (List<MesaJogador>) entityManager.createQuery("select mj from MesaJogador mj where mj.idJogador = :idJogador")
                .setParameter("idJogador", idJogador).getResultList();

    }

    public MesaJogador insereMesaJogador(Long idMesa, Long idJogador){
        MesaJogador mesaJogador = new MesaJogador();
        mesaJogador.setIdJogador(idJogador);
        mesaJogador.setIdMesa(idMesa);

        return mesaJogadorRepository.save(mesaJogador);
    }
}
