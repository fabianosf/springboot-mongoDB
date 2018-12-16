/*
 * Produto SpringBoot utilizando Banco de Dados MongoDB
 */

package br.com.mongo;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import br.com.mongo.entity.Arquivo;
import br.com.mongo.repository.ArquivoRepository;
/*   
 * @author: <a href="mailto:fabiano.freitas@gmail.com">Fabiano Freitas</a> 
 * github: fabianosf
 * 
 **/

@SpringBootApplication
public class SpringbootMongoApplication implements CommandLineRunner {

	@Autowired
	private ArquivoRepository arquivoRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Arquivo arq1 = new Arquivo("Java", "Livro de Programacao");
		Arquivo arq2 = new Arquivo("PHP", "Livro de Programacao web");
		Arquivo arq3 = new Arquivo("HTML", "Linguagem de Marcacao");
		// criando uma lista automatica
		arquivoRepository.saveAll(Arrays.asList(arq1, arq2, arq3));

	}

}
