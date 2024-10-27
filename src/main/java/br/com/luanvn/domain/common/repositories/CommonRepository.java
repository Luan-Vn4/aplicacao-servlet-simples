package br.com.luanvn.domain.common.repositories;

import java.util.List;
import java.util.Optional;

public interface CommonRepository<Entity, Key> {

    Entity save(Entity entity);

    Entity update(Entity entity);

    List<Entity> findAll();

    Optional<Entity> findById(Key id);

    void deleteById(Key id);

}
