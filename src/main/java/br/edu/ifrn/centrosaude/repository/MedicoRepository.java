package br.edu.ifrn.centrosaude.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifrn.centrosaude.domain.medico.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long>{

}