package org.belili.tecunity.service.impl;

import org.belili.tecunity.entity.Curso;
import org.belili.tecunity.repository.CursoRepository;
import org.belili.tecunity.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "cursoService")
public class CursoService implements ICursoService {

    @Autowired
    @Qualifier(value = "cursoRepository")
    private CursoRepository cursoRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Curso> findAll() {
        return this.cursoRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Curso findById(Integer id) {
        return this.cursoRepository.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void save(Curso curso) {
        this.cursoRepository.save(curso);
    }

    @Transactional
    @Override
    public void delete(Curso curso) {
        this.cursoRepository.delete(curso);
    }
}
