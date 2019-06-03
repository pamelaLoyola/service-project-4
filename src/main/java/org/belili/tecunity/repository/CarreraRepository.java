package org.belili.tecunity.repository;

import org.belili.tecunity.entity.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "carreraRepository")
public interface CarreraRepository extends JpaRepository<Carrera, Integer> {
}
