package br.com.spring_boot_learning.EstudandoSpringBoot.Ninjas;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {

}
