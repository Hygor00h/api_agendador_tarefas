package com.javanauta.api_agendador_tarefas.infrastructure.repository;

import com.javanauta.api_agendador_tarefas.infrastructure.entity.TarefasEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefasRepository extends MongoRepository<TarefasEntity, String> {
}
