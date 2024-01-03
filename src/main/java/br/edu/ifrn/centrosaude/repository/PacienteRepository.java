package br.edu.ifrn.centrosaude.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifrn.centrosaude.domain.paciente.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}