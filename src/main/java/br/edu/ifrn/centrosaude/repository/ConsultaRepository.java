package br.edu.ifrn.centrosaude.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifrn.centrosaude.domain.consulta.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long>{

}