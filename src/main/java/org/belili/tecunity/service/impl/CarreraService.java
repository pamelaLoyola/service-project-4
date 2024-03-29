package org.belili.tecunity.service.impl;

import org.belili.tecunity.entity.Carrera;
import org.belili.tecunity.repository.CarreraRepository;
import org.belili.tecunity.service.ICarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "carreraService")
public class CarreraService implements ICarreraService {

    @Autowired
    @Qualifier(value = "carreraRepository")
    private CarreraRepository carreraRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Carrera> findAll() {
        return this.carreraRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Carrera findById(Integer id) {
        return this.carreraRepository.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void save(Carrera carrera) {
        this.carreraRepository.save(carrera);
    }

    @Transactional
    @Override
    public void delete(Carrera carrera) {
        this.carreraRepository.delete(carrera);
    }
}
