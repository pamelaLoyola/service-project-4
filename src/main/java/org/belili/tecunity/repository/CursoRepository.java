package org.belili.tecunity.repository;

import org.belili.tecunity.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "cursoRepository")
public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
