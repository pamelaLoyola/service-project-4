package org.belili.tecunity.service;

import org.belili.tecunity.entity.Carrera;

import java.util.List;

public interface ICarreraService {

    List<Carrera> findAll();

    Carrera findById(Integer id);

    void save(Carrera carrera);

    void delete(Carrera carrera);
}
