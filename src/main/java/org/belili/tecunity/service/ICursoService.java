package org.belili.tecunity.service;

import org.belili.tecunity.entity.Curso;

import java.util.List;

public interface ICursoService {

    List<Curso> findAll();

    Curso findById(Integer id);

    void save(Curso curso);

    void delete(Curso curso);
}
