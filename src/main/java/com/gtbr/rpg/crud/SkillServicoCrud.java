package com.gtbr.rpg.crud;

import com.gtbr.rpg.crud.repository.SkillRepository;
import com.gtbr.rpg.entity.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class SkillServicoCrud {

    @Autowired
    private SkillRepository skillRepository;
    @PersistenceContext
    private EntityManager entityManager;


}
