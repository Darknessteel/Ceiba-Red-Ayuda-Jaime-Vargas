package com.ceiba.backend.repository;

import com.ceiba.backend.domain.Califica;
import org.springframework.data.repository.CrudRepository;

public interface CalificaRepository extends CrudRepository<Califica, Integer> {
    Iterable<Califica> findByUsuario(String usuario);
}
