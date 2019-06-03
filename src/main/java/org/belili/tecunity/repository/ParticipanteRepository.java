package org.belili.tecunity.repository;

import org.belili.tecunity.entity.Participante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "participanteRepository")
public interface ParticipanteRepository extends JpaRepository<Participante, Integer> {
}
