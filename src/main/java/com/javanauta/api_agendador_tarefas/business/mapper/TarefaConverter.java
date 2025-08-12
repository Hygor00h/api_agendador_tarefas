package com.javanauta.api_agendador_tarefas.business.mapper;

import com.javanauta.api_agendador_tarefas.business.dto.TarefasDTO;
import com.javanauta.api_agendador_tarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TarefaConverter {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "dataEvento", target = "dataEvento")
    @Mapping(source = "dataCriacao", target = "dataCriacao")

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDto(TarefasEntity entity);

    List<TarefasEntity> paraListTarefasEntity(List<TarefasDTO> dtos);

    List<TarefasDTO> paraListTarefasDto(List<TarefasEntity> entity);
}
