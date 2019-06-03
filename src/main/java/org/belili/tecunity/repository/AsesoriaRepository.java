package org.belili.tecunity.repository;

import org.belili.tecunity.entity.Asesoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "asesoriaRepository")
public interface AsesoriaRepository extends JpaRepository<Asesoria, Integer> {
}
