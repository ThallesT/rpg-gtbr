package com.gtbr.rpg.crud;

import com.gtbr.rpg.crud.repository.MesaRepository;
import com.gtbr.rpg.dto.JogadorDTO;
import com.gtbr.rpg.dto.MesaDTO;
import com.gtbr.rpg.dto.composite.DtoComposite;
import com.gtbr.rpg.entity.Jogador;
import com.gtbr.rpg.entity.Mesa;
import com.gtbr.rpg.entity.MesaJogador;
import com.gtbr.rpg.service.GeneralServices;
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
    @Autowired
    private MesaJogadorServicoCrud mesaJogadorServicoCrud;
    @Autowired
    private JogadorServicoCrud jogadorServicoCrud;
    @PersistenceContext
    private EntityManager entityManager;



    public List<MesaDTO> getListaMesaDTO(Long idJogador){
        List<MesaDTO> listaMesaDTO = new ArrayList<>();
        List<MesaJogador> listaMesajogador = mesaJogadorServicoCrud.getListaMesaJogadorByIdJogador(idJogador);
        listaMesajogador.forEach(mesaJogador -> {
            MesaDTO mesaDTO = new DtoComposite<MesaDTO, Mesa>().compose(mesaJogador.getMesa(), MesaDTO.class);
            List<JogadorDTO> listaJogadorDTO = new ArrayList<>();
            List<Jogador> listaJogador = jogadorServicoCrud.getListaJogadorByIdMesa(mesaDTO.getIdMesa());

            listaJogador.forEach(jogador -> {
                listaJogadorDTO.add(jogadorServicoCrud.getJogadorDTO(jogador.getIdJogador()));
            });

            mesaDTO.setListaJogadorDTO(listaJogadorDTO);
            listaMesaDTO.add(mesaDTO);
        });
        return listaMesaDTO;
    }

    public Mesa insereMesa(String nome, String sistema, String introducao, Long idJogador) {
        Mesa mesa = new Mesa();
        mesa.setIdMestre(idJogador);
        mesa.setIntroducao(introducao);
        mesa.setInviteCode(geraInviteCode());
        mesa.setSistema(sistema);
        mesa.setNome(nome);

        Mesa mesaCriada = mesaRepository.save(mesa);
        mesaJogadorServicoCrud.insereMesaJogador(mesaCriada.getIdMesa(), idJogador);
        return mesaCriada;
    }

    public Mesa getMesaByInviteCode(String token) {
        return mesaRepository.findMesaByInviteCode(token);
    }

    public String geraInviteCode(){
        boolean verificador = false;
        String token;
        do {
            int n = 30;
            String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                    + "0123456789"
                    + "abcdefghijklmnopqrstuvxyz";

            StringBuilder sb = new StringBuilder(n);

            for (int i = 0; i < n; i++) {
                int index
                        = (int) (AlphaNumericString.length()
                        * Math.random());
                sb.append(AlphaNumericString
                        .charAt(index));
            }
            token = sb.toString();
            Mesa mesa = getMesaByInviteCode(token);
            if(mesa == null){
                verificador = true;
            }

        }while (verificador == false);

        return token;
    }


    public void cadastroJogadorByInviteCode(String invite, Long idJogador) {
        Mesa mesa = getMesaByInviteCode(invite);
        mesaJogadorServicoCrud.insereMesaJogador(mesa.getIdMesa(), idJogador);

    }

    public boolean validaMesaJogador(Long idMesa, Long idJogador) {
        MesaJogador mesaJogador = mesaJogadorServicoCrud.findMesaJogadorById(idMesa, idJogador);
        if(mesaJogador == null) return false;

        return true;
    }

    public MesaDTO getMesaDTO(Long idMesa) {
        Mesa mesa = mesaRepository.findByIdMesa(idMesa);
        MesaDTO mesaDTO = new DtoComposite<MesaDTO, Mesa>().compose(mesa, MesaDTO.class);
        List<JogadorDTO> listaJogadorDTO = jogadorServicoCrud.getListaJogadorDTOByIdMesa(idMesa);
        mesaDTO.setListaJogadorDTO(listaJogadorDTO);

        return mesaDTO;
    }
}
