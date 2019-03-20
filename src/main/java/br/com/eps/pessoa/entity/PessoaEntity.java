package br.com.eps.pessoa.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name="TB_PESSOA", schema="ESTUDOS")
public class PessoaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="TB_PESSOA_ID_PESSOA_SEQ")
	@SequenceGenerator(name="TB_PESSOA_ID_PESSOA_SEQ", sequenceName="TB_PESSOA_ID_PESSOA_SEQ", schema="ESTUDOS", allocationSize = 1)  	
	@Column(name="ID_PESSOA")
	private Long codigo;
	
	@Column(name="DS_NOME")
	private String	nome;
	
	@Column(name="DT_NASCIMENTO")
	private Date data_nascimento;
	
	@Column(name="FL_ATIVO")
	private boolean	ativo;
	
}
