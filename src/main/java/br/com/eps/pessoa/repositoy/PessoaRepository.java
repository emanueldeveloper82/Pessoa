package br.com.eps.pessoa.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eps.pessoa.entity.PessoaEntity;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {

}
