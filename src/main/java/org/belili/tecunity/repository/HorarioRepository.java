package org.belili.tecunity.repository;

import org.belili.tecunity.entity.Horario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "horarioRepository")
public interface HorarioRepository extends JpaRepository<Horario, Integer> {
}
