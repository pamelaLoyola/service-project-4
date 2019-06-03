package org.belili.tecunity.service;

import org.belili.tecunity.entity.Asesoria;

import java.util.List;

public interface IAsesoriaService {

    List<Asesoria> findAll();

    Asesoria findById(Integer id);

    void save(Asesoria asesoria);

    void delete(Asesoria asesoria);
}
