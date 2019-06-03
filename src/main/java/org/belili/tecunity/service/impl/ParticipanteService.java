package org.belili.tecunity.service.impl;

import org.belili.tecunity.entity.Participante;
import org.belili.tecunity.repository.ParticipanteRepository;
import org.belili.tecunity.service.IParticipanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "participanteService")
public class ParticipanteService implements IParticipanteService {

    @Autowired
    @Qualifier(value = "participanteRepository")
    private ParticipanteRepository participanteRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Participante> findAll() {
        return this.participanteRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Participante findById(Integer id) {
        return this.participanteRepository.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void save(Participante participante) {
        this.participanteRepository.save(participante);
    }

    @Transactional
    @Override
    public void delete(Participante participante) {
        this.participanteRepository.delete(participante);
    }
}
