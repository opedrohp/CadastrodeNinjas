package br.com.spring_boot_learning.EstudandoSpringBoot.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository extends JpaRepository <MissoesModel, Long> {
}
