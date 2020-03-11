package com.gtbr.rpg.dto.composite;

import org.modelmapper.ModelMapper;

public class DtoComposite<T, E> {

    public T compose(E entidade, Class<T> tClass){
        ModelMapper modelMapper = new ModelMapper();

        T dto = modelMapper.map(entidade, tClass);

        return dto;

    }

}
