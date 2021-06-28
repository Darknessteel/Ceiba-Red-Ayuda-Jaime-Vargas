package com.ceiba.backend.repository;

import com.ceiba.backend.domain.House;
import org.springframework.data.repository.CrudRepository;

public interface HouseRepository extends CrudRepository<House, Integer> {

    House findByPropietario(String propietario);
    Iterable<House> findByCiudadAndDisponibilidadAndPais(String ciudad, String disponibilidad, String pais );
   
}