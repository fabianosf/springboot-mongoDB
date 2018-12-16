/*
 * Utilizando implementacoes do Spring
 * e instanciando uma repositoy criada
 * implementando ArquivoRepository na classe service(ArquivoService)
 */
package br.com.mongo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mongo.entity.Arquivo;
import br.com.mongo.repository.ArquivoRepository;
/*   
 * @author: <a href="mailto:fabiano.freitas@gmail.com">Fabiano Freitas</a> 
 * github: fabianosf
 * 
 **/
@Service
public class ArquivoService {

	@Autowired
	ArquivoRepository arquivoRepository;

	public void salvar(String nome, String conteudo) {
		arquivoRepository.save(new Arquivo(nome, conteudo));

	}

	public List<Arquivo> findAll() {
		return arquivoRepository.findAll();
	}

	public long count() {
		return arquivoRepository.count();
	}

	public Optional<Arquivo> findById(String id) {
		return arquivoRepository.findById(id);
	}

	public void delete(String id) {
		arquivoRepository.deleteById(id);
	}

}
