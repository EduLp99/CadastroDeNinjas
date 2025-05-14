package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionInterface extends JpaRepository<MissionModel, Long> {
}
