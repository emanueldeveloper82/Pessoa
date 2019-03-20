package br.com.eps.pessoa.model;

public class ResponseModel {
	
	private int codigo;
	private String menssagem;
	
	public ResponseModel(int codigo, String menssagem) {
		super();
		this.codigo = codigo;
		this.menssagem = menssagem;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMenssagem() {
		return menssagem;
	}
	public void setMenssagem(String menssagem) {
		this.menssagem = menssagem;
	}

}
