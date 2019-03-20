package br.com.eps.pessoa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.eps.pessoa.entity.PessoaEntity;
import br.com.eps.pessoa.model.ResponseModel;
import br.com.eps.pessoa.repositoy.PessoaRepository;

@RestController
@RequestMapping("/service")
public class PessoaService {
	
	@Autowired
	public PessoaRepository pessoaRepository;
	
	
	
	/**
	 * SALVAR UM NOVO REGISTRO
	 * @param pessoa
	 * @return
	 */
	@RequestMapping(   value = "/pessoa", 
			          method = RequestMethod.POST, 
			        consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, 
			        produces = MediaType.APPLICATION_JSON_UTF8_VALUE  )
	public @ResponseBody ResponseModel salvar(@RequestBody PessoaEntity pessoa){
 
		try { 
			this.pessoaRepository.save(pessoa); 
			return new ResponseModel(1, "Registro salvo com sucesso!"); 
		}catch(Exception e) { 
			return new ResponseModel(0, e.getMessage());			
		}
	}
	
	
	/**
	 * ATUALIZAR O REGISTRO
	 * @param pessoa
	 * @return
	 */
	@RequestMapping(   value = "/pessoa", 
			          method = RequestMethod.PUT, 
			        consumes = MediaType.APPLICATION_JSON_UTF8_VALUE )
	public @ResponseBody ResponseModel atualizar(@RequestBody PessoaEntity pessoa){
 
		try { 
			this.pessoaRepository.save(pessoa); 
			return new ResponseModel(1, "Registro atualizado com sucesso!"); 
		}catch(Exception e) {
			return new ResponseModel(0, e.getMessage());
		}
	}
 
	/**
	 * CONSULTAR TODOS OS REGISTROS
	 * @return
	 */
	@RequestMapping(   value = "/pessoa", 
			          method = RequestMethod.GET, 
			        produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody List<PessoaEntity> consultar(){
 
		return this.pessoaRepository.findAll();
	}
 
	/**
	 * BUSCAR UM REGISTRO PELO CÓDIGO
	 * @param codigo
	 * @return
	 */
	@RequestMapping(    value = "/pessoa/{codigo}", 
			           method = RequestMethod.GET, 
			         produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody Optional<PessoaEntity> buscar(@PathVariable("codigo") Long codigo){
 
		return this.pessoaRepository.findById(codigo);
	}
 
	/***
	 * EXCLUIR UM REGISTRO PELO CÓDIGO
	 * @param codigo
	 * @return
	 */
	@RequestMapping(    value = "/pessoa/{codigo}", 
			           method = RequestMethod.DELETE, 
			         produces = MediaType.APPLICATION_JSON_UTF8_VALUE )
	public @ResponseBody ResponseModel excluir(@PathVariable("codigo") Long codigo){
 
		try {
 
			pessoaRepository.deleteById(codigo);
 
			return new ResponseModel(1, "Registro excluido com sucesso!");
 
		}catch(Exception e) {
			return new ResponseModel(0, e.getMessage());
		}
	}
	
	
	
}
