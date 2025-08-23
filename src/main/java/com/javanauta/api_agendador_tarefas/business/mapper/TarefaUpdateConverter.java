package com.javanauta.api_agendador_tarefas.business.mapper;

import com.javanauta.api_agendador_tarefas.business.dto.TarefasDTORecord;
import com.javanauta.api_agendador_tarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TarefaUpdateConverter {

    void updateTarefas(TarefasDTORecord dto, @MappingTarget TarefasEntity entity);
}
