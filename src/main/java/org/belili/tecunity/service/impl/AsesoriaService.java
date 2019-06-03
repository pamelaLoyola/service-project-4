package org.belili.tecunity.service.impl;

import org.belili.tecunity.entity.Asesoria;
import org.belili.tecunity.repository.AsesoriaRepository;
import org.belili.tecunity.service.IAsesoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "asesoriaService")
public class AsesoriaService implements IAsesoriaService {

    @Autowired
    @Qualifier(value = "asesoriaRepository")
    private AsesoriaRepository asesoriaRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Asesoria> findAll() {
        return this.asesoriaRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Asesoria findById(Integer id) {
        return this.asesoriaRepository.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void save(Asesoria asesoria) {
        this.asesoriaRepository.save(asesoria);

    }

    @Transactional
    @Override
    public void delete(Asesoria asesoria) {
        this.asesoriaRepository.delete(asesoria);

    }
}
