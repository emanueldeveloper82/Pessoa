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
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
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

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
}
