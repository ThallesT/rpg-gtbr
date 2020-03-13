package com.gtbr.rpg.controller;

import com.gtbr.rpg.crud.MesaJogadorServicoCrud;
import com.gtbr.rpg.crud.MesaServicoCrud;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MesasControllerTest {

    private MesaJogadorServicoCrud mesaJogadorServicoCrud;
    private MesaServicoCrud mesaServicoCrud;


    @BeforeEach
    void setUp() {
        mesaJogadorServicoCrud = new MesaJogadorServicoCrud();
        mesaServicoCrud = new MesaServicoCrud();
    }

    @Test
    void acessaMesa() {

    }
}