package org.belili.tecunity.service;

import org.belili.tecunity.entity.Horario;

import java.util.List;

public interface IHorarioService {

    List<Horario> findAll();

    Horario findById(Integer id);

    void save(Horario horario);

    void delete(Horario horario);
}
