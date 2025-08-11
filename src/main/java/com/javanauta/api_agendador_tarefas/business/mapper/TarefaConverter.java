package com.javanauta.api_agendador_tarefas.business.mapper;

import com.javanauta.api_agendador_tarefas.business.dto.TarefasDTO;
import com.javanauta.api_agendador_tarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefaConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDto(TarefasEntity entity);
}
