package com.gtbr.rpg.controller;

import com.gtbr.rpg.crud.SkillServicoCrud;
import com.gtbr.rpg.dto.JogadorDTO;
import com.gtbr.rpg.entity.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class SkillsController {

    @Autowired
    private SkillServicoCrud skillServicoCrud;


}
