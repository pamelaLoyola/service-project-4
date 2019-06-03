package org.belili.tecunity.service;

import org.belili.tecunity.entity.Participante;

import java.util.List;

public interface IParticipanteService {

    List<Participante> findAll();

    Participante findById(Integer id);

    void save(Participante participante);

    void delete(Participante participante);
}
